package com.cdtxz.toa.activities;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.os.Handler;

import com.cdtxz.toa.R;

/**
 * Created by Cals on 2017/2/15.
 */

public class SplashActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        Handler handler = new Handler();
        handler.postDelayed(new SplashRunnable(),3000);
    }

    class SplashRunnable implements Runnable{
        SharedPreferences preferences;
        Intent intent;
        @Override
        public void run() {
            preferences = getSharedPreferences("splash", MODE_PRIVATE);
            String token = preferences.getString("token", null);
            if (token == null) {
                intent = new Intent(SplashActivity.this, LoginActivity.class);
            } else {
                intent = new Intent(SplashActivity.this, MainActivity.class);
            }
            startActivity(intent);
            finish();
        }
    }
}
