package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

/**
 * this is the activity that would be run the main app
 */
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}