package com.example.observerschosen.database.Entities.NPC;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.Index;
import androidx.room.PrimaryKey;

/**
 * Room entity which describes a Race.
 */
@Entity(tableName = "NPCharacter", indices = {@Index("NPCid"), @Index(value = {"NPCName"}), @Index(value = {"imagePath"}),
        @Index(value = {"isUnlocked"}), @Index(value = {"bookNumber"}), @Index(value = {"bookPosition"})})
public class NPCharacter {

    @NonNull
    @PrimaryKey
    private final String NPCid;

    @ColumnInfo(name = "NPCName")
    private String NPCName;

    @ColumnInfo(name = "imagePath")
    private String imagePath;

    @ColumnInfo(name = "isUnlocked")
    private boolean isUnlocked;

    @ColumnInfo(name = "bookNumber")
    private int bookNumber;

    @ColumnInfo(name = "bookPosition")
    private int bookPosition;

    public NPCharacter(@NonNull String NPCid, String NPCName) {
        this.NPCid = NPCid;
        this.NPCName = NPCName;
    }

    @NonNull
    public String getId() {
        return NPCid;
    }



}
