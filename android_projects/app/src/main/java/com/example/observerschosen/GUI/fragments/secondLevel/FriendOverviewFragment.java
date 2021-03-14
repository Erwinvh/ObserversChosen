package com.example.observerschosen.GUI.fragments.secondLevel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.example.observerschosen.GUI.Adapters.CharacterAdapter;
import com.example.observerschosen.GUI.Adapters.ChatMessageAdapter;
import com.example.observerschosen.GUI.Items.AdapterItems.ChatMessageItem;
import com.example.observerschosen.GUI.Items.AdapterItems.FriendsItem;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;


public class FriendOverviewFragment extends Fragment {

    public MainActivity mainActivity;
    public boolean isSecondLevel;
    public FriendsItem subject;

    public LinkedList<ChatMessageItem> chatMessages;

    public FloatingActionButton backButton;
    public FloatingActionButton SendChatMessageButton;

    public Button InviteToPlayButton;
    public Button StartTradeButton;
    public Button RemoveFriendButton;

    public RecyclerView ChatRecycler;

    public EditText ChatMessageField;

    public ImageView FriendImage;

    public TextView FriendName;
    public TextView FriendLevel;
    public TextView FriendGender;
    public TextView FriendRace;
    public TextView FriendAttack;
    public TextView FriendDefense;
    public TextView FriendLastOnline;
    public TextView FriendshipLevel;

    public ProgressBar FriendshipProgress;

    public FriendOverviewFragment(MainActivity mainActivity, FriendsItem subject, boolean isSecondLevel) {
        // Required empty public constructor
        this.mainActivity = mainActivity;
        this.subject = subject;
        this.isSecondLevel = isSecondLevel;
        chatMessages = mainActivity.getMainViewModel().getFriendChatMessages(subject);

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_friend_overview, container, false);
        // Inflate the layout for this fragment
        backButton = view.findViewById(R.id.FriendOverViewBackButton);
        backButton.setOnClickListener(view1 -> {
            if (isSecondLevel) {
                mainActivity.toggleMainBar(true);
            }
            mainActivity.getSupportFragmentManager().beginTransaction().remove(this).commit();
        });
        SendChatMessageButton = view.findViewById(R.id.SendFriendChatMessageButton);
        SendChatMessageButton.setOnClickListener(view1 -> {
            //TODO send chat message (Netwerking)
        });

        InviteToPlayButton = view.findViewById(R.id.InviteToPlayButton);
        InviteToPlayButton.setOnClickListener(view1 -> {
            //TODO: invite another to play via push notification if used in the past day give toast to say you need to wait to use it again (Netwerking)
        });
        StartTradeButton = view.findViewById(R.id.NewTradeFriendButton);
        StartTradeButton.setOnClickListener(view1 -> {
            mainActivity.getSupportFragmentManager().beginTransaction().add(R.id.MainFragmentContainer, new NewMultiplayerFragment(mainActivity, "Trades", subject)).commit();
        });
        RemoveFriendButton = view.findViewById(R.id.DeleteFriendButton);
        RemoveFriendButton.setOnClickListener(view1 -> {
            //TODO: remove friend from DB and server (Netwerking)
        });

        ChatRecycler = view.findViewById(R.id.FriendChatRecycler);
        ChatMessageAdapter mAdapter = new ChatMessageAdapter(getContext(), chatMessages);
        ChatRecycler.setAdapter(mAdapter);
        ChatRecycler.setLayoutManager(new LinearLayoutManager(getContext()));

        ChatMessageField = view.findViewById(R.id.FriendChatMessageField);

        FriendImage = view.findViewById(R.id.FriendOverViewImage);

        FriendName = view.findViewById(R.id.FriendOverviewName);
        FriendName.setText(subject.getFriendName());
        FriendLevel = view.findViewById(R.id.FriendOverviewLevel);
        FriendGender = view.findViewById(R.id.FriendOverViewGender);
        FriendRace = view.findViewById(R.id.FriendRaceOverView);
        FriendAttack = view.findViewById(R.id.FriendAttackOverView);
        FriendDefense = view.findViewById(R.id.FriendDefenseOverView);
        FriendLastOnline = view.findViewById(R.id.FriendOverViewLastOnline);
        FriendshipLevel = view.findViewById(R.id.FriendFriendshipLevel);

        FriendshipProgress = view.findViewById(R.id.FriendFriendshipProgress);


        return view;
    }
}