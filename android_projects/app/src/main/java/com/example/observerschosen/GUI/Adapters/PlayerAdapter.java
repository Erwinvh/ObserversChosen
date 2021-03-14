package com.example.observerschosen.GUI.Adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ProgressBar;
import android.widget.TextView;


import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.observerschosen.GUI.Items.Player;
import com.example.observerschosen.GUI.Items.AdapterItems.PlayerItem;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.GUI.fragments.secondLevel.EquipOverviewFragment;
import com.example.observerschosen.GUI.fragments.secondLevel.NewMultiplayerFragment;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;

public class PlayerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private final LinkedList<PlayerItem> mLocationList;
    private final LayoutInflater mInflater;
    private final RecyclerView mRecyclerView;
    public MainActivity mainActivity;

    class PlayerViewHolder extends RecyclerView.ViewHolder {
        public TextView PlayerLevel;
        public TextView xp;
        public TextView nextLevel;
        public TextView health;
        public TextView stamina;
        public TextView energy;
        public TextView OP;
        public TextView Race;
        public TextView Age;

        public ProgressBar XPBar;
        public ProgressBar HealthBar;
        public ProgressBar EnergyBar;
        public ProgressBar StaminaBar;
        public ProgressBar OPBar;

        public FloatingActionButton Head;
        public FloatingActionButton Special;
        public FloatingActionButton Torso;
        public FloatingActionButton RightWeapon;
        public FloatingActionButton LeftWeapon;
        public FloatingActionButton Trouser;
        public FloatingActionButton Gauntlet;
        public FloatingActionButton Boots;

        private final Context context;
        final PlayerAdapter mAdapter;


        public PlayerViewHolder(View itemView, PlayerAdapter adapter) {
            super(itemView);
            context = itemView.getContext();

            PlayerLevel = itemView.findViewById(R.id.LevelTextView);
            xp = itemView.findViewById(R.id.XPLimit);
            nextLevel = itemView.findViewById(R.id.ToLevelText);
            health = itemView.findViewById(R.id.HealthLimit);
            stamina = itemView.findViewById(R.id.StaminaLimit);
            energy = itemView.findViewById(R.id.EnergyLimit);
            OP = itemView.findViewById(R.id.OPLimit);
            Race = itemView.findViewById(R.id.RaceField);
            Age = itemView.findViewById(R.id.AgeField);

            XPBar = itemView.findViewById(R.id.progressBar);
            HealthBar = itemView.findViewById(R.id.HealthBar);
            EnergyBar = itemView.findViewById(R.id.EnergyBar);
            StaminaBar = itemView.findViewById(R.id.StaminaBar);
            OPBar = itemView.findViewById(R.id.OPBar);

            Head = itemView.findViewById(R.id.HeadButton);
            Special = itemView.findViewById(R.id.SpecialItemButton);
            Torso = itemView.findViewById(R.id.TorsoButton);
            RightWeapon = itemView.findViewById(R.id.RightHandButton);
            LeftWeapon = itemView.findViewById(R.id.LeftHandButton);
            Trouser = itemView.findViewById(R.id.TrousersButton);
            Gauntlet = itemView.findViewById(R.id.GauntletsButton);
            Boots = itemView.findViewById(R.id.BootsButton);


            this.mAdapter = adapter;
        }
    }

    class AchievementListViewHolder extends RecyclerView.ViewHolder {
        private final Context context;
        final PlayerAdapter mAdapter;

        public RecyclerView mRecyclerView;
        public AchievementAdapter aAdapter;


        public AchievementListViewHolder(View itemView, PlayerAdapter adapter) {
            super(itemView);
            context = itemView.getContext();
            mRecyclerView = itemView.findViewById(R.id.AchievementRecycler);

            this.mAdapter = adapter;
        }
    }

    public PlayerAdapter(Context context, LinkedList<PlayerItem> projectList, RecyclerView recyclerView, MainActivity mainActivity) {
        mInflater = LayoutInflater.from(context);
        this.mLocationList = projectList;
        mRecyclerView = recyclerView;
        this.mainActivity = mainActivity;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {
            case 0:
                return new PlayerViewHolder(mInflater.inflate(R.layout.item_player, parent, false), this);
            case 1:
                return new AchievementListViewHolder(mInflater.inflate(R.layout.item_achievementlist, parent, false), this);
        }
        return new AchievementListViewHolder(mInflater.inflate(R.layout.item_achievementlist, parent, false), this);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        PlayerItem current = mLocationList.get(position);
        switch (getItemViewType(position)) {
            case 0:
                PlayerViewHolder playerviewHolder = (PlayerViewHolder) holder;
                Player currentPlayer = current.getPlayer();

                playerviewHolder.PlayerLevel.setText("Level " + currentPlayer.getLevel());
                playerviewHolder.xp.setText(currentPlayer.getXp()+"/"+currentPlayer.getXpLimit());
                playerviewHolder.nextLevel.setText("Next level: " + (currentPlayer.getLevel()+1));
                playerviewHolder.health.setText(currentPlayer.getHealth()+"/"+currentPlayer.getHealthlimit());
                playerviewHolder.stamina.setText(currentPlayer.getStamina()+"/"+currentPlayer.getStaminalimit());
                playerviewHolder.energy.setText(currentPlayer.getEnergy()+"/"+currentPlayer.getEnergylimit());
                playerviewHolder.OP.setText(currentPlayer.getOP()+"/"+currentPlayer.getOplimit());
                playerviewHolder.Race.setText(currentPlayer.getRace());
                playerviewHolder.Age.setText(currentPlayer.getAge());

                playerviewHolder.XPBar.setProgress(currentPlayer.getXp());
                playerviewHolder.HealthBar.setProgress(currentPlayer.getHealth());
                playerviewHolder.EnergyBar.setProgress(currentPlayer.getEnergy());
                playerviewHolder.StaminaBar.setProgress(currentPlayer.getStamina());
                playerviewHolder.OPBar.setProgress(currentPlayer.getOP());
                playerviewHolder.XPBar.setMax(currentPlayer.getXpLimit());
                playerviewHolder.HealthBar.setMax(currentPlayer.getHealthlimit());
                playerviewHolder.EnergyBar.setMax(currentPlayer.getEnergylimit());
                playerviewHolder.StaminaBar.setMax(currentPlayer.getStaminalimit());
                playerviewHolder.OPBar.setMax(currentPlayer.getOplimit());

                //TODO: set item images
                //playerviewHolder.Head.
                playerviewHolder.Head.setOnClickListener(view -> {
                    mainActivity.getSupportFragmentManager().beginTransaction().add(R.id.MainFragmentContainer, new EquipOverviewFragment("Head", mainActivity)).commit();
                });
                //playerviewHolder.Special
                playerviewHolder.Special.setOnClickListener(view -> {
                    mainActivity.getSupportFragmentManager().beginTransaction().add(R.id.MainFragmentContainer, new EquipOverviewFragment("Special", mainActivity)).commit();
                });
                //playerviewHolder.Torso
                playerviewHolder.Torso.setOnClickListener(view -> {
                    mainActivity.getSupportFragmentManager().beginTransaction().add(R.id.MainFragmentContainer, new EquipOverviewFragment("Torso", mainActivity)).commit();
                });
//                playerviewHolder.RightWeapon
//                playerviewHolder.LeftWeapon
//                playerviewHolder.Trouser
//                playerviewHolder.Gauntlet
//                playerviewHolder.Boots
                playerviewHolder.RightWeapon.setOnClickListener(view -> {
                    mainActivity.getSupportFragmentManager().beginTransaction().add(R.id.MainFragmentContainer, new EquipOverviewFragment("Right Weapon", mainActivity)).commit();
                });
                playerviewHolder.LeftWeapon.setOnClickListener(view -> {
                    mainActivity.getSupportFragmentManager().beginTransaction().add(R.id.MainFragmentContainer, new EquipOverviewFragment("Left Weapon", mainActivity)).commit();
                });
                playerviewHolder.Trouser.setOnClickListener(view -> {
                    mainActivity.getSupportFragmentManager().beginTransaction().add(R.id.MainFragmentContainer, new EquipOverviewFragment("Legs", mainActivity)).commit();
                });
                playerviewHolder.Gauntlet.setOnClickListener(view -> {
                    mainActivity.getSupportFragmentManager().beginTransaction().add(R.id.MainFragmentContainer, new EquipOverviewFragment("Hands", mainActivity)).commit();
                });
                playerviewHolder.Boots.setOnClickListener(view -> {
                    mainActivity.getSupportFragmentManager().beginTransaction().add(R.id.MainFragmentContainer, new EquipOverviewFragment("Boots", mainActivity)).commit();
                });

                break;
            case 1:
                AchievementListViewHolder achievementsviewHolder = (AchievementListViewHolder) holder;
                achievementsviewHolder.aAdapter = new AchievementAdapter(achievementsviewHolder.context, current.getAchievementsList());
                achievementsviewHolder.mRecyclerView.setAdapter(achievementsviewHolder.aAdapter);
                achievementsviewHolder.mRecyclerView.setLayoutManager(new GridLayoutManager(achievementsviewHolder.context, 3));
                break;



        }

    }

    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return mLocationList.size();
    }

}
