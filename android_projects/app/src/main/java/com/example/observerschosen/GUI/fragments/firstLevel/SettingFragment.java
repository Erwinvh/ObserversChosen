package com.example.observerschosen.GUI.fragments.firstLevel;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.GUI.fragments.firstLevel.mapFragment;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;


public class SettingFragment extends Fragment {

public FloatingActionButton backbutton;
public MainActivity mainActivity;

    public SettingFragment(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_setting, container, false);

        backbutton = view.findViewById(R.id.SettingsBackButton);
        backbutton.setOnClickListener(v -> {
            FragmentTransaction transaction = mainActivity.getSupportFragmentManager().beginTransaction();
            transaction.remove(this).commit();
            ConstraintLayout sidebanner = mainActivity.findViewById(R.id.SideBanner);
            sidebanner.setVisibility(View.VISIBLE);
        });





        return view;
    }
}