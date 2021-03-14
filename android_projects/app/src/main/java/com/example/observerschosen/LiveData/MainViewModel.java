package com.example.observerschosen.LiveData;

import com.example.observerschosen.GUI.Items.AdapterItems.AchievementItem;
import com.example.observerschosen.GUI.Items.AdapterItems.CharItem;
import com.example.observerschosen.GUI.Items.AdapterItems.ChatMessageItem;
import com.example.observerschosen.GUI.Items.AdapterItems.EquipItem;
import com.example.observerschosen.GUI.Items.AdapterItems.FriendsItem;
import com.example.observerschosen.GUI.Items.AdapterItems.MapItem;
import com.example.observerschosen.GUI.Items.AdapterItems.PlayerItem;
import com.example.observerschosen.GUI.Items.AdapterItems.QuestItem;
import com.example.observerschosen.GUI.Items.AdapterItems.QuestObjectiveItem;
import com.example.observerschosen.GUI.Items.AdapterItems.QuestRewardItem;
import com.example.observerschosen.GUI.Items.AdapterItems.TeamsItem;
import com.example.observerschosen.GUI.Items.AdapterItems.ToolItem;
import com.example.observerschosen.GUI.Items.AdapterItems.TradesItem;
import com.example.observerschosen.GUI.Items.Character;
import com.example.observerschosen.GUI.Items.Equiptment;
import com.example.observerschosen.GUI.Items.Player;
import com.example.observerschosen.GUI.Items.UpgradeCost;

import java.util.LinkedList;

public class MainViewModel {


    public MainViewModel() {
    }


    public String getPlayerFriendCode() {
        //TODO: let this go through the repo and DB

        return "123456789";
    }


    public LinkedList<CharItem> getEnemyList() {
        //TODO: retrieve from DB
        LinkedList<CharItem> test = new LinkedList<>();
        test.add(new CharItem("Reaper", "Path.jpg", true, new Character("Helena", "blacksmith", "Helena is a blacksmith", 20, 3, 20)));
        test.add(new CharItem("Reaper", "Path.jpg", true, new Character("Helena", "blacksmith", "Helena is a blacksmith", 20, 3, 20)));
        test.add(new CharItem("Reaper", "Path.jpg", false, new Character("Helena", "blacksmith", "Helena is a blacksmith", 20, 3, 20)));
        test.add(new CharItem("Reaper", "Path.jpg", false, new Character("Helena", "blacksmith", "Helena is a blacksmith", 20, 3, 20)));
        test.add(new CharItem("Reaper", "Path.jpg", true, new Character("Helena", "blacksmith", "Helena is a blacksmith", 20, 3, 20)));


        return test;
    }

    public LinkedList<CharItem> getCharacterList() {
        //TODO: retrieve from DB
        LinkedList<CharItem> test = new LinkedList<>();
        test.add(new CharItem("Scribe", "Path.jpg", true, new Character("Helena", "blacksmith", "Helena is a blacksmith", 20, 3, 30,35)));
        test.add(new CharItem("Nia", "Path.jpg", true, new Character("Helena", "blacksmith", "Helena is a blacksmith", 20, 3, 30,35)));
        test.add(new CharItem("Vivian", "Path.jpg", false, new Character("Helena", "blacksmith", "Helena is a blacksmith", 20, 3, 30,35)));
        test.add(new CharItem("Reaper", "Path.jpg", false, new Character("Helena", "blacksmith", "Helena is a blacksmith", 20, 3, 30,35)));
        test.add(new CharItem("Reaper", "Path.jpg", true, new Character("Helena", "blacksmith", "Helena is a blacksmith", 20, 3, 30,35)));


        return test;



    }

    public LinkedList<CharItem> getNPCList() {
        //TODO: retrieve from DB
        LinkedList<CharItem> test = new LinkedList<>();
        test.add(new CharItem("Helena", "Path.jpg", true, new Character("Helena", "blacksmith", "Helena is a blacksmith", 20, 3)));
        test.add(new CharItem("Samuel", "Path.jpg", true, new Character("Samuel", "generalgoods", "Samuel is the generalgoods seller", 30, 4)));
        test.add(new CharItem("Observers support", "Path.jpg", false, new Character("Observers support", "obs", "This man can give you the support of the observer", 2, 1)));
        test.add(new CharItem("Monika", "Path.jpg", false, new Character("Monika", "monika", "Monika", 9999, 99)));
        test.add(new CharItem("Reaper", "Path.jpg", true, new Character("Reaper", "reaper", "Death itself", 10, 3)));

        return test;
    }

