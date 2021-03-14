package com.example.observerschosen.GUI.Items.AdapterItems;

import com.example.observerschosen.GUI.Items.UpgradeCost;

import java.util.LinkedList;

public class ToolItem {

    public int currentLevel;
    public String Name;
    public LinkedList<UpgradeCost> upgradeCosts;
    public int ToolEffect;

    public ToolItem(int currentLevel, String name, LinkedList<UpgradeCost> upgradeCosts) {
        this.currentLevel = currentLevel;
        Name = name;
        this.upgradeCosts = upgradeCosts;
    }

    public String getToolImage(){
        String imageName = Name+currentLevel;
        return imageName;
    }

    public int getCurrentLevel() {
        return currentLevel;
    }

    public String getName() {
        return Name;
    }

    public LinkedList<UpgradeCost> getUpgradeCosts() {
        return upgradeCosts;
    }


}
