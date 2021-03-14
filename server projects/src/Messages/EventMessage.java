package Messages;

public class EventMessage implements Message{

    public MessageType messageType = MessageType.EVENT;
    public String eventID;
    public String eventStatus;

    public EventMessage(String eventID, String eventStatus) {
        this.eventID = eventID;
        this.eventStatus = eventStatus;
    }


    @Override
    public MessageType getMessageType() {
        return messageType;
    }

    public String getEventID() {
        return eventID;
    }

    public String getEventStatus() {
        return eventStatus;
    }


}
