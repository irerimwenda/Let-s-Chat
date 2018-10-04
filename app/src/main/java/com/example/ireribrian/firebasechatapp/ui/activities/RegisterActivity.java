package com.example.ireribrian.firebasechatapp.ui.activities;

import android.support.v4.app.FragmentTransaction;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.example.ireribrian.firebasechatapp.R;
import com.example.ireribrian.firebasechatapp.ui.fragments.RegisterFragment;
import com.facebook.login.LoginFragment;

/**
 * Created by ireribrian on 10/4/2018.
 */

public class RegisterActivity extends AppCompatActivity {
    private Toolbar mToolbar;

    public static void startActivity(Context context){

        Intent intent = new Intent(context, RegisterActivity.class);
        context.startActivity(intent);

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        bindView();
        init();
    }


    private void bindView(){
        mToolbar = (Toolbar) findViewById(R.id.toolbar);
    }

    private void init(){
        setSupportActionBar(mToolbar);

        android.support.v4.app.FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame_layout_content_register,
                RegisterFragment.newInstance(),
                RegisterFragment.class.getSimpleName());
        fragmentTransaction.commit();


    }
}

