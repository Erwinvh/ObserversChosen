package com.example.observerschosen.GUI.Items.AdapterItems;

public class FriendsItem {

    public String FriendImagePath;
    public String FriendName;
    public int FriendLevel;
    public String lastActive;
    public int FriendshipLevel;

    public FriendsItem(String friendImagePath, String friendName, int friendLevel, String lastActive, int FriendshipLevel) {
        FriendImagePath = friendImagePath;
        FriendName = friendName;
        FriendLevel = friendLevel;
        this.lastActive = lastActive;
        this.FriendshipLevel = FriendshipLevel;
    }

    public String getFriendImagePath() {
        return FriendImagePath;
    }

    public String getFriendName() {
        return FriendName;
    }

    public int getFriendLevel() {
        return FriendLevel;
    }

    public String getLastActive() {
        return lastActive;
    }

    public int getFriendshipLevel() {
        return FriendshipLevel;
    }
}
