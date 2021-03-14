package com.example.observerschosen.GUI.Items.AdapterItems;

public class TeamsItem {

    public String TeamName;
    public String TeamImagePath;
    public String LastActive;
    public int TeamLevel;
    public int MemberAmount;

    public TeamsItem(String teamName, String teamImagePath, String lastActive, int teamLevel, int memberAmount) {
        TeamName = teamName;
        TeamImagePath = teamImagePath;
        LastActive = lastActive;
        TeamLevel = teamLevel;
        MemberAmount = memberAmount;
    }

    public String getTeamName() {
        return TeamName;
    }

    public String getTeamImagePath() {
        return TeamImagePath;
    }

    public String getLastActive() {
        return LastActive;
    }

    public int getTeamLevel() {
        return TeamLevel;
    }

    public int getMemberAmount() {
        return MemberAmount;
    }
}
