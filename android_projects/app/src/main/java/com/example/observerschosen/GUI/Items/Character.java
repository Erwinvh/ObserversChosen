package com.example.observerschosen.GUI.Items;

public class Character {

    public String CharacterName;
    public String CharacterImage;
    public String CharType;
    public String Bio;
    public int XP;
    public int Level; // friendshiplevel for NPC and knowledge level for enemy
    public int Attack;
    public int defense;

    public Character(String characterName, String characterImage, String bio, int XP, int level) {
        CharacterName = characterName;
        CharacterImage = characterImage;
        Bio = bio;
        this.XP = XP;
        Level = level;
        CharType = "NPC";
    }

    public Character(String characterName, String characterImage, String bio, int XP, int level, int Attack) {
        CharacterName = characterName;
        CharacterImage = characterImage;
        Bio = bio;
        this.XP = XP;
        Level = level;
        CharType = "Enemy";
        this.Attack = Attack;
    }

    public Character(String characterName, String characterImage, String bio, int XP, int level, int Attack, int Defense) {
        CharacterName = characterName;
        CharacterImage = characterImage;
        Bio = bio;
        this.XP = XP;
        Level = level;
        CharType = "Companion";
        this.Attack = Attack;
        this.defense = Defense;
    }

    public String getCharacterName() {
        return CharacterName;
    }

    public String getCharacterImage() {
        return CharacterImage;
    }

    public String getCharType() {
        return CharType;
    }

    public String getBio() {
        return Bio;
    }

    public int getXP() {
        return XP;
    }

    public int getLevel() {
        return Level;
    }

    public int getAttack() {
        return Attack;
    }

    public int getDefense() {
        return defense;
    }
}
