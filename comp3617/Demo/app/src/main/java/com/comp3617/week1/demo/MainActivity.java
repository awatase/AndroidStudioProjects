package com.comp3617.week1.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    private static String LOGTAG = "LifeCycleDemo";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(LOGTAG, "In onCreate() method");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(LOGTAG, "In onStart() method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(LOGTAG, "In onResume() method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(LOGTAG, "In onPause() method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(LOGTAG, "In onStop() method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(LOGTAG, "In onRestart() method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(LOGTAG, "In onDestroy() method");
    }
}