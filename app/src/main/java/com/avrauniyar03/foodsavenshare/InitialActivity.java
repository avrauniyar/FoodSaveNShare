package com.avrauniyar03.foodsavenshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class InitialActivity extends AppCompatActivity {

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        UserRoleConstants.receiverData = new ArrayList<>();
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initial);

    }

    public void goToLoginActivity(View view){
        UserRoleConstants.isReceiver = false;
        UserRoleConstants.isDonor = false;
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}
