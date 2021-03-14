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
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.GUI.fragments.secondLevel.QuestOverviewFragment;
import com.example.observerschosen.R;

import java.util.LinkedList;

public class QuestAdapter extends RecyclerView.Adapter<QuestAdapter.QuestViewHolder>{

    private final LinkedList<QuestItem> mLocationList;
    private final LayoutInflater mInflater;

    public MainActivity mainActivity;

    class QuestViewHolder extends RecyclerView.ViewHolder {

        private final Context context;
        final QuestAdapter mAdapter;

        public TextView QuestTitleView;
        public TextView QuestDescriptionView;
        public TextView QuestDateTimeView;
        public ImageView QuestImageView;

        public ConstraintLayout QuestLayout;

        public QuestViewHolder(View itemView, QuestAdapter adapter) {
            super(itemView);
            context= itemView.getContext();
            QuestTitleView = itemView.findViewById(R.id.QuestName);
            QuestDescriptionView = itemView.findViewById(R.id.QuestDescription);
            QuestDateTimeView = itemView.findViewById(R.id.QuestDateTime);
            QuestImageView = itemView.findViewById(R.id.QuestImage);
            QuestLayout = itemView.findViewById(R.id.QuestLayout);
            this.mAdapter = adapter;
        }
    }

    public QuestAdapter(Context context, LinkedList<QuestItem> projectList, MainActivity mainActivity) {
        mInflater = LayoutInflater.from(context);
        this.mLocationList = projectList;
        this.mainActivity = mainActivity;
    }

    @Override
    public QuestAdapter.QuestViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.item_quest, parent, false);
        return new QuestViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(QuestAdapter.QuestViewHolder holder, int position) {
        QuestItem current = mLocationList.get(position);
        String mCurrent = current.getQuestName();
        holder.QuestTitleView.setText(mCurrent);
        String pCurrent = current.imagePath;
//        holder.distanceItemView.setText(pCurrent);
        String dCurrent = current.getEndDateTime();
        if(dCurrent.equals("")){
            //item gone
            holder.QuestDateTimeView.setVisibility(View.GONE);
        }else{
            //TODO: add check for date time
            String text = "Date of expire: " + dCurrent;
            holder.QuestDateTimeView.setText(text);
        }
        String desCurrent = current.getQuestDescription();
        holder.QuestDescriptionView.setText(desCurrent);

        holder.QuestLayout.setOnClickListener(view -> {
            mainActivity.toggleMainBar(false);
            mainActivity.getSupportFragmentManager().beginTransaction().add(R.id.MainFragmentContainer, new QuestOverviewFragment(mainActivity, current)).commit();
        });

    }

    @Override
    public int getItemCount() {
        return mLocationList.size();
    }




















}
