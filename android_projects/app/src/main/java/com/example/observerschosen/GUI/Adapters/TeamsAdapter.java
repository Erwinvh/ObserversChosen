package com.example.observerschosen.GUI.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.observerschosen.GUI.Items.AdapterItems.TeamsItem;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.GUI.fragments.secondLevel.TeamOverviewFragment;
import com.example.observerschosen.R;

import java.util.LinkedList;

public class TeamsAdapter extends RecyclerView.Adapter<TeamsAdapter.TeamViewHolder> {

    private final LinkedList<TeamsItem> mLocationList;
    private final LayoutInflater mInflater;

    public MainActivity mainActivity;

    class TeamViewHolder extends RecyclerView.ViewHolder {

        private final Context context;
        final TeamsAdapter mAdapter;

        public TextView TeamName;
        public TextView TeamLevel;
        public TextView TeamMembers;
        public TextView LastComeTogether;
        public ImageView TeamImage;

        public ConstraintLayout TeamLayout;

        public TeamViewHolder(View itemView, TeamsAdapter adapter) {
            super(itemView);
            context = itemView.getContext();
            TeamName = itemView.findViewById(R.id.TeamName);
            TeamLevel = itemView.findViewById(R.id.TeamLevel);
            TeamMembers = itemView.findViewById(R.id.Members);
            LastComeTogether = itemView.findViewById(R.id.LastActiveTeamDay);
            TeamImage = itemView.findViewById(R.id.TeamBanner);
            TeamLayout = itemView.findViewById(R.id.TeamLayout);
            this.mAdapter = adapter;
        }
    }

    public TeamsAdapter(Context context, LinkedList<TeamsItem> projectList, MainActivity mainActivity) {
        mInflater = LayoutInflater.from(context);
        this.mLocationList = projectList;
        this.mainActivity = mainActivity;
    }


    @Override
    public TeamsAdapter.TeamViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.item_team, parent, false);
        return new TeamsAdapter.TeamViewHolder(mItemView, this);
    }


    @Override
    public void onBindViewHolder(TeamsAdapter.TeamViewHolder holder, int position) {
        TeamsItem current = mLocationList.get(position);
        holder.TeamName.setText(current.getTeamName());
        holder.TeamLevel.setText(""+current.getTeamLevel());
        holder.TeamMembers.setText(""+current.getMemberAmount());
        holder.LastComeTogether.setText(current.getLastActive());
        holder.TeamLayout.setOnClickListener(view -> {
            mainActivity.toggleMainBar(false);
            mainActivity.getSupportFragmentManager().beginTransaction().add(R.id.MainFragmentContainer, new TeamOverviewFragment(mainActivity, current)).commit();
        });
        //TODO: fix image
    }


    @Override
    public int getItemCount() {
        return mLocationList.size();
    }


}
