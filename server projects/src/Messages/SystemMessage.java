package Messages;

public class SystemMessage implements Message{

    public MessageType messageType;
    public String SystemMessage;


    public SystemMessage(String systemMessage) {
        SystemMessage = systemMessage;
    }

    public String getSystemMessage() {
        return SystemMessage;
    }

    @Override
    public MessageType getMessageType() {
        return messageType;
    }
}
