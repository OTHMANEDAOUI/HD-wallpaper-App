package com.keo_user.wallpaper_app;

import android.app.Application;
import android.view.View;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;

public class AppHelper extends Application {

    RequestQueue Queue;
    @Override
    public void onCreate() {
        super.onCreate();

        Queue = Volley.newRequestQueue(this);
        getData();

    }

    private void getData(){


    }

    
}
