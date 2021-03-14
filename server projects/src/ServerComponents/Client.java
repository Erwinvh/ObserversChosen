package ServerComponents;

import DataClasses.Player;
import DataHandlers.*;
import Messages.*;

import javax.sound.sampled.AudioFormat;

public class Client {


    public Player player;
    private TcpClient tcpClient;
    private NetworkStream stream;
    private boolean running;
    public Server server;

    public Client(Server server){

        this.server = server;
        running = true;
        Thread listenerThread = new Thread(); //TODO: set listener as thread item
        listenerThread.start();
    }




    public void Listener(){
        Byte[] lengtebytes = new byte[2];
        while (running)
        {
            for (int i = 0; i < 2; i++)
            {
                lengtebytes[i] = (byte)stream.ReadByte();
            }
            uint bytes = BitConverter.ToUInt16(lengtebytes);
            bytes += 2;
            Byte[] bytebuffer = new byte[bytes];
            for (int i = 0; i < bytes; i++)
            {
                bytebuffer[i] = (byte)stream.ReadByte();
            }
            System.out.println("Received packet!");                  //TODO!!
            handleData(bytebuffer);
        }
        stream.Close();

        tcpClient.Close();
        //TODO: close off the streams
        server.getClients().remove(this);
    }


    public void handleData(String pakketData){
        System.out.println("Got a packet: " + pakketData);
        //TODO: find equavalent of JOBject
        JObject pakket = JObject.Parse(pakketData);
        MessageType messageType;
        Enum.TryParse((string)pakket.GetValue("MessageID"), out messageId);
        String username = (string) pakket.GetValue("Username");
        System.out.println("username has been set to:" + username + " for message" + messageType.ToString());
        switch (messageType){

            case CONNECT:
                //TODO: transform incoming item to connectMessage
                ConnectMessage connectMessage = new ConnectMessage("playerID");
                ConnectHandler.handleConnectMessage(this, connectMessage);
                break;

            case CHAT:
                //TODO: check logic with static
                //TODO: transform incoming item to chatmessage
                ChatMessage chatMessage = new ChatMessage("receiver", false, "message");
                ChatHandler.handleChatMessage(this, chatMessage);
                break;

            case SYSTEM:
                //TODO: transform incoming item to systemMessage
                SystemMessage systemMessage = new SystemMessage("Systemmessage");
                SystemHandler.handleSystemMessage(this, systemMessage);
                break;

            case EVENT:
                //TODO: transform incoming item to EventMessage
                EventMessage eventMessage = new EventMessage("EventID", "EventStatus");
                EventHandler.handleEventMessage(this, eventMessage);
                break;

            case GROUP:
                //TODO: transform incoming item to GroupMessage
                GroupMessage groupMessage = new GroupMessage();
                GroupHandler.handleGroupMessage(this, groupMessage);
                break;

            case TRADE:
                //TODO: transform incoming item to tradeMessage
                TradeMessage tradeMessage = new TradeMessage();
                TradeHandler.handleTradeMessage(this, tradeMessage);
                break;

            case FRIEND:
                //TODO: transform incoming item to friendMessage
                FriendMessage friendMessage = new FriendMessage();
                FriendHandler.handleFriendMessage(this, friendMessage);
                break;

            case IDGENERATE:

                break;

            case TASKUPDATE:

                break;

            case EVENTUPDATE:

                break;

            case BATTLEUPDATE:

                break;

            case TEAMGPSUPDATE:

                break;


        }

    }








    public void Write(){
        int length = data.Length;
        Byte[] lengteBytes = BitConverter.GetBytes(length);

        var dataAsBytes = System.Text.Encoding.ASCII.GetBytes(data);
        var z = new Byte[lengteBytes.Length + dataAsBytes.Length];
        lengteBytes.CopyTo(z, 0);
        dataAsBytes.CopyTo(z, lengteBytes.Length);

        stream.Write(z, 0, z.Length);
        stream.Flush();


    }

    public void disconnect()
    {

        server.UserDictionary.Remove(user.name);
        Lobby enteredLobby = null;
        foreach (Lobby lobby in server.lobbyList)
        {
            if (lobby.getUser(user.name)!=null)
            {
                enteredLobby = lobby;

            }
        }
        if (enteredLobby!=null)
        {
            enteredLobby.playerQuit(user.name);
        }


        running = false;

    }


    public void setPlayerID(String playerID) {
        this.PlayerID = playerID;
    }
}
