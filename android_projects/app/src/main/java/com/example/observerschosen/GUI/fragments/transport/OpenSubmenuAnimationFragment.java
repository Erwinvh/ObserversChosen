package com.example.observerschosen.GUI.fragments.transport;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;


public class OpenSubmenuAnimationFragment extends Fragment {

public MainActivity mainActivity;
public ImageView animationView;


    public OpenSubmenuAnimationFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_open_submenu_animation, container, false);
        animationView = view.findViewById(R.id.OpenSubmenuImageView);
        //TODO: select correct animation
        //TODO: open correct fragment with a fade in custom animation
        //TODO: make this get removed from fragment container once the animation is done
        return view;
    }
}