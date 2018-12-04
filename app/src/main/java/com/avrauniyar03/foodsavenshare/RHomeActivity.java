package com.avrauniyar03.foodsavenshare;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;

public class RHomeActivity extends AppCompatActivity {
    private Toolbar mTopToolbar;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_home_r:
                    mTopToolbar.setTitle("HOME");
                    return true;
                case R.id.navigation_schedule_r:
                    mTopToolbar.setTitle("SCHEDULE");
                    fragment = new ScheduleFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_contactus_r:
                    mTopToolbar.setTitle("CONTACT US");
                    fragment = new ContactUsFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_foodList_r:
                    mTopToolbar.setTitle("ADD FOOD");
                    fragment = new AddFoodFragment();
                    loadFragment(fragment);
                    return true;
            }
            return false;
        }
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_r);
        mTopToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mTopToolbar);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigationR);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }


}
