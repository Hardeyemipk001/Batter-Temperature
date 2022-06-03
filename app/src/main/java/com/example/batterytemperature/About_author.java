package com.example.batterytemperature;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class About_author extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.about_author);
        getSupportActionBar().hide();
    }

    public void navigate(View view) {
        finish();
    }
}
