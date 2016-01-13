package com.example.bam.tracker;

import android.location.LocationListener;
import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;
import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MapsActivity1 extends FragmentActivity implements OnMapReadyCallback,LocationInterface{
    private GoogleMap mMap;
    private final LatLng LOCATION_MUMBAI=new LatLng(19.0176147,72.8561644);
    private final LatLng LOCATION_DELHI=new LatLng(28.635308,77.22496);
    private final LatLng LOCATION_CHENNAI=new LatLng(13.060422,80.249583);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps1);

        mMap = ((MapFragment) getFragmentManager().findFragmentById(R.id.map))
                .getMap();


    }

    @Override
    public void onMapReady(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));
    }
    public void onClick_Mumbai(View v)
    {
        CameraUpdate update= CameraUpdateFactory.newLatLng(LOCATION_MUMBAI);
        mMap.addMarker(new MarkerOptions().position(LOCATION_MUMBAI).title("Marker in Mumbai"));
        mMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);

        mMap.animateCamera(update);
    }
    public void onClick_Delhi(View v)
    {
        Toast.makeText(MapsActivity1.this, "You selected Delhi", Toast.LENGTH_SHORT).show();
        CameraUpdate update = CameraUpdateFactory.newLatLng(LOCATION_DELHI) ;
        mMap.addMarker(new MarkerOptions().position(LOCATION_DELHI).title("Marker in Delhi"));
        mMap.setMapType(GoogleMap.MAP_TYPE_TERRAIN);

        mMap.animateCamera(update);

    }
    public void onClick_Chennai(View v)
    {
        Toast.makeText(MapsActivity1.this, "You selected Chennai", Toast.LENGTH_SHORT).show();
        CameraUpdate update = CameraUpdateFactory.newLatLng(LOCATION_CHENNAI) ;
        mMap.addMarker(new MarkerOptions().position(LOCATION_CHENNAI).title("Marker in Chennai"));
        mMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
        mMap.animateCamera(update);

    }




    public void update(GoogleMap googleMap) {
        mMap = googleMap;

        // Add a marker in Sydney and move the camera
        LatLng sydney = new LatLng(-34, 151);
        mMap.addMarker(new MarkerOptions().position(sydney).title("Marker in Sydney"));
        mMap.moveCamera(CameraUpdateFactory.newLatLng(sydney));

    }
}
