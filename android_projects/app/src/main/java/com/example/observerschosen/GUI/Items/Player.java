package com.example.observerschosen.GUI.Items;

public class Player {

    public String playerName;
    public String Race;
    public String Age;

    public int xpLimit;
    public int level;
    public int xp;
    public int health;
    public int stamina;
    public int Energy;
    public int OP;
    public int healthlimit;
    public int staminalimit;
    public int energylimit;
    public int oplimit;

    public int BodyPosition;
    public int SkinTone;
    public int EyePosition;
    public int HairPosition;
    public int hairColourPosition;
    public int RacePosition;

    public String LeftWeaponsImage;
    public String HelmetImage;
    public String RightWeaponImage;
    public String BootsImage;
    public String TrousersImage;
    public String TorsoImage;
    public String GauntletsImage;
    public String SpecialImage;


    public Player(String playerName, String race, String age, int xpLimit, int level, int xp, int health, int stamina, int energy, int OP, int healthlimit, int staminalimit, int energylimit, int oplimit, int bodyPosition, int skinTone, int eyePosition, int hairPosition, int hairColourPosition, int racePosition, String leftWeaponsImage, String helmetImage, String rightWeaponImage, String bootsImage, String trousersImage, String torsoImage, String gauntletsImage, String specialImage) {
        this.playerName = playerName;
        Race = race;
        Age = age;
        this.xpLimit = xpLimit;
        this.level = level;
        this.xp = xp;
        this.health = health;
        this.stamina = stamina;
        Energy = energy;
        this.OP = OP;
        this.healthlimit = healthlimit;
        this.staminalimit = staminalimit;
        this.energylimit = energylimit;
        this.oplimit = oplimit;
        BodyPosition = bodyPosition;
        SkinTone = skinTone;
        EyePosition = eyePosition;
        HairPosition = hairPosition;
        this.hairColourPosition = hairColourPosition;
        RacePosition = racePosition;
        LeftWeaponsImage = leftWeaponsImage;
        HelmetImage = helmetImage;
        RightWeaponImage = rightWeaponImage;
        BootsImage = bootsImage;
        TrousersImage = trousersImage;
        TorsoImage = torsoImage;
        GauntletsImage = gauntletsImage;
        SpecialImage = specialImage;
    }


    public String getPlayerName() {
        return playerName;
    }

    public String getRace() {
        return Race;
    }

    public String getAge() {
        return Age;
    }

    public int getXpLimit() {
        return xpLimit;
    }

    public int getLevel() {
        return level;
    }

    public int getXp() {
        return xp;
    }

    public int getHealth() {
        return health;
    }

    public int getStamina() {
        return stamina;
    }

    public int getEnergy() {
        return Energy;
    }

    public int getOP() {
        return OP;
    }

    public int getHealthlimit() {
        return healthlimit;
    }

    public int getStaminalimit() {
        return staminalimit;
    }

    public int getEnergylimit() {
        return energylimit;
    }

    public int getOplimit() {
        return oplimit;
    }

    public int getBodyPosition() {
        return BodyPosition;
    }

    public int getSkinTone() {
        return SkinTone;
    }

    public int getEyePosition() {
        return EyePosition;
    }

    public int getHairPosition() {
        return HairPosition;
    }

    public int getHairColourPosition() {
        return hairColourPosition;
    }

    public int getRacePosition() {
        return RacePosition;
    }

    public String getLeftWeaponsImage() {
        return LeftWeaponsImage;
    }

    public String getHelmetImage() {
        return HelmetImage;
    }

    public String getRightWeaponImage() {
        return RightWeaponImage;
    }

    public String getBootsImage() {
        return BootsImage;
    }

    public String getTrousersImage() {
        return TrousersImage;
    }

    public String getTorsoImage() {
        return TorsoImage;
    }

    public String getGauntletsImage() {
        return GauntletsImage;
    }

    public String getSpecialImage() {
        return SpecialImage;
    }
}
