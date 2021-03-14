package com.example.observerschosen.GUI.fragments.firstLevel;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.observerschosen.GUI.Adapters.CharacterAdapter;
import com.example.observerschosen.GUI.Items.AdapterItems.CharItem;
import com.example.observerschosen.GUI.Items.Character;
import com.example.observerschosen.GUI.Items.Equiptment;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;

public class CodexFragment extends Fragment {

    private LinkedList<CharItem> characterList;
    private LinkedList<CharItem> EnemyList;
    private LinkedList<CharItem> NPCList;
    private LinkedList<CharItem> ItemList;
    private RecyclerView mRecyclerView;
    private CharacterAdapter mAdapter;

    public FloatingActionButton CharacterButton;
    public FloatingActionButton EnemyButton;
    public FloatingActionButton ItemButton;
    public FloatingActionButton NPCButton;
    public FloatingActionButton backbutton;
    public MainActivity mainActivity;

    public TextView TitelTextView;
    public ImageView CodexImageView;

    public int numberOfColumns = 3;


    public CodexFragment(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        // Required empty public constructor
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EnemyList = mainActivity.getMainViewModel().getEnemyList();
        characterList = mainActivity.getMainViewModel().getCharacterList();
        NPCList = mainActivity.getMainViewModel().getNPCList();
        ItemList = mainActivity.getMainViewModel().getItemList();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_codex, container, false);
        // Inflate the layout for this fragment

        TitelTextView = view.findViewById(R.id.CodexTitel);
        CodexImageView = view.findViewById(R.id.CodexImage);

        CharacterButton = view.findViewById(R.id.CharactersCodexButton);
        CharacterButton.setOnClickListener(v -> {
            mAdapter = new CharacterAdapter(getContext(), characterList, mainActivity);
            // Connect the adapter with the recycler view.
            mRecyclerView.setAdapter(mAdapter);
            // Give the recycler view a default layout manager.

            mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), numberOfColumns));
            TitelTextView.setText("Character Codex");
            CodexImageView.setImageResource(R.mipmap.ic_charcodex_foreground);

//TODO: change colors
        });

        EnemyButton = view.findViewById(R.id.EnemyCodexButton);
        EnemyButton.setOnClickListener(v -> {
            mAdapter = new CharacterAdapter(getContext(), EnemyList, mainActivity);
            // Connect the adapter with the recycler view.
            mRecyclerView.setAdapter(mAdapter);
            // Give the recycler view a default layout manager.
            mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), numberOfColumns));
            TitelTextView.setText("Enemy Codex");
            CodexImageView.setImageResource(R.mipmap.ic_enemycodex_foreground);
            //TODO: change colors
        });

        NPCButton = view.findViewById(R.id.NPCCodexButton);
        NPCButton.setOnClickListener(v -> {
            mAdapter = new CharacterAdapter(getContext(), NPCList, mainActivity);
            // Connect the adapter with the recycler view.
            mRecyclerView.setAdapter(mAdapter);
            // Give the recycler view a default layout manager.
            mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), numberOfColumns));
            TitelTextView.setText("NPC Codex");
            CodexImageView.setImageResource(R.mipmap.ic_npccodex_foreground);
            //TODO: change colors
        });

        ItemButton = view.findViewById(R.id.ItemCodexButton);
        ItemButton.setOnClickListener(v -> {
            mAdapter = new CharacterAdapter(getContext(), ItemList, mainActivity);
            // Connect the adapter with the recycler view.
            mRecyclerView.setAdapter(mAdapter);
            // Give the recycler view a default layout manager.
            mRecyclerView.setLayoutManager(new GridLayoutManager(getContext(), numberOfColumns));
            TitelTextView.setText("Item Codex");
            CodexImageView.setImageResource(R.mipmap.ic_itemcodex_foreground);
            //TODO: change colors
        });

        backbutton = view.findViewById(R.id.CodexBackButton);
        backbutton.setOnClickListener(v -> {
            FragmentTransaction transaction = mainActivity.getSupportFragmentManager().beginTransaction();
            transaction.remove(this).commit();
            ConstraintLayout sidebanner = mainActivity.findViewById(R.id.SideBanner);
            sidebanner.setVisibility(View.VISIBLE);
        });
        mRecyclerView = view.findViewById(R.id.CodexRecyclerview);
        CharacterButton.performClick();
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

    }
}