package com.example.spectrum.pottedbunnies;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class SplashTitleScreen extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_title_screen);
    }

    // Click screen to go to Main Menu screen
    public void onProceed(View v) {
        Intent i = new Intent(getApplicationContext(), MainMenuScreen.class);
        startActivity(i);
        finish();
    }
}
