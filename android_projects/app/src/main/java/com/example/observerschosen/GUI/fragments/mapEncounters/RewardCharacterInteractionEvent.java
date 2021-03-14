package com.example.observerschosen.GUI.fragments.mapEncounters;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;


public class RewardCharacterInteractionEvent extends Fragment {

    public MainActivity mainActivity;

 public TextView rewardDialogue;
 public TextView rewardTitle;
 public RecyclerView rewardRecycler;
 public ImageView rewardCharacterImage;
 public Button rewardClaimButton;

    public RewardCharacterInteractionEvent(MainActivity mainActivity) {
        // Required empty public constructor
        this.mainActivity = mainActivity;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.event_reward_character_interaction, container, false);

        rewardCharacterImage = view.findViewById(R.id.RewardCharacterInteractEventImage);
        rewardClaimButton = view.findViewById(R.id.RewardCharacterInteractClaimButton);
        rewardClaimButton.setOnClickListener(view1 -> {

        });

        rewardDialogue = view.findViewById(R.id.RewardCharacterInteractDialogue);
        rewardRecycler = view.findViewById(R.id.RewardCharacterInteractRewardRcycler);
        //TODO: set adapter

        rewardTitle = view.findViewById(R.id.RewardCharacterInteractItetle);
        // Inflate the layout for this fragment
        return view;
    }
}