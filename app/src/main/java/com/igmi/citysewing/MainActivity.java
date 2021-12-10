package com.igmi.citysewing;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends AppCompatActivity {

    private final int SPLASH_DISPLAY_DURATION = 1800;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                Intent i=new Intent(getApplicationContext(),MainPage.class);
                startActivity(i);

            }




        }, SPLASH_DISPLAY_DURATION);
    }
}