package com.example.observerschosen.database.Entities.Quest;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

/**
 * Room entity which describes a Race.
 */
@Entity(tableName = "QuestStep", indices = {@Index("QuestStepID"), @Index(value = {"QuestID"})})
public class QuestStep {

    @NonNull
    @PrimaryKey
    private final String QuestStepID;

    @ColumnInfo(name = "QuestID")
    private String QuestID;

    public QuestStep(@NonNull String QuestStepID, String QuestID) {
        this.QuestStepID = QuestStepID;
        this.QuestID = QuestID;
    }

    @NonNull
    public String getQuestStepID() {
        return QuestStepID;
    }



}
