package com.example.tourguideapp.Activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.example.tourguideapp.R;
import com.example.tourguideapp.adaptor.TourAdapter;
import com.example.tourguideapp.adaptor.TourFragmentAdapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ViewPager viewPager = findViewById(R.id.viewPager);

        TourFragmentAdapter adapter =new TourFragmentAdapter(getSupportFragmentManager());

        viewPager.setAdapter(adapter);

        TabLayout tabLayout = findViewById(R.id.slidingTabs);

        tabLayout.setupWithViewPager(viewPager);
    }
}