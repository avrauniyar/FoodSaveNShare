package com.avrauniyar03.foodsavenshare;

import android.app.Application;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.constraint.ConstraintLayout;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;
import android.widget.ScrollView;

import static com.avrauniyar03.foodsavenshare.R.id.contactFragment;

public class HomeActivity extends AppCompatActivity {
    private Toolbar mTopToolbar;
    private RecyclerView rv;
    private ScrollView sv;


    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    mTopToolbar.setTitle("HOME");
                    rv.setVisibility(View.VISIBLE);
                    FragmentManager fm = getSupportFragmentManager();
                    for (int i = 0; i < fm.getBackStackEntryCount(); ++i) {
                        fm.popBackStack();
                    }
                    return true;
                case R.id.navigation_addfood:
                    mTopToolbar.setTitle("ADD FOOD");
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

        // get layouts
        rv = (RecyclerView)findViewById(R.id.rv);
        LinearLayoutManager llm = new LinearLayoutManager(this);
        if(ApplicationData.foodList.isEmpty()){
            ApplicationData.listOfFood();
        }
        RVAdapter adapter = new RVAdapter(ApplicationData.foodList);
        rv.setLayoutManager(llm);
        rv.setAdapter(adapter);
        initializeAdapter();
        adapter.notifyDataSetChanged();

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
    private void hindFragment(Fragment fragment){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.hide(fragment);
        transaction.commit();
    }
    private void initializeAdapter(){
        RVAdapter adapter = new RVAdapter(ApplicationData.foodList);
        rv.setAdapter(adapter);
    }

}
