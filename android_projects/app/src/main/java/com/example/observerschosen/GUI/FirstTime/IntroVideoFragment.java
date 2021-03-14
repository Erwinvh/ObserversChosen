package com.example.observerschosen.GUI.FirstTime;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.VideoView;

import com.example.observerschosen.R;


public class IntroVideoFragment extends Fragment {

    public VideoView introVideo;

    public IntroVideoFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_intro_video, container, false);
        // Inflate the layout for this fragment
        introVideo = view.findViewById(R.id.videoView);
        return view;
    }
}