package com.example.observerschosen.GUI.activities;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.os.Bundle;
import android.view.View;

import com.example.observerschosen.GUI.fragments.firstLevel.BaseBuildingFragment;
import com.example.observerschosen.GUI.fragments.firstLevel.CodexFragment;
import com.example.observerschosen.GUI.fragments.firstLevel.MarketFragment;
import com.example.observerschosen.GUI.fragments.firstLevel.MultiplayerMenuFragment;
import com.example.observerschosen.GUI.fragments.firstLevel.PlayerFragment;
import com.example.observerschosen.GUI.fragments.firstLevel.QuestLogFragment;
import com.example.observerschosen.GUI.fragments.firstLevel.SettingFragment;
import com.example.observerschosen.GUI.fragments.firstLevel.mapFragment;
import com.example.observerschosen.LiveData.MainViewModel;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    public FloatingActionButton PlayerButton;
    public FloatingActionButton SettingsButton;
    public FloatingActionButton MultiplayerButton;
    public FloatingActionButton MarketButton;
    public FloatingActionButton questbutton;
    public FloatingActionButton codexbutton;
    public FloatingActionButton lowerbutton;
    public FloatingActionButton raisebutton;
    public FloatingActionButton baseButton;
    public ConstraintLayout sideBanner;
    public ConstraintLayout mainBanner;

    public MainViewModel mainViewModel;

    public String currentFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mainViewModel = new MainViewModel();
        sideBanner = findViewById(R.id.SideBanner);
        mainBanner = findViewById(R.id.MainBanner);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.MapFragmentContainer, new mapFragment())
                .commit();

        PlayerButton = findViewById(R.id.PlayerButton);
        PlayerButton.setOnClickListener(v -> {
            ClearMainFragmentContainer();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.MainFragmentContainer, new PlayerFragment(this))
                    .commit();
            sideBanner.setVisibility(View.GONE);
        });

        codexbutton = findViewById(R.id.CodexButton);
        codexbutton.setOnClickListener(v -> {
            ClearMainFragmentContainer();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.MainFragmentContainer, new CodexFragment(this))
                    .commit();
            sideBanner.setVisibility(View.GONE);
        });

        SettingsButton = findViewById(R.id.SettingsButton);
        SettingsButton.setOnClickListener(v -> {
            ClearMainFragmentContainer();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.MainFragmentContainer, new SettingFragment(this))
                    .commit();
            sideBanner.setVisibility(View.GONE);
        });

        MultiplayerButton = findViewById(R.id.MultiplayerButton);
        MultiplayerButton.setOnClickListener(v -> {
            ClearMainFragmentContainer();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.MainFragmentContainer, new MultiplayerMenuFragment(this))
                    .commit();
            sideBanner.setVisibility(View.GONE);
        });

        questbutton = findViewById(R.id.QuestButton);
        questbutton.setOnClickListener(v -> {
            ClearMainFragmentContainer();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.MainFragmentContainer, new QuestLogFragment(this))
                    .commit();
            sideBanner.setVisibility(View.GONE);
        });

        lowerbutton = findViewById(R.id.LowerButton);
        lowerbutton.setOnClickListener(v -> {
            ObjectAnimator alphaLowerAnimation = ObjectAnimator.ofFloat(lowerbutton, View.ALPHA, 1.0f, 0.0f);
            ObjectAnimator alphaRaiseAnimation = ObjectAnimator.ofFloat(MultiplayerButton, View.ALPHA, 0.0f, 1.0f);
            ObjectAnimator alphaBaseAnimation = ObjectAnimator.ofFloat(SettingsButton, View.ALPHA, 0.0f, 1.0f);
            ObjectAnimator alphaMultiplayerAnimation = ObjectAnimator.ofFloat(baseButton, View.ALPHA, 0.0f, 1.0f);
            ObjectAnimator alphaSettingAnimation = ObjectAnimator.ofFloat(raisebutton, View.ALPHA, 0.0f, 1.0f);
            //TODO: change image of the submenu
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(alphaBaseAnimation, alphaLowerAnimation, alphaMultiplayerAnimation, alphaRaiseAnimation, alphaSettingAnimation);
            animatorSet.start();

            MultiplayerButton.setEnabled(true);
            SettingsButton.setEnabled(true);
            baseButton.setEnabled(true);
            raisebutton.setEnabled(true);
            lowerbutton.setEnabled(false);
        });

        raisebutton = findViewById(R.id.RaiseButton);
        raisebutton.setOnClickListener(v -> {

            ObjectAnimator alphaLowerAnimation = ObjectAnimator.ofFloat(lowerbutton, View.ALPHA, 0.0f, 1.0f);
            ObjectAnimator alphaRaiseAnimation = ObjectAnimator.ofFloat(MultiplayerButton, View.ALPHA, 1.0f, 0.0f);
            ObjectAnimator alphaBaseAnimation = ObjectAnimator.ofFloat(SettingsButton, View.ALPHA, 1.0f, 0.0f);
            ObjectAnimator alphaMultiplayerAnimation = ObjectAnimator.ofFloat(baseButton, View.ALPHA, 1.0f, 0.0f);
            ObjectAnimator alphaSettingAnimation = ObjectAnimator.ofFloat(raisebutton, View.ALPHA, 1.0f, 0.0f);
            //TODO: change image of the submenu
            AnimatorSet animatorSet = new AnimatorSet();
            animatorSet.playTogether(alphaBaseAnimation, alphaLowerAnimation, alphaMultiplayerAnimation, alphaRaiseAnimation, alphaSettingAnimation);
            animatorSet.start();

            MultiplayerButton.setEnabled(false);
            SettingsButton.setEnabled(false);
            baseButton.setEnabled(false);
            raisebutton.setEnabled(false);
            lowerbutton.setEnabled(true);
        });




        MarketButton = findViewById(R.id.MarketButton);
        MarketButton.setOnClickListener(v -> {
            ClearMainFragmentContainer();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.MainFragmentContainer, new MarketFragment(this))
                    .commit();
            sideBanner.setVisibility(View.GONE);
        });
        baseButton = findViewById(R.id.BaseBuildingButton);
        baseButton.setOnClickListener(v -> {
            ClearMainFragmentContainer();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.MainFragmentContainer, new BaseBuildingFragment(this))
                    .commit();
            sideBanner.setVisibility(View.GONE);
        });


        raisebutton.performClick();


    }

    public void ClearMainFragmentContainer(){
        for (Fragment fragment : getSupportFragmentManager().getFragments()) {
            if (! (fragment instanceof mapFragment)){
                getSupportFragmentManager().beginTransaction().remove(fragment).commit();
            }

        }
    }

    public MainViewModel getMainViewModel() {
        return mainViewModel;
    }

    public void toggleMainBar(boolean b) {
        if (b){
            mainBanner.setVisibility(View.VISIBLE);
        }else{
            mainBanner.setVisibility(View.GONE);
        }
    }
}