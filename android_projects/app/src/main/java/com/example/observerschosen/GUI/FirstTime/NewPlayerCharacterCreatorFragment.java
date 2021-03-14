package com.example.observerschosen.GUI.FirstTime;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class NewPlayerCharacterCreatorFragment extends Fragment {

    public TextView GenderField;
    public TextView RaceField;
    public TextView TypeField;
    public ImageView characterImage;

    public FloatingActionButton RaceLeftButton;
    public FloatingActionButton RaceRightButton;
    public FloatingActionButton GenderLeftButton;
    public FloatingActionButton GenderRightButton;
    public FloatingActionButton HairLeftButton;
    public FloatingActionButton HairRightButton;
    public FloatingActionButton EyeLeftButton;
    public FloatingActionButton EyeRightButton;
    public FloatingActionButton FaceLeftButton;
    public FloatingActionButton FaceRightButton;
    public FloatingActionButton SkinColourLeftButton;
    public FloatingActionButton SkinColourRightButton;
    public FloatingActionButton BodyTypeLeftButton;
    public FloatingActionButton BodyTypeRightButton;
    public FloatingActionButton SpecialLeftButton;
    public FloatingActionButton SpecialRightButton;
    public FloatingActionButton TypeLeftButton;
    public FloatingActionButton TypeRightButton;

    public int GenderPosition = 0;
    public int RacePosition = 0;
    public int TypePosition = 0;
    public int HairPosition = 0;
    public int EyePosition = 0;
    public int FacePosition = 0;
    public int SkinColourPosition = 0;
    public int BodyTypePosition = 0;
    public int SpecialPosition = 0;

    public String ImageString;

    public NewPlayerCharacterCreatorFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_new_player_character_creator, container, false);

        //TODO: set all button shifts
        GenderField = view.findViewById(R.id.GenderSetField);
        RaceField = view.findViewById(R.id.RaceSetField);
        TypeField = view.findViewById(R.id.TypeSetField);
        characterImage = view.findViewById(R.id.CharacterCreatorImageView);
        //TODO: set a preset Race, Gender, Type and image

        RaceLeftButton = view.findViewById(R.id.RaceLeftButton);
        RaceLeftButton.setOnClickListener(view1 -> {
            GenerateImage();
        });
        RaceRightButton = view.findViewById(R.id.RaceRightButton);
        RaceRightButton.setOnClickListener(view1 -> {
            GenerateImage();
        });
        GenderLeftButton = view.findViewById(R.id.GenderLeftButton);
        GenderLeftButton.setOnClickListener(view1 -> {
            GenerateImage();
        });
        GenderRightButton = view.findViewById(R.id.GenderRightButton);
        GenderRightButton.setOnClickListener(view1 -> {
            GenerateImage();
        });
        HairLeftButton = view.findViewById(R.id.HairLeftButton);
        HairLeftButton.setOnClickListener(view1 -> {
            GenerateImage();
        });
        HairRightButton = view.findViewById(R.id.HairRightButton);
        HairRightButton.setOnClickListener(view1 -> {
            GenerateImage();
        });
        EyeLeftButton = view.findViewById(R.id.EyesLeftButton);
        EyeLeftButton.setOnClickListener(view1 -> {
            GenerateImage();
        });
        EyeRightButton = view.findViewById(R.id.EyesRightButton);
        EyeRightButton.setOnClickListener(view1 -> {
            GenerateImage();
        });
        FaceLeftButton = view.findViewById(R.id.FaceLeftButton);
        FaceLeftButton.setOnClickListener(view1 -> {
            GenerateImage();
        });
        FaceRightButton = view.findViewById(R.id.FaceRightButton);
        FaceRightButton.setOnClickListener(view1 -> {
            GenerateImage();
        });
        SkinColourLeftButton = view.findViewById(R.id.SkinColourLeftButton);
        SkinColourLeftButton.setOnClickListener(view1 -> {
            GenerateImage();
        });
        SkinColourRightButton = view.findViewById(R.id.SkinColourRightButton);
        SkinColourRightButton.setOnClickListener(view1 -> {
            GenerateImage();
        });
        BodyTypeLeftButton = view.findViewById(R.id.BodyTypeLeftButton);
        BodyTypeLeftButton.setOnClickListener(view1 -> {
            GenerateImage();
        });
        BodyTypeRightButton = view.findViewById(R.id.BodyTypeRightButton);
        BodyTypeRightButton.setOnClickListener(view1 -> {
            GenerateImage();
        });
        SpecialLeftButton = view.findViewById(R.id.SpecialLeftButton);
        SpecialLeftButton.setOnClickListener(view1 -> {
            GenerateImage();
        });
        SpecialRightButton = view.findViewById(R.id.SpecialRightButton);
        SpecialRightButton.setOnClickListener(view1 -> {
            GenerateImage();
        });
        TypeLeftButton = view.findViewById(R.id.TypeLeftButton);
        TypeLeftButton.setOnClickListener(view1 -> {
            GenerateImage();
        });
        TypeRightButton = view.findViewById(R.id.TypeRightButton);
        TypeRightButton.setOnClickListener(view1 -> {
            GenerateImage();
        });


        return view;
    }

    public void GenerateImage() {
        ImageString = "cc000000000";
        //TODO: set the image
    }

}