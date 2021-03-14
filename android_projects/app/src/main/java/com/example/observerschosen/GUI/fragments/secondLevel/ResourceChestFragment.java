package com.example.observerschosen.GUI.fragments.secondLevel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class ResourceChestFragment extends Fragment {

    public MainActivity mainActivity;
    public FloatingActionButton BackButton;

    public Button upgradeButton;
    public ImageView chestImage;
    public TextView chestTitle;
    public TextView upgradeText;

    public TextView WoodAmount;
    public TextView WoodCard;
    public ProgressBar WoodProgress;

    public TextView StoneAmount;
    public TextView StoneCard;
    public ProgressBar StoneProgress;

    public TextView IronAmount;
    public TextView IronCard;
    public ProgressBar IronProgress;

    public TextView CDustAmount;
    public TextView CDustCard;
    public ProgressBar CDustProgress;

    public ResourceChestFragment(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        //TODO: retrieve from mainviewmodel?
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_resource_chest, container, false);
        BackButton = view.findViewById(R.id.ChestBackButton);
        BackButton.setOnClickListener(view1 -> {
            mainActivity.getSupportFragmentManager().beginTransaction().remove(this).commit();
        });

        upgradeButton = view.findViewById(R.id.ChestUpgradeButton);
        upgradeButton.setOnClickListener(view1 -> {

        });

        chestImage = view.findViewById(R.id.ChestImageView);
        //TODO: setup right image
        chestTitle = view.findViewById(R.id.ResourceChestName);
        //TODO: setup right name with level
        upgradeText = view.findViewById(R.id.ChestUpgradeCostField);
        //TODO: setup correct upgrade cost

        //TODO: setup all material values
        WoodAmount = view.findViewById(R.id.WoodTextField);
        WoodProgress = view.findViewById(R.id.WoodProgress);
        WoodCard = view.findViewById(R.id.WoodChestName);

        StoneAmount = view.findViewById(R.id.StoneTextField);
        StoneProgress = view.findViewById(R.id.StoneProgress);
        StoneCard = view.findViewById(R.id.StoneChestName);

        IronAmount = view.findViewById(R.id.IronTextField);
        IronProgress = view.findViewById(R.id.IronProgress);
        IronCard = view.findViewById(R.id.IronChestName);

        CDustAmount = view.findViewById(R.id.CrystalDustTextField);
        CDustProgress = view.findViewById(R.id.CrystalDustProgress);
        CDustCard = view.findViewById(R.id.CDustChestName);


        return view;
    }
}