package com.example.observerschosen.GUI.fragments.mapEncounters;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;


public class CompleteMaterialCollectionEvent extends Fragment {

    public TextView MaterialCollectionRewardField;
    public MainActivity mainActivity;
    public MaterialCollectionEvent parent;
    public StartMaterialCollectionEvent grandparent;

    public CompleteMaterialCollectionEvent(MainActivity mainActivity, MaterialCollectionEvent parent, StartMaterialCollectionEvent grandparent) {
        this.mainActivity = mainActivity;
        this.parent = parent;
        this.grandparent = grandparent;
        mainActivity.getSupportFragmentManager().beginTransaction().remove(parent).remove(grandparent).commit();
        //TODO: remove event from map somehow
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.event_complete_material_collection, container, false);
        MaterialCollectionRewardField = view.findViewById(R.id.MaterialCollectionRewardField);
        MaterialCollectionRewardField.setText(mainActivity.getMainViewModel().getMaterialCollectionReward());
        return view;
    }
}