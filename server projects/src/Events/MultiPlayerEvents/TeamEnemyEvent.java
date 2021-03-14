package Events.MultiPlayerEvents;

import DataClasses.GPSCoordinate;
import Events.EventType;

import java.time.LocalDateTime;

public class TeamEnemyEvent implements TeamEvent{

    public String EventID;
    public EventType EventType;
    public int XP;
    public LocalDateTime EndTime;
    public GPSCoordinate GPSCoordinate;
    public int MinimalTeamSize;
    public int MaxTeamSize;


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

    @Override
    public int getMaxTeamSize() {
        return MaxTeamSize;
    }

    @Override
    public int getMinimalTeamSize() {
        return MinimalTeamSize;
    }
}
