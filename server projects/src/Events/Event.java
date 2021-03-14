package Events;

import DataClasses.GPSCoordinate;

import java.time.LocalDateTime;

public interface Event {

    int getXP();

    void setXP(int XP);

    GPSCoordinate getGPSCoordinate();

    LocalDateTime getEndTime();

    EventType getEventType();

    String getEventID();

}
