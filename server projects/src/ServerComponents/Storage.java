package ServerComponents;

import DataClasses.GPSCoordinate;
import DataClasses.Player;

import java.util.Dictionary;
import java.util.Map;

public class Storage {

    public Map<String, Player> playerFriendCodeDisctionary;
    public Map<String, GPSCoordinate> EventDictionary;


    public Storage(Server server){

    }

    public Map<String, GPSCoordinate> getEventDictionary() {
        return EventDictionary;
    }

    public Map<String, Player> getPlayerFriendCodeDisctionary() {
        return playerFriendCodeDisctionary;
    }

    public Player getPlayer(String friendCode){
        return playerFriendCodeDisctionary.get(friendCode);
    }

    public void addPlayer(Player player, String friendCode){
        playerFriendCodeDisctionary.put(friendCode, player);
    }

    public boolean containsPlayerID(String PlayerID){
        for (String friendCode : playerFriendCodeDisctionary.keySet()) {
            if (playerFriendCodeDisctionary.get(friendCode).getPlayerID().equals(PlayerID)){
                return true;
            }
        }
        return false;
    }

    public boolean conatainsFriendCode(String friendcode){
        return playerFriendCodeDisctionary.containsKey(friendcode);
    }


}
