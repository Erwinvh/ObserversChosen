package Events.SinglePlayerEvents;

import DataClasses.GPSCoordinate;
import Events.Event;
import Events.EventType;

import java.time.LocalDateTime;

public class RunEvent implements Event {

    public String EventID;
    public EventType EventType;
    public int XP;
    public LocalDateTime EndTime;
    public GPSCoordinate GPSCoordinate;




    public RunEvent(){

    }

    @Override
    public int getXP() {
        return XP;
    }

    @Override
    public void setXP(int XP) {

    }

    @Override
    public GPSCoordinate getGPSCoordinate() {
        return GPSCoordinate;
    }

    @Override
    public LocalDateTime getEndTime() {
        return EndTime;
    }

    @Override
    public EventType getEventType() {
        return EventType;
    }

    @Override
    public String getEventID() {
        return EventID;
    }
}
