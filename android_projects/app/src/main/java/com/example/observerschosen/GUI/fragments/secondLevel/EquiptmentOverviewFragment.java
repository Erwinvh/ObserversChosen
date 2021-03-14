package com.example.observerschosen.GUI.fragments.secondLevel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.observerschosen.GUI.Items.Equiptment;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class EquiptmentOverviewFragment extends Fragment {

    public Equiptment subject;
    public MainActivity activity;

    public TextView equiptmentTitel;
    public TextView equiptmentLevel;
    public TextView Fractions; //Equiptement pieces
    public TextView Type;
    public TextView Attack;
    public TextView Defense;
    public TextView Description;

    public ImageView EquiptmentImage;

    public FloatingActionButton Backbutton;
    public FloatingActionButton AudioButton;

    public EquiptmentOverviewFragment(MainActivity mainActivity, Equiptment subject) {
        // Required empty public constructor
        this.activity = mainActivity;
        this.subject = subject;


    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_equiptment_overview, container, false);

        equiptmentTitel = view.findViewById(R.id.EquiptmentName);
        equiptmentTitel.setText(subject.getEquiptmentName());
        equiptmentLevel = view.findViewById(R.id.EquiptementLevel);
        equiptmentLevel.setText("Level: "+subject.getLevel());
//        Fractions = view.findViewById(R.id.);
        Type = view.findViewById(R.id.EquiptementTypeField);
        switch (subject.getWearingPosition()){
            case 1:
                Type.setText("Helmet");
                break;
            case 2:
                Type.setText("Special");
                break;
            case 3:
            case 4:
                Type.setText("Weapon");
                break;
            case 5:
                Type.setText("Torso Armor");
                break;
            case 6:
                Type.setText("Gauntlets");
                break;
            case 7:
                Type.setText("Trouser");
                break;
            case 8:
                Type.setText("Boots");
                break;
        }



        Attack = view.findViewById(R.id.EquipAttackField);
        Attack.setText("" + subject.getAttack());
        Defense = view.findViewById(R.id.EquipDefenseField);
        Defense.setText("" + subject.getDefense());
        Description = view.findViewById(R.id.EquipDescription);
        Description.setText(subject.getDescription());

        EquiptmentImage = view.findViewById(R.id.EquiptmentImageView);
        //TODO: set Image on place

        Backbutton = view.findViewById(R.id.EquipOverViewBackButton);
        Backbutton.setOnClickListener(view1 -> {
            activity.getSupportFragmentManager().beginTransaction().remove(this).commit();
        });
        AudioButton = view.findViewById(R.id.EquipAudioButton);
        AudioButton.setOnClickListener(view1 -> {
            //TODO: add audio and randomiser
        });


        return view;
    }
}