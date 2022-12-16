package com.example.tourguideapp.adaptor;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.tourguideapp.Fragments.BeachesFragment;
import com.example.tourguideapp.Fragments.MonumentsFragment;
import com.example.tourguideapp.Fragments.PlacesFragment;
import com.example.tourguideapp.Fragments.RestaurantsFragment;

public class TourFragmentAdapter extends FragmentPagerAdapter {
    private String title[] = new String[] {"Monument","Places","Beaches","Restaurant"};
    public TourFragmentAdapter(@NonNull FragmentManager fm) {
        super(fm);
    }


    @Override
    public Fragment getItem(int position) {
        if(position == 0){
            return new MonumentsFragment() ;
        }else if (position == 1){
            return new PlacesFragment();
        }else if (position == 2){
            return new BeachesFragment();
        }else {
            return new RestaurantsFragment();
        }
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }
}
