package com.example.observerschosen.database.Entities.Quest;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.ForeignKey;
import androidx.room.Index;
import androidx.room.PrimaryKey;

/**
 * Room entity which describes a Race.
 */
@Entity(tableName = "QuestItems", indices = {@Index("QuestItemid"), @Index(value = {"IsActive"}), @Index(value = {"IsComplete"}), @Index(value = {"QuestStepID"})})
public class QuestItems {

    @NonNull
    @PrimaryKey
    private final String QuestItemid;

    @ColumnInfo(name = "IsActive")
    private boolean isActive;

    @ColumnInfo(name = "IsComplete")
    private boolean isComplete;

    @ColumnInfo(name = "QuestStepID")
    private int QuestStepID;


    public QuestItems(@NonNull String QuestItemid, boolean isActive, boolean isComplete, int QuestStepID) {
        this.QuestItemid = QuestItemid;
        this.isActive = isActive;
        this.isComplete = isComplete;
        this.QuestStepID = QuestStepID;
    }

    @NonNull
    public String getId() {
        return QuestItemid;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }

    public int getQuestStepID(){
        return QuestStepID;
    }
}
