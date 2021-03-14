package com.example.observerschosen.database.Entities.Quest;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;


/**
 * Room entity which describes a Race.
 */
@Entity(tableName = "Quest", indices = {@Index("id")})
public class Quest {

    @NonNull
    @PrimaryKey
    private final String questid;

    public Quest(@NonNull String questid) {
        this.questid = questid;
    }

    @NonNull
    public String getId() {
        return questid;
    }



}
