package DataHandlers;

import Generators.IDGenerator;
import Messages.ConnectMessage;
import Messages.IDGeneratorMessage;
import ServerComponents.Client;

public class ConnectHandler {


    public static void handleConnectMessage(Client client, ConnectMessage connectMessage) {
        String PlayerID = connectMessage.getPlayerID();
        if (PlayerID.equals("")) {
            PlayerID = IDGenerator.GeneratePlayerID();
            String FriendCode = IDGenerator.GenerateFriendCode();
            IDGeneratorMessage IDMessage = new IDGeneratorMessage(PlayerID, FriendCode);
            //TODO: create new playerID and FriendID
            //TODO: send new PlayerID to player
        }
        client.setPlayerID(PlayerID);
        //TODO: send out a systemMessage for OK
    }
}
