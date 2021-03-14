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


public class StartCharacterInteractEvent extends Fragment {

    public MainActivity mainActivity;
    public FloatingActionButton backButton;
    public TextView CharEventLevel;
    public TextView CharEventCharName;
    public TextView CharEventStartText;
    public ImageView CharEventImage;
    public Button CharEventStartButton;

    public StartCharacterInteractEvent(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.event_start_character_interact, container, false);

        //TODO: fill out all items
        backButton = view.findViewById(R.id.CharacterInteractStartBackButton);
        backButton.setOnClickListener(view1 -> {
            mainActivity.getSupportFragmentManager().beginTransaction().remove(this).commit();
        });
        CharEventLevel = view.findViewById(R.id.CharacterInteractLevel);

        CharEventCharName = view.findViewById(R.id.CharacterInteractName);

        CharEventStartText = view.findViewById(R.id.CharacterInteractStartText);

        CharEventImage = view.findViewById(R.id.CharacterInteractStartImage);

        CharEventStartButton = view.findViewById(R.id.CharacterInteractStartInteractButton);
        CharEventStartButton.setOnClickListener(view1 -> {
            //TODO: start the event
        });

        return view;
    }
}