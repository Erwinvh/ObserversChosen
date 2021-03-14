package com.example.observerschosen.GUI.fragments.secondLevel;

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


public class WorkbenchFragment extends Fragment {

    public MainActivity mainActivity;

    public FloatingActionButton backButton;
    public Button upgradeButton;
    public TextView UpgradeCostText;
    public TextView WorkbenchCardName;
    public ImageView WorkbenchImage;

    public TextView levelText;
    public TextView nextLevelText;

//TODO: add all armory and up[grade stats of the workbench

    public WorkbenchFragment(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_workbench, container, false);
        backButton = view.findViewById(R.id.WorkbenchUpgradeBackButton);
        backButton.setOnClickListener(view1 -> {
            mainActivity.getSupportFragmentManager().beginTransaction().remove(this).commit();
        });
        upgradeButton = view.findViewById(R.id.WorkbenchUpgradeButton);
        upgradeButton.setOnClickListener(view1 -> {
            //TODO: implement upgrade
        });
        WorkbenchCardName = view.findViewById(R.id.WorkbenchTitel);
        //TODO set correct level value
        UpgradeCostText = view.findViewById(R.id.WorkbenchUpgradeCost);

        WorkbenchImage = view.findViewById(R.id.WorkbenchImageView);

        levelText = view.findViewById(R.id.WorkbenchLevelN);

        nextLevelText = view.findViewById(R.id.WorkbenchLevelN1);

        return view;
    }
}