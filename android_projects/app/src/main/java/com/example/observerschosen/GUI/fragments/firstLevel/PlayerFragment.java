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
import android.widget.TextView;

import com.example.observerschosen.GUI.Adapters.PlayerAdapter;
import com.example.observerschosen.GUI.Items.AdapterItems.AchievementItem;
import com.example.observerschosen.GUI.Items.Player;
import com.example.observerschosen.GUI.Items.AdapterItems.PlayerItem;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;


public class PlayerFragment extends Fragment {

    public RecyclerView PlayerRecycler;
    public FloatingActionButton backbutton;
    public TextView playerNameTextView;
    public PlayerAdapter mAdapter;
    public LinkedList<PlayerItem> playerList = new LinkedList<>();

    public MainActivity mainActivity;

    public PlayerFragment(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        playerList.add(mainActivity.getMainViewModel().getPlayerItem());
        playerList.add(mainActivity.getMainViewModel().getAchievementItem());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_player, container, false);

        backbutton = view.findViewById(R.id.PlayerBackButton);
        backbutton.setOnClickListener(view1 -> {
            FragmentTransaction transaction = mainActivity.getSupportFragmentManager().beginTransaction();
            transaction.remove(this).commit();
            ConstraintLayout sidebanner = mainActivity.findViewById(R.id.SideBanner);
            sidebanner.setVisibility(View.VISIBLE);
        });

        PlayerRecycler = view.findViewById(R.id.PlayerViewRecycler);
        mAdapter = new PlayerAdapter(getContext(), playerList, PlayerRecycler, mainActivity);
        // Connect the adapter with the recycler view.
        PlayerRecycler.setAdapter(mAdapter);
        // Give the recycler view a default layout manager.
        PlayerRecycler.setLayoutManager(new LinearLayoutManager(getContext()));

        playerNameTextView = view.findViewById(R.id.PlayerNameCard);
        playerNameTextView.setText(playerList.get(0).getPlayer().getPlayerName());


        return view;
    }
}