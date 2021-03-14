package com.example.observerschosen.GUI.Items.AdapterItems;

import com.example.observerschosen.GUI.Items.Character;
import com.example.observerschosen.GUI.Items.Equiptment;

public class CharItem {

    public String CharacterName;
    public String ImagePath;
    public boolean Unlocked;
    public Equiptment equiptment;
    public Character character;

    public CharItem(String name, String imagePath, boolean unlocked, Character character){
        this.CharacterName = name;
        this.ImagePath = imagePath;
        this.Unlocked = unlocked;
        this.character = character;
    }

    public CharItem(String name, String imagePath, boolean unlocked, Equiptment equiptment){
        this.CharacterName = name;
        this.ImagePath = imagePath;
        this.Unlocked = unlocked;
        this.equiptment = equiptment;
    }

    public String getImagePath() {
        return ImagePath;
    }

    public String getCharacterName() {
        return CharacterName;
    }

    public boolean isUnlocked() {
        return Unlocked;
    }

    public Equiptment getEquiptment() {
        return equiptment;
    }

    public Character getCharacter(){
        return character;
    }
}
