package com.example.moneyheist;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;

import android.os.Bundle;

import android.view.Window;

import android.view.WindowManager;


public class SplashActivity extends AppCompatActivity {


    @Override

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        Window window = getWindow() ;


        window.addFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_splash);




        Thread splashTread = new Thread(){


            @Override

            public void run() {

                try {

                    sleep(5500);

                    startActivity(new Intent(getApplicationContext(),MainActivity.class));

                    finish();

                } catch (InterruptedException e) {

                    e.printStackTrace();

                }


                super.run();

            }

        };


        splashTread.start();





    }


}