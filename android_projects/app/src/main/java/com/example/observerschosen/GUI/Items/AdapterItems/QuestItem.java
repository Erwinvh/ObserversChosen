package com.example.observerschosen.GUI.Items.AdapterItems;

public class QuestItem {

    public String QuestName;
    public String imagePath;
    public String QuestDescription;
    public boolean isCurrent;
    public String EndDateTime = "";
    public String QuestID;

    public QuestItem(String name, String QuestID, String image, String descrip, boolean current){
        this.QuestName = name;
        this.imagePath = image;
        this.QuestDescription = descrip;
        this.isCurrent = current;
        this.QuestID = QuestID;

    }

    public QuestItem(String name, String QuestID, String image, String descrip, boolean current, String EndDateTime){
        this.QuestName = name;
        this.imagePath = image;
        this.QuestDescription = descrip;
        this.isCurrent = current;
        this.EndDateTime = EndDateTime;
        this.QuestID = QuestID;

    }

    public String getImagePath() {
        return imagePath;
    }

    public String getQuestDescription() {
        return QuestDescription;
    }

    public String getQuestName() {
        return QuestName;
    }

    public boolean isCurrent() {
        return isCurrent;
    }

    public String getEndDateTime() {
        return EndDateTime;
    }

    public String getQuestID() {
        return QuestID;
    }
}
