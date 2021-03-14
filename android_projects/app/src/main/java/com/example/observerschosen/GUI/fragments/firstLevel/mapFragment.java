package com.example.observerschosen.GUI.fragments.firstLevel;

import android.Manifest;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.observerschosen.R;

import org.osmdroid.tileprovider.tilesource.TileSourceFactory;
import org.osmdroid.views.CustomZoomButtonsController;
import org.osmdroid.views.MapController;
import org.osmdroid.views.MapView;
import org.osmdroid.views.overlay.mylocation.GpsMyLocationProvider;
import org.osmdroid.views.overlay.mylocation.MyLocationNewOverlay;

public class mapFragment extends Fragment {

    private final int REQUEST_PERMISSIONS_REQUEST_CODE = 1;
    private final int ZOOM_LEVEL = 19;

    private MapView mapView;
    private MyLocationNewOverlay locationOverlay;
    private MapController mapController;

    public mapFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestPermissions(new String[]{
                Manifest.permission.ACCESS_FINE_LOCATION,
                Manifest.permission.WRITE_EXTERNAL_STORAGE,
                Manifest.permission.ACCESS_COARSE_LOCATION
        }, REQUEST_PERMISSIONS_REQUEST_CODE);
    }

    @Override
    public void onStart() {
        super.onStart();
        this.mapView.onResume();
        this.locationOverlay.onResume();

        this.mapController.setCenter(locationOverlay.getMyLocation());
        this.mapController.animateTo(locationOverlay.getMyLocation());
        this.mapController.zoomTo(ZOOM_LEVEL);
    }

    @Override
    public void onStop() {
        super.onStop();
        this.mapView.onPause();
        this.locationOverlay.onPause();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_map, container, false);
        this.mapView = view.findViewById(R.id.BaseMap);
        this.mapView.getZoomController().setVisibility(CustomZoomButtonsController.Visibility.NEVER);
        this.mapView.setMultiTouchControls(true);
        this.mapView.setTileSource(TileSourceFactory.MAPNIK);

        this.locationOverlay = new MyLocationNewOverlay(new GpsMyLocationProvider(getActivity().getApplicationContext()), this.mapView);
        this.locationOverlay.enableMyLocation();
        this.locationOverlay.enableFollowLocation();
        this.mapView.getOverlays().add(this.locationOverlay);
        this.mapController = new MapController(this.mapView);
        this.mapController.setCenter(locationOverlay.getMyLocation());
        this.mapController.animateTo(locationOverlay.getMyLocation());
        this.mapController.zoomTo(ZOOM_LEVEL);

        return view;
    }
}