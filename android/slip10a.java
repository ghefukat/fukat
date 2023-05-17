AndroidManifest.xml
<uses-permission android:name="android.permission.ACCESS_FINE_LOCATION"/>
<uses-permission android:name="android.permission.ACCESS_COARSE_LOCATION"/>
<uses-permission android:name="android.permission.INTERNET"/>

In the app/build.gradle file, add the following dependency:

implementation 'com.google.android.gms:play-services-maps:17.0.0'


 activity_main.xml
<com.google.android.gms.maps.MapView
    android:id="@+id/map_view"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:apiKey="@string/google_maps_api_key"
    android:clickable="true"
    android:enabled="true" />


MainActivity.java

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapView;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MapStyleOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback {

    private static final float DEFAULT_ZOOM = 15f;

    private MapView mapView;
    private GoogleMap googleMap;
    private boolean isSatelliteViewEnabled = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mapView = findViewById(R.id.map_view);
        mapView.onCreate(savedInstanceState);
        mapView.getMapAsync(this);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_zoom_in) {
            googleMap.animateCamera(CameraUpdateFactory.zoomIn());
            return true;
        } else if (id == R.id.action_zoom_out) {
            googleMap.animateCamera(CameraUpdateFactory.zoomOut());
            return true;
        } else if (id == R.id.action_toggle_satellite) {
            if (isSatelliteViewEnabled) {
                googleMap.setMapType(GoogleMap.MAP_TYPE_NORMAL);
                isSatelliteViewEnabled = false;
            } else {
                googleMap.setMapType(GoogleMap.MAP_TYPE_SATELLITE);
                isSatelliteViewEnabled = true;
            }
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onMapReady(GoogleMap map) {
        googleMap = map;

        googleMap.setMapStyle(MapStyleOptions.loadRawResourceStyle(this, R.raw.map_style));

        if (googleMap != null) {
            googleMap.setMyLocationEnabled(true);
            googleMap.getUiSettings().setMyLocationButtonEnabled(true);

            LatLng latLng = new LatLng(37.7749, -122.4194);
            CameraPosition cameraPosition = new CameraPosition.Builder()
                    .target(latLng)
                    .zoom(DEFAULT_ZOOM)
                    .build();

            googleMap.moveCamera