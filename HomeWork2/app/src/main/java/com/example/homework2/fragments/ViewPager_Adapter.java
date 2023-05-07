package com.example.homework2.fragments;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.fragment.app.FragmentTransaction;

import java.util.ArrayList;

public class ViewPager_Adapter extends FragmentPagerAdapter {

    static final ArrayList<Fragment> fragmnet_list = new ArrayList<>();
    static final ArrayList<String> fragmnet_title = new ArrayList<>();


    public ViewPager_Adapter(@NonNull FragmentManager fm, int behavior) {
        super(fm, behavior);
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return fragmnet_list.get(position);

    }

    @Override
    public int getCount() {
        return fragmnet_list.size();
    }

    public void addFragmnet(Fragment fragment,String title){
        fragmnet_list.add(fragment);
        fragmnet_title.add(title);

    }


    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return fragmnet_title.get(position);
    }
}
