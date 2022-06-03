package com.example.batterytemperature;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class About_app extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_app);
        getSupportActionBar().hide();

    }

    public void navigate1(View view) {
        finish();
    }
}
