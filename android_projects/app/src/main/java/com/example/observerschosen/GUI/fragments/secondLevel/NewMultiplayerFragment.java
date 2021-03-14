package com.example.observerschosen.GUI.fragments.secondLevel;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.observerschosen.GUI.Adapters.FriendsAdapter;
import com.example.observerschosen.GUI.Adapters.PlayerAdapter;
import com.example.observerschosen.GUI.Adapters.TeamsAdapter;
import com.example.observerschosen.GUI.Items.AdapterItems.FriendsItem;
import com.example.observerschosen.GUI.Items.Player;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;


public class NewMultiplayerFragment extends Fragment {

    public MainActivity mainActivity;
    public String RequestType;

    public FloatingActionButton backButton;
    public TextView fragmentTitel;
    public boolean isSecondLevel;

    public FriendsItem tradeSubject;

    //Trade Nececity
    public TextView tradesubjectName;
    public ImageView tradeSubjectImage;

    public NewMultiplayerFragment(MainActivity mainActivity, String RequestType) {
        this.mainActivity = mainActivity;
        this.RequestType = RequestType;
        this.isSecondLevel = true;
    }

    public NewMultiplayerFragment(MainActivity mainActivity, String RequestType, FriendsItem tradeSubject) {
        this.mainActivity = mainActivity;
        this.RequestType = RequestType;
        this.isSecondLevel = false;
        this.tradeSubject = tradeSubject;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_multiplayer, container, false);

        backButton = view.findViewById(R.id.newMultiBackButton);
        backButton.setOnClickListener(view1 -> {
            if (isSecondLevel) {
                mainActivity.toggleMainBar(true);
            }
            mainActivity.getSupportFragmentManager().beginTransaction().remove(this).commit();
        });
        fragmentTitel = view.findViewById(R.id.newMultiTitel);


        switch (this.RequestType) {
            case "Friends":
                fragmentTitel.setText("New Friend");
                activateNewFriendMode(view);
                break;
            case "Teams":
                fragmentTitel.setText("New Team");
                activateNewTeamMode(view);
                break;
            case "Trades":
                fragmentTitel.setText("New Trade");
                activateNewTradeMode(view);
                break;
        }


        return view;
    }

    public ConstraintLayout TradeLayout;


    public void activateNewTradeMode(View view) {
        //TODO: setup trade mechanics
        TradeLayout = view.findViewById(R.id.newTradeLayout);
        TradeLayout.setVisibility(View.VISIBLE);
        if (tradeSubject != null) {
            tradeSubjectImage = view.findViewById(R.id.newTradeFriendImage);
            //TODO: set friend image
            tradesubjectName = view.findViewById(R.id.newTradeFriendNameField);
            tradesubjectName.setText(tradeSubject.getFriendName());
            FloatingActionButton newTradeFriendSearchButton = view.findViewById(R.id.newTradeFriendSearchButton);
            newTradeFriendSearchButton.setVisibility(View.GONE);
            newTradeFriendSearchButton.setClickable(false);
        }

    }

    public ConstraintLayout FriendLayout;


    public void activateNewFriendMode(View view) {
//TODO: setup friend mechanics
        FriendLayout = view.findViewById(R.id.newFriendLayout);
        FriendLayout.setVisibility(View.VISIBLE);

    }

    public ConstraintLayout TeamLayout;
    public RecyclerView TeammemberRecyclerView;

    public void activateNewTeamMode(View view) {
//TODO: setup team mechanic
        TeamLayout = view.findViewById(R.id.newGroupLayout);
        TeamLayout.setVisibility(View.VISIBLE);
        TeammemberRecyclerView = view.findViewById(R.id.newGroupMemberRecycler);

        //TODO: remove testCode after testing
        LinkedList<FriendsItem> friends = new LinkedList<>();
        friends.add(new FriendsItem("path", "John", 1, "Yesterday", 10));
        friends.add(new FriendsItem("path", "parker", 1, "Yesterday", 10));
        FriendsAdapter FAdapter = new FriendsAdapter(getContext(), friends, mainActivity, false, false);
        TeammemberRecyclerView.setAdapter(FAdapter);
        // Give the recycler view a default layout manager.
        TeammemberRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

    }


}