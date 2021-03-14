package com.example.observerschosen.GUI.Items.AdapterItems;

public class EquipItem {

public String Name;
public String SetName;
public String Origin;
public String PrimaryStat;
public String SecondaryStat;
public int PriStat;
public int SecStat;
public int EquipLevel;
public boolean isCurrent;

    public EquipItem(String name, String setName, String origin, String primaryStat, String secondaryStat, int priStat, int secStat, int equipLevel, boolean isCurrent) {
        Name = name;
        SetName = setName;
        Origin = origin;
        PrimaryStat = primaryStat;
        SecondaryStat = secondaryStat;
        PriStat = priStat;
        SecStat = secStat;
        EquipLevel = equipLevel;
        this.isCurrent = isCurrent;
    }

    public String getName() {
        return Name;
    }

    public String getSetName() {
        return SetName;
    }

    public String getOrigin() {
        return Origin;
    }

    public String getPrimaryStat() {
        return PrimaryStat;
    }

    public String getSecondaryStat() {
        return SecondaryStat;
    }

    public int getPriStat() {
        return PriStat;
    }

    public int getSecStat() {
        return SecStat;
    }

    public int getEquipLevel() {
        return EquipLevel;
    }

    public boolean isCurrent() {
        return isCurrent;
    }
}
