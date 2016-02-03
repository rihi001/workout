package com.formation.monmap;
 
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.app.Activity;
import android.graphics.BitmapFactory.Options;
import android.os.Bundle;
import android.view.Menu;
import android.view.Window;
  
public class MainActivity extends Activity {
 private GoogleMap map1;
    protected void onCreate(Bundle savedInstanceState) {
    	this.requestWindowFeature(Window.FEATURE_NO_TITLE);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        map1=((MapFragment) getFragmentManager().findFragmentById(R.id.map)).getMap();
        MarkerOptions opt=new MarkerOptions();
        opt.position(new LatLng(20.203652, 30.235362));
        opt.title("CLIENT1");
        opt.snippet("une seule place");
        Marker htl=map1.addMarker(opt);
       // map1.moveCamera(CameraUpdateFactory.newLatLngZoom(htl.getPosition(), 19));
       // map1.setMapType(GoogleMap.MAP_TYPE_HYBRID);
        map1.setMyLocationEnabled(true);
        map1.animateCamera(CameraUpdateFactory.newLatLngZoom(htl.getPosition(), 19), 2000, null);
        //map1.setMapType(GoogleMap.MAP_TYPE_HYBRID);
    }
 
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
 
}