package Messages;

public class IDGeneratorMessage implements Message{

    public MessageType messageType = MessageType.IDGENERATE;
    public String PlayerID;
    public String FriendCode;

    public IDGeneratorMessage(String playerID, String friendCode) {
        PlayerID = playerID;
        FriendCode = friendCode;
    }

    public String getPlayerID() {
        return PlayerID;
    }

    public String getFriendCode() {
        return FriendCode;
    }

    @Override
    public MessageType getMessageType() {
        return messageType;
    }
}
