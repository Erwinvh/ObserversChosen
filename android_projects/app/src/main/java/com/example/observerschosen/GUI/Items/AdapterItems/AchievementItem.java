package com.example.observerschosen.GUI.Items.AdapterItems;

import androidx.recyclerview.widget.RecyclerView;

import com.example.observerschosen.GUI.Adapters.AchievementAdapter;

public class AchievementItem {

    public String AchievementName;
    public boolean isUnlocked;
    public String achievementImagePath;


    public AchievementItem(String name, String image, boolean isUnlocked){
        this.AchievementName = name;
        this.achievementImagePath = image;
        this.isUnlocked = isUnlocked;
    }

    public String getAchievementImagePath() {
        return achievementImagePath;
    }

    public String getAchievementName() {
        return AchievementName;
    }

    public boolean isUnlocked() {
        return isUnlocked;
    }
}
