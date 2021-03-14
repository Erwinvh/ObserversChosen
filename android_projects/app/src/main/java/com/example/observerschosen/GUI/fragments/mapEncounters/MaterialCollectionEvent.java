package com.example.observerschosen.GUI.fragments.mapEncounters;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class MaterialCollectionEvent extends Fragment {

    public MainActivity mainActivity;

    public ImageView statusImageView;
    public FrameLayout MaterialCollectionArea;
    public TextView TimeLeftField;
    public FloatingActionButton backButton;


    public MaterialCollectionEvent(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.event_material_collection, container, false);

        statusImageView = view.findViewById(R.id.MaterialCollectionStatusImage);
        MaterialCollectionArea = view.findViewById(R.id.MaterialCollectionMechanicFrame);
        TimeLeftField = view.findViewById(R.id.MaterialCollectionTimeField);

        backButton = view.findViewById(R.id.MaterialCollectionEventBackButton);
        backButton.setOnClickListener(view1 -> {
            mainActivity.getSupportFragmentManager().beginTransaction().add(R.id.MainFragmentContainer, new ForfeitMaterialCollectionEvent(mainActivity, this)).commit();
        });
        // Inflate the layout for this fragment
        return view;
    }

    public void updateTime(int remainingSeconds){
        TimeLeftField.setText(new StringBuilder().append(remainingSeconds).append("s").toString());
    }
}