    public LinkedList<CharItem> getItemList() {
        //TODO: retrieve from DB
        LinkedList<CharItem> test = new LinkedList<>();

        test.add(new CharItem("Iron sword", "Path.jpg", true, new Equiptment(3, 4, 20, 2, "Iron Sword", "A simple plain sword", "ironsword", false)));
        test.add(new CharItem("Hardwood bow", "Path.jpg", true, new Equiptment(3, 0, 20, 2, "Hardwood bow", "A simple plain bow", "hardwoodbow", false)));
        test.add(new CharItem("iron armor", "Path.jpg", false, new Equiptment(5, 40, 0, 2, "Iron armor", "A simple plain armor", "ironarmor", false)));
        test.add(new CharItem("iron helmet", "Path.jpg", false, new Equiptment(1, 23, 20, 2, "Iron helmet", "A simple plain helmet", "ironhelmet", false)));
        test.add(new CharItem("iron gauntlets", "Path.jpg", true, new Equiptment(6, 14, 20, 2, "Iron gauntlets", "A simple plain gauntlet", "irongauntlet", false)));

        return test;
    }

    public LinkedList<TeamsItem> getTeamsList() {
        //TODO: retrieve from DB
        LinkedList<TeamsItem> test = new LinkedList<>();
        test.add(new TeamsItem("Teamname", "Path", "Yesterday", 1, 2));
        test.add(new TeamsItem("another teamName", "path", "Today", 3, 8));

        return test;
    }

    public LinkedList<FriendsItem> getFriendsList() {
        //TODO: retrieve from DB
        LinkedList<FriendsItem> test = new LinkedList<>();
        test.add(new FriendsItem("path", "John", 1, "Yesterday", 10));
        test.add(new FriendsItem("path", "parker", 1, "Yesterday", 10));
        test.add(new FriendsItem("path", "felix", 1, "Yesterday", 10));
        test.add(new FriendsItem("path", "jenny", 1, "Yesterday", 10));
        return test;
    }

    public LinkedList<TradesItem> getTradesList() {
        //TODO: retrieve from DB
        LinkedList<TradesItem> test = new LinkedList<>();
        test.add(new TradesItem("john", "You", "pending", "path", "path", 200, 200));
        test.add(new TradesItem("john", "You", "pending", "path", "path", 200, 200));
        test.add(new TradesItem("john", "You", "pending", "path", "path", 200, 200));
        return test;
    }

    public PlayerItem getAchievementItem() {
        //TODO: retrieve from DB
        LinkedList<AchievementItem> achievementItems = new LinkedList<>();
        achievementItems.add(new AchievementItem("TaskMaster", "Path", true));
        achievementItems.add(new AchievementItem("TaskMaster", "Path", true));
        achievementItems.add(new AchievementItem("TaskMaster", "Path", true));
        achievementItems.add(new AchievementItem("TaskMaster", "Path", false));
        achievementItems.add(new AchievementItem("TaskMaster", "Path", true));
        achievementItems.add(new AchievementItem("TaskMaster", "Path", true));
        achievementItems.add(new AchievementItem("TaskMaster", "Path", true));
        achievementItems.add(new AchievementItem("TaskMaster", "Path", true));
        achievementItems.add(new AchievementItem("TaskMaster", "Path", true));
        achievementItems.add(new AchievementItem("TaskMaster", "Path", true));
        achievementItems.add(new AchievementItem("TaskMaster", "Path", false));
        achievementItems.add(new AchievementItem("TaskMaster", "Path", true));
        achievementItems.add(new AchievementItem("TaskMaster", "Path", true));
        achievementItems.add(new AchievementItem("TaskMaster", "Path", true));
        return new PlayerItem(achievementItems);
    }

    public PlayerItem getPlayerItem() {
        //TODO: retrieve from DB
        //TODO: set this correctly and possibly simplefy
        return new PlayerItem(new Player("Hello World", "Terran", "23", 500, 3, 266, 30, 50, 40, 20, 100, 100, 100, 50, 2,2,2,2,2,2,"lefttest", "helmettest", "righttest", "bootstest", "trousertest", "torsotest", "gauntlettest", "specialtest" ));
    }

    public LinkedList<QuestItem> getStoryQuests() {
        //TODO: retrieve from DB
        LinkedList<QuestItem> test = new LinkedList<>();
        test.add(new QuestItem("Story1", "SQ1", "path", "this is the first quest", true));
        test.add(new QuestItem("Story2", "SQ2", "path", "this is the second quest", false));
        test.add(new QuestItem("Story3", "SQ3", "path", "this is the third quest", false));
        test.add(new QuestItem("Story4", "SQ4", "path", "this is the fourth quest", false));
        test.add(new QuestItem("Story5", "SQ5", "path", "this is the fifth quest", false));
        return test;

    }

    public LinkedList<QuestItem> getGlobalEventQuests() {
        //TODO: retrieve from DB
        LinkedList<QuestItem> test = new LinkedList<>();
        test.add(new QuestItem("Story1", "GQ1", "path", "this is the first quest", true, "Now"));
        test.add(new QuestItem("Story2", "GQ2", "path", "this is the second quest", false));
        test.add(new QuestItem("Story3", "GQ3", "path", "this is the third quest", false));
        test.add(new QuestItem("Story4", "GQ4", "path", "this is the fourth quest", false));
        test.add(new QuestItem("Story5", "GQ5", "path", "this is the fifth quest", false));
        return test;
    }

