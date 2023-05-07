package com.example.homework2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TableLayout;

import com.example.homework2.fragments.Fragment1;
import com.example.homework2.fragments.Fragment2;
import com.example.homework2.fragments.ViewPager_Adapter;
import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    private TabLayout tabLayout;
    private ViewPager viewPager;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager = findViewById(R.id.viewpager);

        tabLayout.setupWithViewPager(viewPager);

        ViewPager_Adapter viewPager_adapter = new ViewPager_Adapter
                (getSupportFragmentManager() , FragmentPagerAdapter.BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        viewPager_adapter.addFragmnet(new Fragment1(), "Order");
        viewPager_adapter.addFragmnet(new Fragment2(), "Ticket");
        viewPager.setAdapter(viewPager_adapter);
    }
}