package Messages;

import DataClasses.GPSCoordinate;

public class GPSUpdateLocationMessage implements Message{

    public MessageType MessageType;
    //TODO: look at receiver


    public GPSUpdateLocationMessage(String Name, GPSCoordinate GPSCoordinate){

    }


    @Override
    public MessageType getMessageType() {
        return null;
    }




}
