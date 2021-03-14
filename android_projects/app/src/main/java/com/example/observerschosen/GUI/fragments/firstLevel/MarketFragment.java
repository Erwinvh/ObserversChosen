package com.example.observerschosen.GUI.fragments.firstLevel;

import android.os.Bundle;

import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.observerschosen.GUI.Adapters.MarketStallAdapter;
import com.example.observerschosen.GUI.Items.AdapterItems.MarketStallItem;
import com.example.observerschosen.GUI.activities.MainActivity;
import com.example.observerschosen.R;
import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.LinkedList;


public class MarketFragment extends Fragment {

    public MainActivity mainActivity;

    public FloatingActionButton smithButton;
    public FloatingActionButton GeneralButton;
    public FloatingActionButton ObserverButton;

    public ImageView vendor;
    public TextView StoreName;

    public RecyclerView mRecyclerView;
    public MarketStallAdapter mAdapter;

    public LinkedList<MarketStallItem> SmithOptions = new LinkedList<>();
    public LinkedList<MarketStallItem> GeneralOptions = new LinkedList<>();
    public LinkedList<MarketStallItem> ObserverOptions = new LinkedList<>();

    public FloatingActionButton backButton;

    public MarketFragment(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SmithOptions.add(new MarketStallItem("Buy/Sell", "", "Smith"));
        SmithOptions.add(new MarketStallItem("Craft", "", "Smith"));
        SmithOptions.add(new MarketStallItem("Temper", "", "Smith"));

        GeneralOptions.add(new MarketStallItem("Buy/Sell", "" ,"General"));
        GeneralOptions.add(new MarketStallItem("Craft", "" ,"General"));
        GeneralOptions.add(new MarketStallItem("Improve", "" ,"General"));
        GeneralOptions.add(new MarketStallItem("Experiment", "" ,"General"));

        ObserverOptions.add(new MarketStallItem("Buy/Sell", "" ,"Observer"));
        ObserverOptions.add(new MarketStallItem("Craft", "" ,"Observer"));
        ObserverOptions.add(new MarketStallItem("Watch", "" ,"Observer"));
        ObserverOptions.add(new MarketStallItem("Experiment", "" ,"Observer"));

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_market, container, false);

        StoreName = view.findViewById(R.id.StoreName);
        vendor = view.findViewById(R.id.Vendor);
        mRecyclerView = view.findViewById(R.id.StallRecycler);

        backButton = view.findViewById(R.id.MarketBackButton);
        backButton.setOnClickListener(v -> {
            FragmentTransaction transaction = mainActivity.getSupportFragmentManager().beginTransaction();
            transaction.remove(this).commit();
            ConstraintLayout sidebanner = mainActivity.findViewById(R.id.SideBanner);
            sidebanner.setVisibility(View.VISIBLE);
        });

        smithButton = view.findViewById(R.id.smithButton);
        smithButton.setOnClickListener(view1 -> {
            StoreName.setText("Smithy");
            vendor.setImageResource(R.mipmap.ic_smith_foreground);
            mAdapter = new MarketStallAdapter(getContext(), SmithOptions);
            // Connect the adapter with the recycler view.
            mRecyclerView.setAdapter(mAdapter);
            // Give the recycler view a default layout manager.
            mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        });

        GeneralButton = view.findViewById(R.id.GeneralGoodsButton);
        GeneralButton.setOnClickListener(view1 -> {
            StoreName.setText("General goods store");
            vendor.setImageResource(R.mipmap.ic_generalgoods_foreground);
            mAdapter = new MarketStallAdapter(getContext(), GeneralOptions);
            // Connect the adapter with the recycler view.
            mRecyclerView.setAdapter(mAdapter);
            // Give the recycler view a default layout manager.
            mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        });

        ObserverButton = view.findViewById(R.id.ObserversSupportButton);
        ObserverButton.setOnClickListener(view1 -> {
            StoreName.setText("Observers support");
            vendor.setImageResource(R.mipmap.ic_observerssupport_foreground);
            mAdapter = new MarketStallAdapter(getContext(), ObserverOptions);
            // Connect the adapter with the recycler view.
            mRecyclerView.setAdapter(mAdapter);
            // Give the recycler view a default layout manager.
            mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        });

        smithButton.performClick();

        return view;
    }
}