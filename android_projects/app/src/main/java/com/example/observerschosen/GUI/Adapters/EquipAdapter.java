package com.example.observerschosen.GUI.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.observerschosen.GUI.Items.AdapterItems.EquipItem;
import com.example.observerschosen.GUI.Items.AdapterItems.FriendsItem;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.GUI.fragments.secondLevel.FriendOverviewFragment;
import com.example.observerschosen.R;

import java.util.LinkedList;

public class EquipAdapter  extends RecyclerView.Adapter<EquipAdapter.EquipViewHolder> {

    private final LinkedList<EquipItem> mLocationList;
    private final LayoutInflater mInflater;
    public MainActivity mainActivity;

    class EquipViewHolder extends RecyclerView.ViewHolder {

        private final Context context;
        final EquipAdapter mAdapter;

        public TextView EquipName;
        public TextView EquipLevel;
        public TextView EquipPriStat;
        public TextView EquipSecStat;
        public ImageView EquipImage;
        public TextView EquipOrigin;
        public TextView EquipSet;

        public ConstraintLayout EquipLayout;

        public EquipViewHolder(View itemView, EquipAdapter adapter) {
            super(itemView);
            context = itemView.getContext();

            EquipName = itemView.findViewById(R.id.EquipName);
            EquipLevel = itemView.findViewById(R.id.EquipLevel);
            EquipPriStat = itemView.findViewById(R.id.EquipPriStat);
            EquipSecStat = itemView.findViewById(R.id.EquipSecStat);
            EquipImage = itemView.findViewById(R.id.EquipImage);
            EquipOrigin = itemView.findViewById(R.id.EquipOrigin);
            EquipSet = itemView.findViewById(R.id.EquipSet);
            EquipLayout = itemView.findViewById(R.id.EquipLayout);
            this.mAdapter = adapter;
        }
    }

    public EquipAdapter(Context context, LinkedList<EquipItem> projectList, MainActivity mainActivity) {
        mInflater = LayoutInflater.from(context);
        this.mLocationList = projectList;
        this.mainActivity = mainActivity;
    }


    @Override
    public EquipAdapter.EquipViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.item_equip, parent, false);
        return new EquipAdapter.EquipViewHolder(mItemView, this);
    }


    @Override
    public void onBindViewHolder(EquipAdapter.EquipViewHolder holder, int position) {
        EquipItem current = mLocationList.get(position);
        if (current.isCurrent()){
            holder.EquipLayout.setVisibility(View.GONE);
        }else{
            holder.EquipName.setText(current.getName());
            holder.EquipLevel.setText(new StringBuilder().append("Level ").append(current.getEquipLevel()).toString());
            holder.EquipOrigin.setText("Origin: " + current.getOrigin());
            holder.EquipSet.setText("Set: " + current.getSetName());
            holder.EquipPriStat.setText(current.getPriStat()+" " + current.getPrimaryStat());
            holder.EquipSecStat.setText(current.getSecStat()+" " + current.getSecondaryStat());
            //TODO: set image
            //holder.EquipImage
            holder.EquipLayout.setOnClickListener(view -> {
//TODO: open a dialogue
            });
        }

    }


    @Override
    public int getItemCount() {
        return mLocationList.size();
    }



}
