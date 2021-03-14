package com.example.observerschosen.GUI.fragments.secondLevel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.observerschosen.GUI.Adapters.QuestAdapter;
import com.example.observerschosen.GUI.Adapters.QuestObjectiveAdapter;
import com.example.observerschosen.GUI.Adapters.QuestRewardAdapter;
import com.example.observerschosen.GUI.Items.AdapterItems.QuestItem;
import com.example.observerschosen.GUI.Items.AdapterItems.QuestObjectiveItem;
import com.example.observerschosen.GUI.Items.AdapterItems.QuestRewardItem;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;


public class QuestOverviewFragment extends Fragment {

    public MainActivity mainActivity;

    public QuestItem subject;

    public FloatingActionButton backButton;
    public FloatingActionButton AudioButton;

    public RecyclerView ObjectiveRecycler;
    public RecyclerView RewardRecycler;

    public ImageView QuestBackground;
    public ImageView QuestGiverImage;

    public TextView QuestName;
    public TextView QuestDateofExpire;
    public TextView QuestFlavourText;

    public LinkedList<QuestRewardItem> rewards;
    public LinkedList<QuestObjectiveItem> objectives;

    public QuestOverviewFragment(MainActivity mainActivity, QuestItem subject) {
        // Required empty public constructor
        this.mainActivity = mainActivity;
        this.subject = subject;
        rewards = mainActivity.getMainViewModel().getQuestRewards(subject);
        objectives = mainActivity.getMainViewModel().getQuestObjectives(subject);
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quest_overview, container, false);

        backButton = view.findViewById(R.id.QuestOverviewBackButton);
        backButton.setOnClickListener(view1 -> {
            mainActivity.toggleMainBar(true);
            mainActivity.getSupportFragmentManager().beginTransaction().remove(this).commit();
        });
        AudioButton = view.findViewById(R.id.QuestOverviewAudioButton);
        AudioButton.setOnClickListener(view1 -> {
            //TODO: play audio file
        });

        ObjectiveRecycler = view.findViewById(R.id.QuestOverviewQuestObjectivesRecycler);
        QuestObjectiveAdapter oAdapter = new QuestObjectiveAdapter(getContext(), objectives, mainActivity);
        // Connect the adapter with the recycler view.
        ObjectiveRecycler.setAdapter(oAdapter);
        // Give the recycler view a default layout manager.
        ObjectiveRecycler.setLayoutManager(new LinearLayoutManager(getContext()));

        RewardRecycler = view.findViewById(R.id.QuestOverViewQuestRewardsRecycler);
        QuestRewardAdapter rAdapter= new QuestRewardAdapter(getContext(), rewards, mainActivity);
        // Connect the adapter with the recycler view.
        RewardRecycler.setAdapter(rAdapter);
        // Give the recycler view a default layout manager.
        RewardRecycler.setLayoutManager(new LinearLayoutManager(getContext()));

        QuestBackground = view.findViewById(R.id.QuestOverViewBackGround);
        QuestGiverImage = view.findViewById(R.id.QuestOverViewQuestGiverImage);

        QuestName = view.findViewById(R.id.QuestOverviewName);
        QuestDateofExpire = view.findViewById(R.id.QuestOverviewDoE);
        QuestFlavourText = view.findViewById(R.id.QuestOverviewFlavorText);


        // Inflate the layout for this fragment
        return view;
    }
}