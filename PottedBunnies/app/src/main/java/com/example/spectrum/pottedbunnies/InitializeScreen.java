package com.example.spectrum.pottedbunnies;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class InitializeScreen extends AppCompatActivity {

    // Variables
    static int LOADING_TIME_MAX = 5000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initialize_screen);
    }
}
