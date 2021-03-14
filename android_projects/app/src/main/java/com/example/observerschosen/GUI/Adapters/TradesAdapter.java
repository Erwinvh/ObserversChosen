package com.example.observerschosen.GUI.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.observerschosen.GUI.Items.AdapterItems.TradesItem;
import com.example.observerschosen.R;

import java.util.LinkedList;

public class TradesAdapter extends RecyclerView.Adapter<TradesAdapter.TradeViewHolder>{

    private final LinkedList<TradesItem> mLocationList;
    private final LayoutInflater mInflater;

    class TradeViewHolder extends RecyclerView.ViewHolder {

        private final Context context;
        final TradesAdapter mAdapter;

        public TextView ReceiverName;
        public TextView requesterName;
        public TextView ReceiveAmount;
        public TextView RequestAmount;
        public TextView TradeStatus;

        public ConstraintLayout TradeLayout;

        public ImageView RequestImageView;
        public ImageView ReceiveImageView;

        public TradeViewHolder(View itemView, TradesAdapter adapter) {
            super(itemView);
            context= itemView.getContext();
            ReceiverName = itemView.findViewById(R.id.ReceiverTradeName);
            requesterName = itemView.findViewById(R.id.RequesterTradeName);
            ReceiveAmount = itemView.findViewById(R.id.ReceiveAmount);
            RequestAmount = itemView.findViewById(R.id.RequestedAmount);
            TradeStatus = itemView.findViewById(R.id.TradeStatus);

            TradeLayout = itemView.findViewById(R.id.TradeLayout);

            RequestImageView = itemView.findViewById(R.id.RequestedMaterialImage);
            ReceiveImageView = itemView.findViewById(R.id.RecieveMaterialImage);
            this.mAdapter = adapter;
        }
    }

    public TradesAdapter(Context context, LinkedList<TradesItem> projectList) {
        mInflater = LayoutInflater.from(context);
        this.mLocationList = projectList;
    }



    @Override
    public TradesAdapter.TradeViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.item_trade, parent, false);
        return new TradesAdapter.TradeViewHolder(mItemView, this);
    }


    @Override
    public void onBindViewHolder(TradesAdapter.TradeViewHolder holder, int position) {
        TradesItem current = mLocationList.get(position);
        holder.TradeLayout.setOnClickListener(view -> {
        //TODO: create the onclick (Dialog)
        });

        holder.RequestAmount.setText(""+current.getRequestedAmount());
        holder.TradeStatus.setText(current.getTradeStatus());
        holder.ReceiveAmount.setText(""+current.getReceivedAmount());
        holder.ReceiverName.setText(current.getReceiverName());
        holder.requesterName.setText(current.getRequesterName());

        //TODO: connect images
    }


    @Override
    public int getItemCount() {
        return mLocationList.size();
    }

}
