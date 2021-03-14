package com.example.observerschosen.GUI.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;

import com.example.observerschosen.GUI.Items.AdapterItems.CharItem;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.GUI.fragments.firstLevel.PlayerFragment;
import com.example.observerschosen.GUI.fragments.secondLevel.CharacterOverviewFragment;
import com.example.observerschosen.GUI.fragments.secondLevel.EquiptmentOverviewFragment;
import com.example.observerschosen.R;

import java.util.LinkedList;

public class CharacterAdapter extends RecyclerView.Adapter<CharacterAdapter.CharacterViewHolder> {
    private final LinkedList<CharItem> mLocationList;
    private final LayoutInflater mInflater;
    public MainActivity mainActivity;

    class CharacterViewHolder extends RecyclerView.ViewHolder {
        public final TextView CharacterNameItemView;
        public final ImageView CharacterImageItemView;
        private final Context context;
        final CharacterAdapter mAdapter;


        public CharacterViewHolder(View itemView, CharacterAdapter adapter) {
            super(itemView);
            context = itemView.getContext();
            CharacterNameItemView = itemView.findViewById(R.id.CharacterName);
            CharacterImageItemView = itemView.findViewById(R.id.CharacterImage);
            this.mAdapter = adapter;
        }
    }

    public CharacterAdapter(Context context, LinkedList<CharItem> projectList, MainActivity mainActivity) {
        mInflater = LayoutInflater.from(context);
        this.mLocationList = projectList;
        this.mainActivity = mainActivity;
    }

    @Override
    public CharacterAdapter.CharacterViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View mItemView = mInflater.inflate(
                R.layout.item_char, parent, false);
        return new CharacterAdapter.CharacterViewHolder(mItemView, this);
    }

    @Override
    public void onBindViewHolder(CharacterAdapter.CharacterViewHolder holder, int position) {
        CharItem current = mLocationList.get(position);
        boolean mUnlocked = current.isUnlocked();
        String mCurrent;
        String pCurrent;
        if (mUnlocked) {
            mCurrent = current.getCharacterName();
            pCurrent = current.getImagePath();
        } else {
            mCurrent = "???";
            pCurrent = "locked" + current.getImagePath();
        }
        holder.CharacterNameItemView.setText(mCurrent);
        //TODO: fix image works
//        holder.CharacterImageItemView.setImageDrawable();
        holder.CharacterImageItemView.setOnClickListener(view -> {

            if (current.isUnlocked()) {
                if (current.getEquiptment() != null) {
                    mainActivity.getSupportFragmentManager().beginTransaction()
                            .add(R.id.MainFragmentContainer, new EquiptmentOverviewFragment(mainActivity, current.getEquiptment()))
                            .commit();
                } else if (current.getCharacter() != null) {
                    mainActivity.getSupportFragmentManager().beginTransaction()
                            .add(R.id.MainFragmentContainer, new CharacterOverviewFragment(mainActivity, current.getCharacter()))
                            .commit();
                }
            }else{
                Toast.makeText(view.getContext(), "Unlock this first", Toast.LENGTH_SHORT).show();
            }

        });
    }

    @Override
    public int getItemCount() {
        return mLocationList.size();
    }


}
