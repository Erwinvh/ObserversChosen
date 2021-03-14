package com.example.observerschosen.GUI.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.observerschosen.GUI.Items.AdapterItems.QuestItem;
import com.example.observerschosen.GUI.Items.AdapterItems.QuestObjectiveItem;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.GUI.fragments.secondLevel.QuestOverviewFragment;
import com.example.observerschosen.R;

import java.util.LinkedList;

public class QuestObjectiveAdapter extends RecyclerView.Adapter<QuestObjectiveAdapter.QuestObjectiveViewHolder>{


    private final LinkedList<QuestObjectiveItem> mLocationList;
    private final LayoutInflater mInflater;

    public MainActivity mainActivity;

    class QuestObjectiveViewHolder extends RecyclerView.ViewHolder {

        private final Context context;
        final QuestObjectiveAdapter mAdapter;

        public TextView QuestObjectiveDescription;
        public ProgressBar QuestObjectiveProgress;
        public ImageView QuestObjectiveImageView;

        public ConstraintLayout QuestObjectiveLayout;

        public QuestObjectiveViewHolder(View itemView, QuestObjectiveAdapter adapter) {
            super(itemView);
            context= itemView.getContext();
            QuestObjectiveDescription = itemView.findViewById(R.id.QuestObjectiveDescription);
            QuestObjectiveImageView = itemView.findViewById(R.id.QuestObjectiveImage);
            QuestObjectiveProgress = itemView.findViewById(R.id.QuestObjectiveProgress);
            QuestObjectiveLayout = itemView.findViewById(R.id.QuestObjectiveLayout);
            this.mAdapter = adapter;
        }
    }

    public QuestObjectiveAdapter(Context context, LinkedList<QuestObjectiveItem> projectList, MainActivity mainActivity) {
        mInflater = LayoutInflater.from(context);
        this.mLocationList = projectList;
        this.mainActivity = mainActivity;
    }

    @Override
    public QuestObjectiveAdapter.QuestObjectiveViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.item_quest, parent, false);
        return new QuestObjectiveAdapter.QuestObjectiveViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(QuestObjectiveAdapter.QuestObjectiveViewHolder holder, int position) {
        QuestObjectiveItem current = mLocationList.get(position);


    }

    @Override
    public int getItemCount() {
        return mLocationList.size();
    }



}
