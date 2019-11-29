package com.isetkelibia.BasicIntent;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button mButtonAV = findViewById(R.id.btn_ACTION_VIEW);
        mButtonAV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        ActionViewActivity.class);
                startActivity(intent);
            }
        });

        Button mButtonAS = findViewById(R.id.btn_ACTION_SEND);
        mButtonAS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        ActionSendActivity.class);
                startActivity(intent);
            }
        });

        Button mButtonAD = findViewById(R.id.btn_ACTION_DIAL);
        mButtonAD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,
                        ActionDialActivity.class);
                startActivity(intent);
            }
        });
    }
}