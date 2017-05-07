package com.example.android.a10acasa;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void showAddressInMaps(View view) {
        showMap();
    }

    public void showMap() {
        Intent i = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:0,0?q=10+A+Casa+Supermercats"));
        i.setClassName("com.google.android.apps.maps", "com.google.android.maps.MapsActivity");
        if (i.resolveActivity(getPackageManager()) != null) {
            startActivity(i);
        }
    }
}

