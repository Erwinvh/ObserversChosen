package com.example.observerschosen.GUI.Items.AdapterItems;

import com.example.observerschosen.GUI.Items.AdapterItems.AchievementItem;
import com.example.observerschosen.GUI.Items.Player;

import java.util.LinkedList;

public class PlayerItem {

    public String PlayerItemType;
    public LinkedList<AchievementItem> achievementsList;
    public Player player;


    public PlayerItem(Player player){
        PlayerItemType = "Player";
        this.player = player;
    }

    public PlayerItem(LinkedList<AchievementItem> achievements){
        PlayerItemType = "Achievements";
        achievementsList = achievements;
    }

    public LinkedList<AchievementItem> getAchievementsList() {
        return achievementsList;
    }

    public Player getPlayer() {
        return player;
    }

    public String getPlayerItemType() {
        return PlayerItemType;
    }
}
