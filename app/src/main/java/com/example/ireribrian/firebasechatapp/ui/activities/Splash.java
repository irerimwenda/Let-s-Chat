package com.example.ireribrian.firebasechatapp.ui.activities;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.ireribrian.firebasechatapp.R;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.FirebaseDatabase;

public class Splash extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if(FirebaseAuth.getInstance().getCurrentUser() != null) {
                    final Intent mainIntent = new Intent(Splash.this, UserListingActivity.class);
                    Splash.this.startActivity(mainIntent);
                    Splash.this.finish();
                }else{
                    final Intent mainIntent = new Intent(Splash.this, LoginActivity.class);
                    Splash.this.startActivity(mainIntent);
                    Splash.this.finish();

                }
            }
        }, 3000);

    }
}
