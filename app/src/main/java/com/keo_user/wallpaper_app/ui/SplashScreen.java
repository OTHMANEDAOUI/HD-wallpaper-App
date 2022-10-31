package com.keo_user.wallpaper_app.ui;

import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.keo_user.wallpaper_app.R;
import com.keo_user.wallpaper_app.databinding.ActivitySplashScreenBinding;

import java.util.Random;

public class SplashScreen extends AppCompatActivity {

    int[] drawables  = new int[]{R.drawable.bg1,R.drawable.bg2,R.drawable.bg3,R.drawable.bg4,R.drawable.bg5,R.drawable.bg6};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySplashScreenBinding binding = ActivitySplashScreenBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.bg.setImageDrawable(ContextCompat.getDrawable(SplashScreen.this , drawables[new Random().nextInt(drawables.length)] ));


    }
}