    public LinkedList<QuestItem> getFriendQuests() {
        //TODO: retrieve from DB
        LinkedList<QuestItem> test = new LinkedList<>();
        test.add(new QuestItem("Story1", "FQ1", "path", "this is the first quest", false));
        test.add(new QuestItem("Story2", "FQ2", "path", "this is the second quest", false));
        test.add(new QuestItem("Story3", "FQ3", "path", "this is the third quest", true));
        test.add(new QuestItem("Story4", "FQ4", "path", "this is the fourth quest", false));
        test.add(new QuestItem("Story5", "FQ5", "path", "this is the fifth quest", false));
        return test;
    }

    public LinkedList<EquipItem> getSpecificEquipList(String focus) {
        //TODO: retrieve from DB
        LinkedList<EquipItem> test = new LinkedList<>();
        test.add(new EquipItem("Helmet", "iron", "Terran", "Defense", "Speed", 10,20, 2, false));
        test.add(new EquipItem("steel helmet", "steel", "Terran", "Defense", "Speed", 10,20, 2, false));
        test.add(new EquipItem("Crystalline helmet", "Crystalline", "Crystolian", "Defense", "Speed", 10,20, 2, true));
        test.add(new EquipItem("Angelic helmet", "Angelic", "Angelic", "Defense", "Speed", 10,20, 2, false));

        return test;
    }

    public LinkedList<ChatMessageItem> getFriendChatMessages(FriendsItem subject) {
        //TODO: retrieve from DB
        LinkedList<ChatMessageItem> test = new LinkedList<>();
        test.add(new ChatMessageItem("Player", "somebody", "test123"));
        test.add(new ChatMessageItem("Player2", "somebody", "test456"));

        return test;
    }

    public LinkedList<QuestRewardItem> getQuestRewards(QuestItem subject) {
        //TODO: retrieve from DB
        LinkedList<QuestRewardItem> test = new LinkedList<>();
        test.add(new QuestRewardItem("path", "Wood", 20));
        test.add(new QuestRewardItem("path", "Stone", 30));

        return test;
    }

    public LinkedList<QuestObjectiveItem> getQuestObjectives(QuestItem subject) {
        //TODO: retrieve from DB
        LinkedList<QuestObjectiveItem> test = new LinkedList<>();
        test.add(new QuestObjectiveItem("Player", 20, 100, "path"));
        test.add(new QuestObjectiveItem("Player2", 80, 100, "path"));
        return test;
    }

    public LinkedList<MapItem> getMapList() {
        //TODO: retrieve from DB
        LinkedList<MapItem> test = new LinkedList<>();
        test.add(new MapItem("Terra", 2, new LinkedList<UpgradeCost>()));
        test.add(new MapItem("Demona", 1, new LinkedList<UpgradeCost>()));
        test.add(new MapItem("Crystolia", 0, new LinkedList<UpgradeCost>()));
        return test;

    }

    public LinkedList<ToolItem> getTools() {
        //TODO: retrieve from DB
        LinkedList<ToolItem> test = new LinkedList<>();
        test.add(new ToolItem(2, "Axe", new LinkedList<UpgradeCost>()));
        test.add(new ToolItem(3, "Pickaxe", new LinkedList<UpgradeCost>()));
        test.add(new ToolItem(4, "shovel", new LinkedList<UpgradeCost>()));
        return test;
    }

    public LinkedList<FriendsItem> getTeamMembersList(TeamsItem subject) {
        //TODO: retrieve from DB
        LinkedList<FriendsItem> test = new LinkedList<>();
        test.add(new FriendsItem("path", "john", 0, "now", 2));
        test.add(new FriendsItem("path", "Mika", 0, "now", 2));
        test.add(new FriendsItem("path", "Sara", 0, "now", 2));
        return test;
    }

    public LinkedList<ChatMessageItem> getTeamChatMessages(TeamsItem subject) {
        //TODO: retrieve from DB
        LinkedList<ChatMessageItem> test = new LinkedList<>();
        test.add(new ChatMessageItem("Player", "somebody", "test123"));
        test.add(new ChatMessageItem("Player2", "somebody", "test456"));
        return test;
    }

    public String getOwnedMaterialAmount(String material) {
        //TODO: retrieve from DB
        return "test";
    }

    public String getToolInfo(String material) {
        //TODO: retrieve from DB
        return "test";
    }

    public String getMaterialCollectionReward() {
        //TODO: retrieve from Logic
        return "test";
    }

    public void startMaterialCollection() {
        //TODO: start new instance of the materialmechanics
    }
}
