package com.example.observerschosen.GUI.fragments.mapEncounters;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;


public class ForfeitMaterialCollectionEvent extends Fragment {

    public Button ConfirmForfeit;
    public Button DeclineForfeit;

    public MainActivity mainActivity;
    public MaterialCollectionEvent parent;

    public ForfeitMaterialCollectionEvent(MainActivity mainActivity, MaterialCollectionEvent subjectEvent) {
        this.mainActivity = mainActivity;
        parent = subjectEvent;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.event_forfeit_material_collection, container, false);
        ConfirmForfeit = view.findViewById(R.id.ConfirmMaterialCollectionForefeitButton);
        ConfirmForfeit.setOnClickListener(view1 -> {
            mainActivity.getSupportFragmentManager().beginTransaction().remove(this).remove(parent).commit();
        });
        DeclineForfeit = view.findViewById(R.id.DeclineMaterialCollectionForfeitButton);
        DeclineForfeit.setOnClickListener(view1 -> {
            mainActivity.getSupportFragmentManager().beginTransaction().remove(this).commit();
        });
        return view;
    }
}