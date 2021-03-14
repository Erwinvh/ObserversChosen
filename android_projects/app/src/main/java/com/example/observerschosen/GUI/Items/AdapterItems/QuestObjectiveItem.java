package com.example.observerschosen.GUI.Items.AdapterItems;

public class QuestObjectiveItem {

public String questObjectiveDetails;
public int objectiveProgress;
public int ObjectiveGoal;
public String objectiveImage;

    public QuestObjectiveItem(String questObjectiveDetails, int objectiveProgress, int objectiveGoal, String objectiveImage) {
        this.questObjectiveDetails = questObjectiveDetails;
        this.objectiveProgress = objectiveProgress;
        ObjectiveGoal = objectiveGoal;
        this.objectiveImage = objectiveImage;
    }

    public String getQuestObjectiveDetails() {
        return questObjectiveDetails;
    }

    public int getObjectiveProgress() {
        return objectiveProgress;
    }

    public int getObjectiveGoal() {
        return ObjectiveGoal;
    }

    public String getObjectiveImage() {
        return objectiveImage;
    }

}
