package com.example.tourguideapp.Activity;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import com.example.tourguideapp.Fragments.RestaurantsFragment;
import com.example.tourguideapp.R;

public class RestaurantsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.container,new RestaurantsFragment())
                .commit();
    }
}
