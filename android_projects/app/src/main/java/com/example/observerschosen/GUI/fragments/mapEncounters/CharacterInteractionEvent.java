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


public class CharacterInteractionEvent extends Fragment {

public MainActivity mainActivity;

public TextView dialogue1;
public TextView dialogue2;
public TextView dialogue3;
public TextView CharDialogueBox;
public Button CharStartquestButton;
public ImageView CharImage;
public TextView CharName;

    public CharacterInteractionEvent(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        //TODO: retrieve quest info
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.event_character_interaction, container, false);

        dialogue1 = view.findViewById(R.id.DialogueOption1);
        dialogue1.setOnClickListener(view1 -> {

        });
        dialogue2 = view.findViewById(R.id.DialogueOption2);
        dialogue2.setOnClickListener(view1 -> {

        });
        dialogue3 = view.findViewById(R.id.DialogueOption3);
        dialogue3.setOnClickListener(view1 -> {

        });
        CharDialogueBox = view.findViewById(R.id.CharacterInteractionDialogueBox);
        CharStartquestButton = view.findViewById(R.id.AcceptCharacterTimedQuestButton);
        CharStartquestButton.setOnClickListener(view1 -> {
            //TODO: add to quests a this one with a time limit
            mainActivity.getSupportFragmentManager().beginTransaction().remove(this).commit();
        });
        CharImage = view.findViewById(R.id.CharacterInteractImageIntermedio);
        CharName = view.findViewById(R.id.CharacterNameCharacterInteractionIntermedio);

        //TODO: set all interaction items

        return view;
    }
}