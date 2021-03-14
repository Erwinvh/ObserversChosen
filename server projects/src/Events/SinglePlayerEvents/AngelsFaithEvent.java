package Events.SinglePlayerEvents;

import DataClasses.GPSCoordinate;
import Events.Event;
import Events.EventType;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class AngelsFaithEvent implements Event {

    public String EventID;
    public EventType EventType;
    public int XP;
    public LocalDateTime EndTime;
    public GPSCoordinate GPSCoordinate;
    public ArrayList<String> participants = new ArrayList<>();
    public boolean rewarded;





    public AngelsFaithEvent(){



        generateRewardValue();
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

    public void addParticpant(String participantID){
        if (!ContainsParticpant(participantID)){
            participants.add(participantID);
        }
    }

    public boolean ContainsParticpant(String participantID){
        for (String ids : participants){
            if (ids.equals(participantID)){
                return true;
            }
        }
        return false;
    }

    public void removeParticpant(String participantID){
        int position = getParticipantByID(participantID);
        if (position!=-1){
            participants.remove(position);
        }
    }

    public int getParticipantByID(String participantID){
        int position = -1;
        for (String id : participants) {
            if (id.equals(participantID)){
                position = participants.indexOf(id);
            }
        }
        return position;
    }

    public ArrayList<String> getParticipants() {
        return participants;
    }

    public boolean isRewarded() {
        return rewarded;
    }

    public void generateRewardValue(){
        //TODO: random
    }



}
