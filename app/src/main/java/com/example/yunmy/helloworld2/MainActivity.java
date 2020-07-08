package com.example.yunmy.helloworld2;

import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    public int mCount = 0;
    public TextView mTV_count;
    public Button mBtn_1, mBtn_2, mBtn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTV_count = (TextView) findViewById(R.id.textView);
        mBtn_1 = (Button) findViewById(R.id.button);
        mBtn_2 = (Button) findViewById(R.id.button2);
        mBtn_3 = (Button) findViewById(R.id.button3);

        mTV_count.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        mBtn_1.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(MainActivity.this, "You click " + mCount + " times.", Toast.LENGTH_LONG).show();
            }
        });

        mBtn_2.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                new AlertDialog.Builder(MainActivity.this)
                        .setTitle("Confirm")
                        .setMessage("You click " + mCount + " times.")
                        .setPositiveButton("OK", null)
                        .create()
                        .show();

            }
        });

        mBtn_3.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {

                mCount++;
                mTV_count.setText(String.valueOf(mCount));
                Log.d("MainActivity", "mCount == " + mCount);
            }
        });
    }

    @Override
    protected void onRestart() {
        super.onRestart();

        mCount = 0;
        mTV_count.setText(String.valueOf(mCount));
    }
}
