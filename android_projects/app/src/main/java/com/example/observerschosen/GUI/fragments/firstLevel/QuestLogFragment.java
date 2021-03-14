package com.example.observerschosen.GUI.fragments.firstLevel;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.FrameLayout;

import com.example.observerschosen.GUI.Adapters.QuestAdapter;
import com.example.observerschosen.GUI.Items.AdapterItems.QuestItem;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;


public class QuestLogFragment extends Fragment {

    public LinkedList<QuestItem> storyQuests;
    public LinkedList<QuestItem> GlobalEventQuests;
    public LinkedList<QuestItem> FriendQuests;
    public FrameLayout currentContainer;
    public FloatingActionButton backButton;
    public Button MainButton;
    public Button FriendButton;
    public Button GlobalButton;
    public MainActivity mainActivity;
    public ConstraintLayout sideBanner;

    private LayoutInflater mInflater;

    public RecyclerView mRecyclerView;
    public QuestAdapter mAdapter;


    public QuestLogFragment(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        storyQuests = mainActivity.getMainViewModel().getStoryQuests();
        GlobalEventQuests = mainActivity.getMainViewModel().getGlobalEventQuests();
        FriendQuests = mainActivity.getMainViewModel().getFriendQuests();

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_quest_log, container, false);

        mRecyclerView = view.findViewById(R.id.QuestRecyclerView);


        backButton = view.findViewById(R.id.QuestBackButton);
        backButton.setOnClickListener(view1 -> {
            FragmentTransaction transaction = mainActivity.getSupportFragmentManager().beginTransaction();
            transaction.remove(this).commit();
            ConstraintLayout sidebanner = mainActivity.findViewById(R.id.SideBanner);
            sidebanner.setVisibility(View.VISIBLE);
        });

        MainButton = view.findViewById(R.id.MainQuestButton);
        MainButton.setOnClickListener(v -> {
            mAdapter = new QuestAdapter(getContext(), storyQuests, mainActivity);
            // Connect the adapter with the recycler view.
            mRecyclerView.setAdapter(mAdapter);
            // Give the recycler view a default layout manager.
            mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            //TODO: change colors

        });

        GlobalButton = view.findViewById(R.id.GlobalEventQuestButton);
        GlobalButton.setOnClickListener(v -> {
            mAdapter = new QuestAdapter(getContext(), GlobalEventQuests, mainActivity);
            // Connect the adapter with the recycler view.
            mRecyclerView.setAdapter(mAdapter);
            // Give the recycler view a default layout manager.
            mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            //TODO: change colors

        });

        FriendButton = view.findViewById(R.id.FriendQuestButton);
        FriendButton.setOnClickListener(v -> {
            mAdapter = new QuestAdapter(getContext(), FriendQuests, mainActivity);
            // Connect the adapter with the recycler view.
            mRecyclerView.setAdapter(mAdapter);
            // Give the recycler view a default layout manager.
            mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            //TODO: change colors
        });

        MainButton.performClick();

        return view;
    }


}