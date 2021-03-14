package com.example.observerschosen.GUI.fragments.mapEncounters;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class StartMaterialCollectionEvent extends Fragment {

    public TextView typetitle;
    public TextView materialLevel;
    public TextView ownedMaterial;
    public TextView toolInfo;
    public ImageView materialImage;
    public FloatingActionButton backButton;
    public Button startEventButton;
    public String Material;

public MainActivity mainActivity;

    public StartMaterialCollectionEvent(MainActivity mainActivity) {
        // Required empty public constructor
        this.mainActivity = mainActivity;
        //TODO: add an event to the constructor to forward the neccessary things
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.event_material_collection_start, container, false);
        typetitle = view.findViewById(R.id.MaterialCollectionTypeField);
        materialLevel = view.findViewById(R.id.MaterialCollectionLevelField);

        ownedMaterial = view.findViewById(R.id.OwnedMaterialField);
        ownedMaterial.setText(mainActivity.getMainViewModel().getOwnedMaterialAmount(Material));
        toolInfo = view.findViewById(R.id.EventToolInfo);
        toolInfo.setText(mainActivity.getMainViewModel().getToolInfo(Material));
        materialImage = view.findViewById(R.id.MaterialCollectionImageField);
        //TODO: set Image
        backButton = view.findViewById(R.id.MaterialCollectionBackButton);
        backButton.setOnClickListener(view1 -> {
            mainActivity.getSupportFragmentManager().beginTransaction().remove(this).commit();
        });
        startEventButton = view.findViewById(R.id.StartMaterialCollectionButton);
        startEventButton.setOnClickListener(view1 -> {
            //TODO: start event

            mainActivity.toggleMainBar(false);
            mainActivity.getSupportFragmentManager().beginTransaction().add(R.id.MainFragmentContainer, new MaterialCollectionEvent(mainActivity)).commit();
            mainActivity.getMainViewModel().startMaterialCollection();
        });


        return view;
    }
}