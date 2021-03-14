package com.example.observerschosen.GUI.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.example.observerschosen.GUI.Items.AdapterItems.ToolItem;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;

import java.util.LinkedList;

public class ToolsAdapter extends RecyclerView.Adapter<ToolsAdapter.ToolsViewHolder>{


    private final LinkedList<ToolItem> mLocationList;
    private final LayoutInflater mInflater;

    public MainActivity mainActivity;

    class ToolsViewHolder extends RecyclerView.ViewHolder {

        private final Context context;
        final ToolsAdapter mAdapter;

        public TextView ToolTitle;
        public ImageView ToolImage;
        public TextView ToolLevel;


        public ToolsViewHolder(View itemView, ToolsAdapter adapter) {
            super(itemView);
            context= itemView.getContext();
            ToolTitle = itemView.findViewById(R.id.ToolName);
            ToolImage = itemView.findViewById(R.id.ToolImageView);
            ToolLevel = itemView.findViewById(R.id.ToolLevel);

            this.mAdapter = adapter;
        }
    }

    public ToolsAdapter(Context context, LinkedList<ToolItem> projectList, MainActivity mainActivity) {
        mInflater = LayoutInflater.from(context);
        this.mLocationList = projectList;
        this.mainActivity = mainActivity;
    }

    @Override
    public ToolsAdapter.ToolsViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.item_tool, parent, false);
        return new ToolsAdapter.ToolsViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(ToolsAdapter.ToolsViewHolder holder, int position) {
        ToolItem current = mLocationList.get(position);
holder.ToolLevel.setText("Level "+current.getCurrentLevel());
holder.ToolTitle.setText(current.getName());

    }

    @Override
    public int getItemCount() {
        return mLocationList.size();
    }






}
