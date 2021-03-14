package com.example.observerschosen.GUI.fragments.secondLevel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.observerschosen.GUI.Items.Character;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class CharacterOverviewFragment extends Fragment {

    public MainActivity mainActivity;
    public Character subject;

    public FloatingActionButton backButton;
    public FloatingActionButton audioButton;
    public FloatingActionButton observersCommentsButton;

    public ProgressBar XPProgress;
    public ProgressBar healthBar;
    public ProgressBar PiecesProgressbar;

    public TextView charName;
    public TextView charLevel;
    public TextView charXPPart;
    public TextView charAttack;
    public TextView charDefense;
    public TextView charBio;
    public TextView charHealthtitle;
    public ProgressBar charHealthProgress;

    public TextView charDefTitel;
    public TextView charAtckTitel;

    public ImageView charImage;

    public CharacterOverviewFragment(MainActivity mainActivity, Character subject) {

        this.mainActivity = mainActivity;
        this.subject = subject;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_character_overview, container, false);
        backButton = view.findViewById(R.id.CharOverViewBackButton);
        backButton.setOnClickListener(view1 -> {
            mainActivity.getSupportFragmentManager().beginTransaction().remove(this).commit();
        });

        charName = view.findViewById(R.id.CharacterOverviewName);
        charName.setText(subject.getCharacterName());

        charLevel = view.findViewById(R.id.CharacterOverViewLevel);

        charImage = view.findViewById(R.id.CharacterOverviewImage);
        //TODO: select the image and place it
        charAtckTitel = view.findViewById(R.id.CharAttackTitel);
        charDefTitel = view.findViewById(R.id.CharDefenseTitel);

        charDefense = view.findViewById(R.id.CharOVDefenseField);
        charAttack = view.findViewById(R.id.CharOVAttackField);

        charBio = view.findViewById(R.id.CharOVBioField);
        charBio.setText(subject.getBio());

        charHealthtitle = view.findViewById(R.id.CharHealthText);
        charHealthProgress = view.findViewById(R.id.CharHealthProgress);

        charXPPart = view.findViewById(R.id.CharOverViewXPPart);
        charXPPart.setText(""+subject.getXP());

        switch(subject.getCharType()){
            case "NPC":
                charLevel.setText("Friendship level: " + subject.getLevel());
                charAtckTitel.setVisibility(View.GONE);
                charDefTitel.setVisibility(View.GONE);
                charAttack.setVisibility(View.GONE);
                charDefense.setVisibility(View.GONE);
                charHealthProgress.setVisibility(View.GONE);
                charHealthtitle.setVisibility(View.GONE);
                break;
            case "Enemy":
                charLevel.setText("Knowledge level: " + subject.getLevel());
                charDefense.setVisibility(View.GONE);
                charDefTitel.setVisibility(View.GONE);
                charAttack.setText("" + subject.getAttack());
                charHealthProgress.setVisibility(View.GONE);
                charHealthtitle.setVisibility(View.GONE);
                break;
            case "Companion":
                charLevel.setText("Level: " + subject.getLevel());
                charAttack.setVisibility(View.VISIBLE);
                charAtckTitel.setVisibility(View.VISIBLE);
                charDefense.setVisibility(View.VISIBLE);
                charDefTitel.setVisibility(View.VISIBLE);
                charAttack.setText("" + subject.getAttack());
                charDefense.setText("" + subject.getDefense());

                break;
        }







        // Inflate the layout for this fragment
        return view;
    }
}