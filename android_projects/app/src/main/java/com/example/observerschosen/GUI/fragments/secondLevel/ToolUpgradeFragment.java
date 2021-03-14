package com.example.observerschosen.GUI.fragments.secondLevel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.observerschosen.GUI.Adapters.MapAdapter;
import com.example.observerschosen.GUI.Adapters.ToolsAdapter;
import com.example.observerschosen.GUI.Items.AdapterItems.ToolItem;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;


public class ToolUpgradeFragment extends Fragment {

    public MainActivity mainActivity;
    public FloatingActionButton backButton;
    public RecyclerView ToolsRecyclerView;

    public ToolsAdapter mAdapter;
    public LinkedList<ToolItem> toolsList;


    public ToolUpgradeFragment(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        toolsList = mainActivity.getMainViewModel().getTools();
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_tool_upgrade, container, false);
        // Inflate the layout for this fragment
        backButton = view.findViewById(R.id.ToolsBackButton);
        backButton.setOnClickListener(view1 -> {
            mainActivity.getSupportFragmentManager().beginTransaction().remove(this).commit();
        });
        ToolsRecyclerView = view.findViewById(R.id.ToolsRecycler);
        //TODO: setup adapter
        // Connect the adapter with the recycler view.
        ToolsRecyclerView.setAdapter(new ToolsAdapter(getContext(), toolsList, mainActivity));
        // Give the recycler view a default layout manager.
        ToolsRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));


        return view;
    }
}