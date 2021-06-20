package com.example.mainapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;

public class SplashScreen extends AppCompatActivity {

    //Time for which the animation runs
    private static final int SPLASH_TIMER = 5000;

    private TextView tvAppName, tvSlogan, tvDevNames;

    //Animation
    private Animation sideAnim, bottomAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        //Hooks (Hook design elements with Java code)
        tvAppName = findViewById(R.id.appName);
        tvSlogan = findViewById(R.id.slogan);
        tvDevNames = findViewById(R.id.devs);

        //Animations
        sideAnim = AnimationUtils.loadAnimation(this, R.anim.side_anim);
        bottomAnim = AnimationUtils.loadAnimation(this, R.anim.bottom_anim);

        //Set Animations on elements
        tvAppName.setAnimation(sideAnim);
        tvSlogan.setAnimation(sideAnim);
        tvDevNames.setAnimation(bottomAnim);

        new Handler().postDelayed(() -> {
            Intent intent = new Intent(SplashScreen.this, MainActivity.class);
            startActivity(intent);
            finish(); //Destroys the activity so that the user is not directed to the splash screen with the back button
        }, SPLASH_TIMER);
    }
}