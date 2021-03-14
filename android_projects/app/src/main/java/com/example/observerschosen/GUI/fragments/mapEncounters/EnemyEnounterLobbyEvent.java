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


public class EnemyEnounterLobbyEvent extends Fragment {

    public TextView lobbyTitle;
    public TextView LobbyTime;
    public ImageView Background;
    public TextView FirstCharText;
    public TextView SecondCharText;
    public TextView ThirdCharText;
    public ImageView FirstCharImage;
    public ImageView SecondCharImage;
    public ImageView ThirdCharImage;

    public Button FirstCharEditButton;
    public Button SecondCharEditButton;
    public Button ThirdCharEditButton;

    public FloatingActionButton backButton;

    public Button StartEnemyEncounterButton;

public MainActivity mainActivity;

    public EnemyEnounterLobbyEvent(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.event_enemy_enounter_lobby, container, false);

        //TODO: set information
        lobbyTitle = view.findViewById(R.id.EnemyLobbyTitle);
        LobbyTime = view.findViewById(R.id.EnemyLobbyTimeText);
        Background = view.findViewById(R.id.EnemyLobbyBackground);
        FirstCharText = view.findViewById(R.id.FirstCharacterNameTagEnemyLobby);
        SecondCharText = view.findViewById(R.id.SecondCharacterNameTagEnemyLobby);
        ThirdCharText = view.findViewById(R.id.ThirdCharacterNameTagEnemyLobby);
        FirstCharImage = view.findViewById(R.id.FirstCharacterImageEnemyLobby);
        SecondCharImage = view.findViewById(R.id.SecondCharacterImageEnemyLobby);
        ThirdCharImage = view.findViewById(R.id.ThirdCharacterImageEnemyLobby);

        FirstCharEditButton = view.findViewById(R.id.ChangeFirstCharacterButtonEnemyLobby);
        FirstCharEditButton.setOnClickListener(view1 -> {
            //TODO: open character selection menu
        });
        SecondCharEditButton = view.findViewById(R.id.ChangeSecondCharacterButtonEnemyLobby);
        SecondCharEditButton.setOnClickListener(view1 -> {
            //TODO: open character selection menu
        });
        ThirdCharEditButton = view.findViewById(R.id.ChangeThirdCharacterButtonEnemyLobby);
        ThirdCharEditButton.setOnClickListener(view1 -> {
            //TODO: open character selection menu
        });

        backButton = view.findViewById(R.id.EnemyLobbyBackButton);
        backButton.setOnClickListener(view1 -> {
            //TODO: close lobby
        });

        StartEnemyEncounterButton = view.findViewById(R.id.StartEnemyEncounterButton);
        StartEnemyEncounterButton.setOnClickListener(view1 -> {
            //TODO: move to encounter event fragment
        });

        return view;
    }
}