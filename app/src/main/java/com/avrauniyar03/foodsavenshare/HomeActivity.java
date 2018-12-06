package com.avrauniyar03.foodsavenshare;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class HomeActivity extends AppCompatActivity {
    private Toolbar mTopToolbar;
    private RecyclerView rv;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    mTopToolbar.setTitle("HOME");
                    rv.setVisibility(View.VISIBLE);
                    return true;
                case R.id.navigation_schedule:
                    mTopToolbar.setTitle("SCHEDULE");
                    rv.setVisibility(View.GONE);
                    fragment = new ScheduleFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_contactus:
                    mTopToolbar.setTitle("CONTACT US");
                    rv.setVisibility(View.GONE);
                    fragment = new ContactUsFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_addfood:
                    mTopToolbar.setTitle("ADD FOOD");
                    rv.setVisibility(View.GONE);
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
        setContentView(R.layout.activity_home);
        mTopToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mTopToolbar);

        rv = (RecyclerView)findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        RVAdapter adapter = new RVAdapter(ApplicationData.setupData());
        rv.setLayoutManager(llm);
        rv.setAdapter(adapter);
        initializeAdapter();

        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }
    private void loadFragment(Fragment fragment) {
        // load fragment
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.frame_container, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }
    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(ApplicationData.setupData());
        rv.setAdapter(adapter);
    }

}
