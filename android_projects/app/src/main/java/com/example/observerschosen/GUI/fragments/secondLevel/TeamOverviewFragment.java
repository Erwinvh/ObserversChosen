package com.example.observerschosen.GUI.fragments.secondLevel;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
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

import com.example.observerschosen.GUI.Adapters.ChatMessageAdapter;
import com.example.observerschosen.GUI.Adapters.FriendsAdapter;
import com.example.observerschosen.GUI.Items.AdapterItems.ChatMessageItem;
import com.example.observerschosen.GUI.Items.AdapterItems.FriendsItem;
import com.example.observerschosen.GUI.Items.AdapterItems.TeamsItem;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;


public class TeamOverviewFragment extends Fragment {

    public MainActivity mainActivity;
    public LinkedList<ChatMessageItem> chatMessages;
    public LinkedList<FriendsItem> members;

    public TeamsItem subject;

    public FloatingActionButton backButton;
    public FloatingActionButton sendChatMessageButton;

    public Button MembersButton;
    public Button ChatButton;
    public Button ActivateTeamButton;
    public Button LeaveTeamButton;

    public ProgressBar TeamProgressBar;

    public ImageView TeamIcon;

    public EditText ChatMessageField;

    public TextView TeamName;
    public TextView TeamLevel;
    public TextView TeamComeTogether;

    public RecyclerView TeamRecycler;

    public TeamOverviewFragment(MainActivity mainActivity, TeamsItem subject) {
        // Required empty public constructor
        this.mainActivity = mainActivity;
        this.subject = subject;
        members = mainActivity.getMainViewModel().getTeamMembersList(subject);
        chatMessages = mainActivity.getMainViewModel().getTeamChatMessages(subject);

    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_team_overview, container, false);
        backButton = view.findViewById(R.id.TeamOverViewBackButton);
        backButton.setOnClickListener(view1 -> {
            mainActivity.toggleMainBar(true);
            mainActivity.getSupportFragmentManager().beginTransaction().remove(this).commit();
        });
        ChatMessageField = view.findViewById(R.id.TeamChatMessageArea);
        sendChatMessageButton = view.findViewById(R.id.SendTeamChatMessageButton);
        sendChatMessageButton.setOnClickListener(view1 -> {
            //TODO: send ChatMessage (Netwerking)
        });

        MembersButton = view.findViewById(R.id.ShowTeamMembersButton);
        MembersButton.setOnClickListener(view1 -> {
            FriendsAdapter mAdapter = new FriendsAdapter(getContext(), members, mainActivity, false, true);
            TeamRecycler.setAdapter(mAdapter);
            TeamRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
            sendChatMessageButton.setVisibility(View.GONE);
            ChatMessageField.setVisibility(View.GONE);
        });
        ChatButton = view.findViewById(R.id.ShowChatMessagesButton);
        ChatButton.setOnClickListener(view1 -> {
            ChatMessageAdapter mAdapter = new ChatMessageAdapter(getContext(), chatMessages);
            TeamRecycler.setAdapter(mAdapter);
            TeamRecycler.setLayoutManager(new LinearLayoutManager(getContext()));
            sendChatMessageButton.setVisibility(View.VISIBLE);
            ChatMessageField.setVisibility(View.VISIBLE);
        });
        ActivateTeamButton = view.findViewById(R.id.ActivateTeamButton);
        ActivateTeamButton.setOnClickListener(view1 -> {
            //TODO: activate Team (Netwerking)
        });
        LeaveTeamButton = view.findViewById(R.id.LeaveTeamButton);
        LeaveTeamButton.setOnClickListener(view1 -> {
            //TODO: leave Team (Netwerking)
        });

        TeamProgressBar = view.findViewById(R.id.TeamProgressbar);


        TeamIcon = view.findViewById(R.id.TeamOverViewIcon);
        //TODO: set Image


        TeamName = view.findViewById(R.id.TeamNameOverview);
        TeamLevel = view.findViewById(R.id.TeamLevelField);
        TeamComeTogether = view.findViewById(R.id.TeamAssemblyDate);

        TeamRecycler = view.findViewById(R.id.TeamOverViewRecycler);

        MembersButton.performClick();
        return view;
    }
}