package com.example.observerschosen.GUI.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.observerschosen.GUI.Items.AdapterItems.QuestItem;
import com.example.observerschosen.GUI.Items.AdapterItems.QuestRewardItem;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.GUI.fragments.secondLevel.QuestOverviewFragment;
import com.example.observerschosen.R;

import java.util.LinkedList;

public class QuestRewardAdapter extends RecyclerView.Adapter<QuestRewardAdapter.QuestRewardViewHolder>{

    private final LinkedList<QuestRewardItem> mLocationList;
    private final LayoutInflater mInflater;

    public MainActivity mainActivity;

    class QuestRewardViewHolder extends RecyclerView.ViewHolder {

        private final Context context;
        final QuestRewardAdapter mAdapter;

        public TextView QuestRewardTextView;
        public ImageView QuestRewardImageView;

        public ConstraintLayout QuestRewardLayout;

        public QuestRewardViewHolder(View itemView, QuestRewardAdapter adapter) {
            super(itemView);
            context= itemView.getContext();
            QuestRewardTextView = itemView.findViewById(R.id.QuestRewardAmount);
            QuestRewardImageView = itemView.findViewById(R.id.QuestRewardImage);
            QuestRewardLayout = itemView.findViewById(R.id.QuestRewardLayout);
            this.mAdapter = adapter;
        }
    }

    public QuestRewardAdapter(Context context, LinkedList<QuestRewardItem> projectList, MainActivity mainActivity) {
        mInflater = LayoutInflater.from(context);
        this.mLocationList = projectList;
        this.mainActivity = mainActivity;
    }

    @Override
    public QuestRewardAdapter.QuestRewardViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.item_quest, parent, false);
        return new QuestRewardAdapter.QuestRewardViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(QuestRewardAdapter.QuestRewardViewHolder holder, int position) {
        QuestRewardItem current = mLocationList.get(position);


    }

    @Override
    public int getItemCount() {
        return mLocationList.size();
    }


}
