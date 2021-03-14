package com.example.observerschosen.GUI.fragments.secondLevel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.observerschosen.GUI.Adapters.MapAdapter;
import com.example.observerschosen.GUI.Adapters.QuestAdapter;
import com.example.observerschosen.GUI.Items.AdapterItems.MapItem;
import com.example.observerschosen.GUI.Items.UpgradeCost;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;


public class WorldMapUpgradeFragment extends Fragment {

    public MainActivity mainActivity;

    public FloatingActionButton backButton;
    public RecyclerView mRecycler;

    public LinkedList<MapItem> mapList;

    public WorldMapUpgradeFragment(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        mapList  = mainActivity.getMainViewModel().getMapList();

    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_world_map_upgrade, container, false);
        // Inflate the layout for this fragment
        backButton = view.findViewById(R.id.MapUpgradeBackButton);
        backButton.setOnClickListener(view1 -> {
            mainActivity.getSupportFragmentManager().beginTransaction().remove(this).commit();
        });
        mRecycler = view.findViewById(R.id.MapsRecyclerView);

        // Connect the adapter with the recycler view.
        mRecycler.setAdapter(new MapAdapter(getContext(), mapList, mainActivity));
        // Give the recycler view a default layout manager.
        mRecycler.setLayoutManager(new LinearLayoutManager(getContext()));


        return view;
    }
}