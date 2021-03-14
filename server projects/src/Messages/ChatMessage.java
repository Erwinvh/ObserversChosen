package Messages;

public class ChatMessage implements Message{

    public String Receiver;
    public boolean isPrivate;

    public String ChatMessage;
    public MessageType MessageType = Messages.MessageType.CHAT;
    //TODO: look at receiver


    public ChatMessage(String receiver, boolean isPrivate, String chatMessage) {
        Receiver = receiver;
        this.isPrivate = isPrivate;
        ChatMessage = chatMessage;
    }

    @Override
    public MessageType getMessageType() {
        return null;
    }

    public String getChatMessage() {
        return ChatMessage;
    }

    public String getReceiver() {
        return Receiver;
    }

    public boolean isPrivate() {
        return isPrivate;
    }

}
