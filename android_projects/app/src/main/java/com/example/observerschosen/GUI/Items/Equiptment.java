package com.example.observerschosen.GUI.Items;

public class Equiptment {

    public int wearingPosition;
    //0 = no position
    //1 = head
    //2 = special
    //3 = right weapon
    //3 = left weapon
    //5 = torso
    //6 = gauntlet
    //7 = trouser
    //8 = boots

    public int defense;
    public int attack;
    public int level;
    public boolean isWorn;
    public String equiptmentName;
    public String description;
    public String imagePath;

    public Equiptment(int wearingPosition, int defense, int attack, int level, String equiptmentName, String description, String imagePath, boolean isWorn) {
        this.wearingPosition = wearingPosition;
        this.defense = defense;
        this.attack = attack;
        this.level = level;
        this.equiptmentName = equiptmentName;
        this.description = description;
        this.imagePath = imagePath;
        this.isWorn = isWorn;
    }

    public int getWearingPosition() {
        return wearingPosition;
    }

    public int getDefense() {
        return defense;
    }

    public int getLevel() {
        return level;
    }

    public String getEquiptmentName() {
        return equiptmentName;
    }

    public String getDescription() {
        return description;
    }

    public String getImagePath() {
        return imagePath;
    }

    public int getAttack() {
        return attack;
    }

    public boolean isWorn() {
        return isWorn;
    }
}
