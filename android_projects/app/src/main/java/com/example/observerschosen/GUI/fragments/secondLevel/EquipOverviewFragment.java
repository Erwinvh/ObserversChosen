package com.example.observerschosen.GUI.fragments.secondLevel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.observerschosen.GUI.Adapters.EquipAdapter;
import com.example.observerschosen.GUI.Adapters.FriendsAdapter;
import com.example.observerschosen.GUI.Items.AdapterItems.EquipItem;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;

public class EquipOverviewFragment extends Fragment {

    public String Focus;
    public MainActivity mainActivity;
    public LinkedList<EquipItem> equipItems;

    public FloatingActionButton backButton;

    public TextView equipTitle;
    public ImageView equipTypeImage;
    public FrameLayout currentEquip;
    public RecyclerView mRecycler;

    public EquipOverviewFragment(String Purpose, MainActivity mainActivity) {
        Focus = Purpose;
        this.mainActivity = mainActivity;
        equipItems = mainActivity.getMainViewModel().getSpecificEquipList(Focus);


    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_equip_overview, container, false);

        equipTitle = view.findViewById(R.id.equipOverviewTitle);
        equipTitle.setText(Focus);

        equipTypeImage = view.findViewById(R.id.equipTypeImage);
        //TODO: set Image

        currentEquip = view.findViewById(R.id.equipCurrent);
        //TODO: set current item here

        mRecycler = view.findViewById(R.id.equipRecycler);
        EquipAdapter mAdapter = new EquipAdapter(getContext(), equipItems, mainActivity);
        mRecycler.setAdapter(mAdapter);
        mRecycler.setLayoutManager(new LinearLayoutManager(getContext()));

        backButton = view.findViewById(R.id.equipBackButton);
        backButton.setOnClickListener(view1 -> {
            mainActivity.getSupportFragmentManager().beginTransaction().remove(this).commit();

        });

        return view;
    }
}