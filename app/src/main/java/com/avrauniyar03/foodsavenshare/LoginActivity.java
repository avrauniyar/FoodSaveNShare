package com.avrauniyar03.foodsavenshare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void goToDonorHomeActivity(View view){
        UserRoleConstants.isDonor = true;
        UserRoleConstants.isReceiver = false;
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void goToReceiverHomeActivity(View view)
    {
        UserRoleConstants.isReceiver = true;
        UserRoleConstants.isDonor = false;
        Intent intent = new Intent(this, RHomeActivity.class);
        startActivity(intent);
    }
}
