package com.avrauniyar03.foodsavenshare;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.widget.TextView;

public class AddFood extends AppCompatActivity {

    private Toolbar mTopToolbar;

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            switch (item.getItemId()) {
                case R.id.navigation_home:
                    Intent home = new Intent(AddFood.this, HomeActivity.class);
                    startActivity(home);
                    return true;
                case R.id.navigation_schedule:
                    Intent schedule = new Intent(AddFood.this, Schedule.class);
                    startActivity(schedule);
                    return true;
                case R.id.navigation_contactus:
                    Intent contactus = new Intent(AddFood.this, ContactUs.class);
                    startActivity(contactus);
                    return true;
                case R.id.navigation_addfood:
                    return true;
            }
            return false;
        }
    };


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_food);
        mTopToolbar = (Toolbar) findViewById(R.id.my_toolbar);
        setSupportActionBar(mTopToolbar);
        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
    }

}
