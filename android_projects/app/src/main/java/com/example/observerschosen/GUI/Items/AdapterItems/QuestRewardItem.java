package com.example.observerschosen.GUI.Items.AdapterItems;

public class QuestRewardItem {

    public String RewardImage;
    public String RewardItemName;
    public int RewardAmount;

    public QuestRewardItem(String rewardImage, String rewardItemName, int rewardAmount) {
        RewardImage = rewardImage;
        RewardItemName = rewardItemName;
        RewardAmount = rewardAmount;
    }

    public String getRewardImage() {
        return RewardImage;
    }

    public String getRewardItemName() {
        return RewardItemName;
    }

    public int getRewardAmount() {
        return RewardAmount;
    }


}
