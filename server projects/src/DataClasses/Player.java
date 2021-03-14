package DataClasses;

public class Player {

    public String PlayerID;
    public int Level;
    public String Image;
    public String PlayerName;

    public Player(String playerID, String name, int level, String image){
        this.PlayerID = playerID;
        this.PlayerName = name;
        this.Level = level;
        this.Image = image;


    }


    public String getPlayerID() {
        return PlayerID;
    }
}
