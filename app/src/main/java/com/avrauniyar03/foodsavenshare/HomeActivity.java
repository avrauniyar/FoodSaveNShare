package com.avrauniyar03.foodsavenshare;

import android.app.Application;
import android.content.Intent;
import android.graphics.Canvas;
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
import android.support.v7.widget.helper.ItemTouchHelper;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.ScrollView;

import static com.avrauniyar03.foodsavenshare.R.id.contactFragment;

public class HomeActivity extends AppCompatActivity {
    private Toolbar mTopToolbar;
    private Button exit;
    private RecyclerView recyclerView;
    private ScrollView sv;
    RVAdapter adapter;
    SwipeController swipeController = null;



    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment fragment;
            switch (item.getItemId()) {
                case R.id.navigation_home:

                    mTopToolbar.setTitle("HOME");
                    recyclerView.setVisibility(View.VISIBLE);
                    FragmentManager fm = getSupportFragmentManager();
                    for (int i = 0; i < fm.getBackStackEntryCount(); ++i) {
                        fm.popBackStack();
                    }
                    return true;
                case R.id.navigation_addfood:
                    mTopToolbar.setTitle("ADD FOOD");
                    recyclerView.setVisibility(View.GONE);
                    fragment = new ScheduleFragment();
                    loadFragment(fragment);
                    return true;
                case R.id.navigation_contactus:
                    mTopToolbar.setTitle("CONTACT US");
                    recyclerView.setVisibility(View.GONE);
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
        if(ApplicationData.foodList.isEmpty()){

            ApplicationData.listOfFood();
        }
        initializeAdapter();
        setupRecyclerView();

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
        adapter = new RVAdapter(ApplicationData.foodList);
    }
    private void setupRecyclerView() {
        recyclerView = (RecyclerView)findViewById(R.id.rv);

        recyclerView.setLayoutManager(new LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false));
        recyclerView.setAdapter(adapter);

        swipeController = new SwipeController(new SwipeControllerActions() {
            @Override
            public void onRightClicked(int position) {
                adapter.foodInfos.remove(position);
                adapter.notifyItemRemoved(position);
                adapter.notifyItemRangeChanged(position, adapter.getItemCount());
            }
        });

        ItemTouchHelper itemTouchhelper = new ItemTouchHelper(swipeController);
        itemTouchhelper.attachToRecyclerView(recyclerView);

        recyclerView.addItemDecoration(new RecyclerView.ItemDecoration() {
            @Override
            public void onDraw(Canvas c, RecyclerView parent, RecyclerView.State state) {
                swipeController.onDraw(c);
            }
        });
    }
    public void goToLoginActivity(View view){
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
