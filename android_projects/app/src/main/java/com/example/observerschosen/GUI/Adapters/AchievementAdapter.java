package com.example.observerschosen.GUI.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.observerschosen.GUI.Items.AdapterItems.AchievementItem;
import com.example.observerschosen.R;

import java.util.LinkedList;

public class AchievementAdapter extends RecyclerView.Adapter<AchievementAdapter.AchievementViewHolder>{

    private final LinkedList<AchievementItem> mLocationList;
    private final LayoutInflater mInflater;

    class AchievementViewHolder extends RecyclerView.ViewHolder {
        public final TextView CharacterNameItemView;
        public final ImageView CharacterImageItemView;
        private final Context context;
        final AchievementAdapter mAdapter;


        public AchievementViewHolder(View itemView, AchievementAdapter adapter) {
            super(itemView);
            context= itemView.getContext();
            CharacterNameItemView = itemView.findViewById(R.id.AchievementName);
            CharacterImageItemView = itemView.findViewById(R.id.AchievmentButton);
            this.mAdapter = adapter;
        }
    }

    public AchievementAdapter(Context context, LinkedList<AchievementItem> projectList) {
        mInflater = LayoutInflater.from(context);
        this.mLocationList = projectList;
    }

    @Override
    public AchievementAdapter.AchievementViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.item_achievement, parent, false);
        return new AchievementAdapter.AchievementViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(AchievementAdapter.AchievementViewHolder holder, int position) {
        AchievementItem current = mLocationList.get(position);
        boolean mUnlocked = current.isUnlocked();
        String mCurrent;
        String pCurrent;
        if (mUnlocked){
            mCurrent = current.getAchievementName();
            pCurrent = current.getAchievementImagePath();
        }else{
            mCurrent = "???";
            pCurrent = "Unlocked";
        }
        holder.CharacterNameItemView.setText(mCurrent);
//        holder.CharacterImageItemView.setImageResource();
        }


    @Override
    public int getItemCount() {
        return mLocationList.size();
    }





}
