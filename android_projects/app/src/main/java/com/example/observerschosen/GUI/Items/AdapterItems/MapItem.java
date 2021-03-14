package com.example.observerschosen.GUI.Items.AdapterItems;

import com.example.observerschosen.GUI.Items.UpgradeCost;

import java.util.LinkedList;

public class MapItem {

    public String MapName;
    public int MapLevel;
    public LinkedList<UpgradeCost> upgradeCosts;

    public MapItem(String mapName, int mapLevel, LinkedList<UpgradeCost> upgradeCosts) {
        MapName = mapName;
        MapLevel = mapLevel;
        this.upgradeCosts = upgradeCosts;
    }

    public String getMapName() {
        return MapName;
    }

    public int getMapLevel() {
        return MapLevel;
    }

    public LinkedList<UpgradeCost> getUpgradeCosts() {
        return upgradeCosts;
    }

    public String getCurrentUpgradeCost(){

        return "something";
    }
}
