package com.example.observerschosen.GUI.fragments.firstLevel;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.GUI.fragments.secondLevel.ResourceChestFragment;
import com.example.observerschosen.GUI.fragments.secondLevel.ToolUpgradeFragment;
import com.example.observerschosen.GUI.fragments.secondLevel.WorkbenchFragment;
import com.example.observerschosen.GUI.fragments.secondLevel.WorldMapUpgradeFragment;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class BaseBuildingFragment extends Fragment {

public MainActivity mainActivity;
public FloatingActionButton backbutton;

public ConstraintLayout StorageConstraint;
public ConstraintLayout UpgradeConstraint;
public ConstraintLayout ToolsConstraint;
public ConstraintLayout MapConstraint;

    public BaseBuildingFragment(MainActivity mainActivity) {
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
        View view = inflater.inflate(R.layout.fragment_base_building, container, false);

        backbutton = view.findViewById(R.id.BaseBackButton);
        backbutton.setOnClickListener(v -> {
            FragmentTransaction transaction = mainActivity.getSupportFragmentManager().beginTransaction();
            transaction.remove(this).commit();
            ConstraintLayout sidebanner = mainActivity.findViewById(R.id.SideBanner);
            sidebanner.setVisibility(View.VISIBLE);
        });

        StorageConstraint = view.findViewById(R.id.StorageContainer);
        StorageConstraint.setOnClickListener(view1 -> {
            mainActivity.getSupportFragmentManager().beginTransaction()
                    .add(R.id.MainFragmentContainer, new ResourceChestFragment(mainActivity))
                    .commit();
        });
        UpgradeConstraint = view.findViewById(R.id.UpGradeContainer);
        UpgradeConstraint.setOnClickListener(view1 -> {
            mainActivity.getSupportFragmentManager().beginTransaction()
                    .add(R.id.MainFragmentContainer, new WorkbenchFragment(mainActivity))
                    .commit();
        });
        ToolsConstraint = view.findViewById(R.id.ToolsConstraint);
        ToolsConstraint.setOnClickListener(view1 -> {
            mainActivity.getSupportFragmentManager().beginTransaction()
                    .add(R.id.MainFragmentContainer, new ToolUpgradeFragment(mainActivity))
                    .commit();
        });
        MapConstraint = view.findViewById(R.id.MapConstraint);
        MapConstraint.setOnClickListener(view1 -> {
            mainActivity.getSupportFragmentManager().beginTransaction()
                    .add(R.id.MainFragmentContainer, new WorldMapUpgradeFragment(mainActivity))
                    .commit();
        });

        return view;
    }
}