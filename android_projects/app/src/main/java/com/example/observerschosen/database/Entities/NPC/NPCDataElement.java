package com.example.observerschosen.database.Entities.NPC;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

/**
 * Room entity which describes a Race.
 */
@Entity(tableName = "NPCDataElement", indices = {@Index("id"), @Index(value = {"IsComplete"})})
public class NPCDataElement {

    @NonNull
    @PrimaryKey
    private final String id;

    @ColumnInfo(name = "IsComplete")
    private boolean isComplete;

    public NPCDataElement(@NonNull String id, boolean isComplete) {
        this.id = id;
        this.isComplete = isComplete;
    }

    @NonNull
    public String getId() {
        return id;
    }

    public boolean isComplete() {
        return isComplete;
    }

    public void setComplete(boolean complete) {
        isComplete = complete;
    }






}
