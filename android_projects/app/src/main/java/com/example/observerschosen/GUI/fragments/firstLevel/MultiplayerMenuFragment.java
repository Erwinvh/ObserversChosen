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
import android.widget.TextView;

import com.example.observerschosen.GUI.Adapters.FriendsAdapter;
import com.example.observerschosen.GUI.Adapters.TeamsAdapter;
import com.example.observerschosen.GUI.Adapters.TradesAdapter;
import com.example.observerschosen.GUI.Items.AdapterItems.FriendsItem;
import com.example.observerschosen.GUI.Items.AdapterItems.TeamsItem;
import com.example.observerschosen.GUI.Items.AdapterItems.TradesItem;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.GUI.fragments.secondLevel.NewMultiplayerFragment;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;

public class MultiplayerMenuFragment extends Fragment {

    public FloatingActionButton backbutton;
    public FloatingActionButton newButton;
    public MainActivity mainActivity;

    public RecyclerView mRecyclerView;

    public TextView MultiplayerTitel;
    public TextView EmptyMessage;

    public Button FriendsButton;
    public Button TeamsButton;
    public Button TradesButton;

    public LinkedList<TradesItem> trades;
    public LinkedList<TeamsItem> teams;
    public LinkedList<FriendsItem> friends;

    public String menu;

    public MultiplayerMenuFragment(MainActivity mainActivity) {
        // Required empty public constructor
        this.mainActivity = mainActivity;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        teams = mainActivity.getMainViewModel().getTeamsList();
        friends = mainActivity.getMainViewModel().getFriendsList();
        trades = mainActivity.getMainViewModel().getTradesList();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_multiplayer_menu, container, false);
        mRecyclerView = view.findViewById(R.id.MultiplayerRecycler);
        MultiplayerTitel = view.findViewById(R.id.MultiplayerTitel);
        EmptyMessage = view.findViewById(R.id.EmptyMultiList);

        newButton = view.findViewById(R.id.NewMultiButton);
        newButton.setOnClickListener(view1 -> {
            mainActivity.toggleMainBar(false);
            mainActivity.getSupportFragmentManager().beginTransaction().add(R.id.MainFragmentContainer, new NewMultiplayerFragment(mainActivity, menu)).commit();

        });

        backbutton = view.findViewById(R.id.MultiplayerBackButton);
        backbutton.setOnClickListener(v -> {
            FragmentTransaction transaction = mainActivity.getSupportFragmentManager().beginTransaction();
            transaction.remove(this).commit();
            ConstraintLayout sidebanner = mainActivity.findViewById(R.id.SideBanner);
            sidebanner.setVisibility(View.VISIBLE);
        });

        FriendsButton = view.findViewById(R.id.FriendButton);
        FriendsButton.setOnClickListener(view1 -> {
            MultiplayerTitel.setText("Friends");
            if (!friends.isEmpty()){
                EmptyMessage.setVisibility(View.GONE);
                FriendsAdapter FAdapter = new FriendsAdapter(getContext(), friends, mainActivity, true, true);
                mRecyclerView.setAdapter(FAdapter);
                // Give the recycler view a default layout manager.
                mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            }else{
                EmptyMessage.setVisibility(View.VISIBLE);
                EmptyMessage.setText("You don't have any Friends Yet");
            }
            menu = "Friends";
        });

        TeamsButton = view.findViewById(R.id.TeamsButton);
        TeamsButton.setOnClickListener(view1 -> {
            MultiplayerTitel.setText("Teams");
            if (!teams.isEmpty()){
                EmptyMessage.setVisibility(View.GONE);
                TeamsAdapter TAdapter = new TeamsAdapter(getContext(), teams, mainActivity);
                mRecyclerView.setAdapter(TAdapter);
                // Give the recycler view a default layout manager.
                mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            }else{
                EmptyMessage.setVisibility(View.VISIBLE);
                EmptyMessage.setText("You don't have any Teams Yet");
            }
            menu = "Teams";
        });

        TradesButton = view.findViewById(R.id.TradesButton);
        TradesButton.setOnClickListener(view1 -> {
            MultiplayerTitel.setText("Trades");
            if (!trades.isEmpty()){
                EmptyMessage.setVisibility(View.GONE);
                TradesAdapter tAdapter = new TradesAdapter(getContext(), trades);
                mRecyclerView.setAdapter(tAdapter);
                // Give the recycler view a default layout manager.
                mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
            }else{
                EmptyMessage.setVisibility(View.VISIBLE);
                EmptyMessage.setText("You don't have any Trades at the moment");
            }
            menu = "Trades";
        });

        FriendsButton.performClick();
        return view;
    }
}