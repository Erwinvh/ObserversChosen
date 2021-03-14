package Messages;

public class ConnectMessage implements Message{


    public MessageType MessageType = Messages.MessageType.CONNECT;
    public String PlayerID;


    public ConnectMessage(String playerID) {
        PlayerID = playerID;
    }

    @Override
    public MessageType getMessageType() {
        return null;
    }

    public String getPlayerID() {
        return PlayerID;
    }

}
