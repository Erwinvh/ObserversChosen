package com.example.observerschosen.GUI.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.observerschosen.GUI.Items.AdapterItems.MarketStallItem;
import com.example.observerschosen.R;

import java.util.LinkedList;

public class MarketStallAdapter extends RecyclerView.Adapter<MarketStallAdapter.MarketStallViewHolder> {
    private final LinkedList<MarketStallItem> mLocationList;
    private final LayoutInflater mInflater;

    class MarketStallViewHolder extends RecyclerView.ViewHolder {
        public final TextView stallNameView;
        public final ImageView stallImageView;
        public final ConstraintLayout stallConstraintLayout;
        private final Context context;
        final MarketStallAdapter mAdapter;


        public MarketStallViewHolder(View itemView, MarketStallAdapter adapter) {
            super(itemView);
            context = itemView.getContext();
            stallNameView = itemView.findViewById(R.id.StallName);
            stallImageView = itemView.findViewById(R.id.stallImageView);
            stallConstraintLayout = itemView.findViewById(R.id.StallLayout);
            this.mAdapter = adapter;
        }
    }

    public MarketStallAdapter(Context context, LinkedList<MarketStallItem> projectList) {
        mInflater = LayoutInflater.from(context);
        this.mLocationList = projectList;
    }

    @Override
    public MarketStallAdapter.MarketStallViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.item_marketstall, parent, false);
        return new MarketStallAdapter.MarketStallViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(MarketStallAdapter.MarketStallViewHolder holder, int position) {
        MarketStallItem current = mLocationList.get(position);
        String nCurrent = current.getMarketStallPurpose();
        String iCurrent = current.getImagePath();
        String tCurrent = current.getStallType();
        holder.stallNameView.setText(nCurrent);
        //TODO: fix image works
//        holder.CharacterImageItemView.setImageDrawable();
        switch (tCurrent) {

            case "Smith":
                switch (nCurrent) {
                    case "Buy/Sell":
                        holder.stallConstraintLayout.setOnClickListener(view -> {
                            Toast.makeText(view.getContext(), "Smith: BuySell", Toast.LENGTH_SHORT).show();
                            //TODO: open popup to the the correct screen
                        });
                        break;
                    case "Craft":
                        holder.stallConstraintLayout.setOnClickListener(view -> {
                            Toast.makeText(view.getContext(), "Smith: Craft", Toast.LENGTH_SHORT).show();
                            //TODO: open popup to the the correct screen
                        });

                        break;
                    case "Temper":
                        holder.stallConstraintLayout.setOnClickListener(view -> {
                            Toast.makeText(view.getContext(), "Smith: Temper", Toast.LENGTH_SHORT).show();
                            //TODO: open popup to the the correct screen
                        });


                        break;
                }

                break;
            case "General":
                switch (nCurrent) {
                    case "Buy/Sell":
                        holder.stallConstraintLayout.setOnClickListener(view -> {
                            Toast.makeText(view.getContext(), "General: BuySell", Toast.LENGTH_SHORT).show();
                            //TODO: open popup to the the correct screen
                        });
                        break;
                    case "Craft":
                        holder.stallConstraintLayout.setOnClickListener(view -> {
                            Toast.makeText(view.getContext(), "General: Craft", Toast.LENGTH_SHORT).show();
                            //TODO: open popup to the the correct screen
                        });

                        break;
                    case "Improve":
                        holder.stallConstraintLayout.setOnClickListener(view -> {
                            Toast.makeText(view.getContext(), "General: Improve", Toast.LENGTH_SHORT).show();
                            //TODO: open popup to the the correct screen
                        });

                        break;
                    case "Experiment":
                        holder.stallConstraintLayout.setOnClickListener(view -> {
                            Toast.makeText(view.getContext(), "General: Experiment", Toast.LENGTH_SHORT).show();
                            //TODO: open popup to the the correct screen
                        });

                        break;
                }

                break;

            case "Observer":
                switch (nCurrent) {
                    case "Buy/Sell":
                        holder.stallConstraintLayout.setOnClickListener(view -> {
                            Toast.makeText(view.getContext(), "Observer: BuySell", Toast.LENGTH_SHORT).show();
                            //TODO: open popup to the the correct screen
                        });
                        break;
                    case "Craft":
                        holder.stallConstraintLayout.setOnClickListener(view -> {
                            Toast.makeText(view.getContext(), "Observer: Craft", Toast.LENGTH_SHORT).show();
                            //TODO: open popup to the the correct screen
                        });

                        break;
                    case "Watch":
                        holder.stallConstraintLayout.setOnClickListener(view -> {
                            Toast.makeText(view.getContext(), "Observer: Watch", Toast.LENGTH_SHORT).show();
                            //TODO: open popup to the the correct screen
                        });

                        break;
                    case "Experiment":
                        holder.stallConstraintLayout.setOnClickListener(view -> {
                            Toast.makeText(view.getContext(), "Observer: Experiment", Toast.LENGTH_SHORT).show();
                            //TODO: open popup to the the correct screen
                        });

                        break;
                }

                break;


        }

    }

    @Override
    public int getItemCount() {
        return mLocationList.size();
    }


}
