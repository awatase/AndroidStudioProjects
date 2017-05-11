package com.comp3617.week1.demointentsexchange;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private int REQUEST_CODE = 100;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void onClick (View v) {
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra("MSG", "How are you");
        startActivityForResult(intent, REQUEST_CODE);
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_CODE) {
            String msg = data.getStringExtra("RESPONSE");
            Toast.makeText(this, msg, Toast.LENGTH_LONG).show();
        }
    }
}
