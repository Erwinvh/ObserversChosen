package com.example.observerschosen.GUI.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.observerschosen.GUI.Items.AdapterItems.MapItem;
import com.example.observerschosen.GUI.Items.AdapterItems.TeamsItem;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.GUI.fragments.secondLevel.TeamOverviewFragment;
import com.example.observerschosen.R;

import java.util.LinkedList;

public class MapAdapter extends RecyclerView.Adapter<MapAdapter.MapViewHolder> {

    private final LinkedList<MapItem> mLocationList;
    private final LayoutInflater mInflater;

    public MainActivity mainActivity;

    class MapViewHolder extends RecyclerView.ViewHolder {

        private final Context context;
        final MapAdapter mAdapter;

        public TextView MapName;
        public Button MapUpgradeButton;
public TextView upgradeAmountText;
        public ImageView MapImage;

        public MapViewHolder(View itemView, MapAdapter adapter) {
            super(itemView);
            context = itemView.getContext();
            MapName = itemView.findViewById(R.id.MapName);
            MapUpgradeButton = itemView.findViewById(R.id.MapUpgradeButton);
            MapImage = itemView.findViewById(R.id.TeamBanner);
            upgradeAmountText = itemView.findViewById(R.id.MapUpgradeAmountTextView);
            this.mAdapter = adapter;
        }
    }

    public MapAdapter(Context context, LinkedList<MapItem> projectList, MainActivity mainActivity) {
        mInflater = LayoutInflater.from(context);
        this.mLocationList = projectList;
        this.mainActivity = mainActivity;
    }


    @Override
    public MapAdapter.MapViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.item_map, parent, false);
        return new MapAdapter.MapViewHolder(mItemView, this);
    }


    @Override
    public void onBindViewHolder(MapAdapter.MapViewHolder holder, int position) {
        MapItem current = mLocationList.get(position);
        holder.MapName.setText(new StringBuilder().append(current.getMapName()).append(" Level ").append(current.getMapLevel()).toString());
        holder.upgradeAmountText.setText(current.getCurrentUpgradeCost());
        holder.MapUpgradeButton.setOnClickListener(view -> {
            //TODO: open dialog to check
        });
        if (current.getMapLevel()==0){
            holder.MapUpgradeButton.setText("Unlock");
        }
        //TODO: fix image
    }


    @Override
    public int getItemCount() {
        return mLocationList.size();
    }


}
