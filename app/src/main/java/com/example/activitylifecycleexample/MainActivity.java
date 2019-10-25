package com.example.activitylifecycleexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = "MainActivity";

    int x = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCreate() "+x);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart()");

        Log.d(TAG, "whatever you want to log.");
    }

    @Override
    protected void onResume() {
        super.onResume();
        x = 20;
        Log.d(TAG, "onResume() "+x);
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart() ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause() ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop() "+x);
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy()");
    }
}
