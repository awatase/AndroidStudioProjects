package com.comp3617.week1.demointents;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.Toast;

public class AnotherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another);

        Intent intent = getIntent();
        if (intent != null) {
            String msg = intent.getStringExtra("MSG");
            Log.d(getClass().getSimpleName(), msg);
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
        }
    }
}
