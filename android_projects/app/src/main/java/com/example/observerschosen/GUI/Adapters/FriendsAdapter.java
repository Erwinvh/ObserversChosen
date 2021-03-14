package com.example.observerschosen.GUI.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.observerschosen.GUI.Items.AdapterItems.FriendsItem;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.GUI.fragments.secondLevel.FriendOverviewFragment;
import com.example.observerschosen.R;

import java.util.LinkedList;

public class FriendsAdapter extends RecyclerView.Adapter<FriendsAdapter.FriendViewHolder> {

    private final LinkedList<FriendsItem> mLocationList;
    private final LayoutInflater mInflater;
    public MainActivity mainActivity;
    public boolean isFirstLevel;
    public boolean isClickable;

    class FriendViewHolder extends RecyclerView.ViewHolder {

        private final Context context;
        final FriendsAdapter mAdapter;

        public TextView FriendNameView;
        public TextView FriendLevelView;
        public TextView LastActiveView;
        public TextView FriendshipLevel;
        public ImageView FriendImageView;

        public ConstraintLayout FriendLayout;

        public FriendViewHolder(View itemView, FriendsAdapter adapter) {
            super(itemView);
            context = itemView.getContext();
            FriendNameView = itemView.findViewById(R.id.FriendName);
            FriendLevelView = itemView.findViewById(R.id.FriendLevel);
            FriendImageView = itemView.findViewById(R.id.FriendImage);
            LastActiveView = itemView.findViewById(R.id.FriendLastPlayed);
            FriendshipLevel = itemView.findViewById(R.id.FriendShipLevel);
            FriendLayout = itemView.findViewById(R.id.FriendLayout);
            this.mAdapter = adapter;
        }
    }

    public FriendsAdapter(Context context, LinkedList<FriendsItem> projectList, MainActivity mainActivity, boolean isFirstLevel, boolean isClickable) {
        mInflater = LayoutInflater.from(context);
        this.mLocationList = projectList;
        this.mainActivity = mainActivity;
        this.isFirstLevel = isFirstLevel;
        this.isClickable = isClickable;
    }


    @Override
    public FriendsAdapter.FriendViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.item_friend, parent, false);
        return new FriendsAdapter.FriendViewHolder(mItemView, this);
    }


    @Override
    public void onBindViewHolder(FriendsAdapter.FriendViewHolder holder, int position) {
        FriendsItem current = mLocationList.get(position);
        holder.FriendNameView.setText(current.getFriendName());
        holder.LastActiveView.setText(current.getLastActive());
        holder.FriendLevelView.setText("Level: " + current.getFriendLevel());
        holder.FriendshipLevel.setText("Friendship level: " + current.getFriendshipLevel());
        if (isClickable) {
            holder.FriendLayout.setOnClickListener(view -> {
                mainActivity.toggleMainBar(false);
                mainActivity.getSupportFragmentManager().beginTransaction().add(R.id.MainFragmentContainer, new FriendOverviewFragment(mainActivity, current, isFirstLevel)).commit();
            });
        }
    }


    @Override
    public int getItemCount() {
        return mLocationList.size();
    }


}
