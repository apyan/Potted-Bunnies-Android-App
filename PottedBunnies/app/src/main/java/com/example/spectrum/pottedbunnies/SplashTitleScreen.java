package com.example.spectrum.pottedbunnies;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.TextView;

public class SplashTitleScreen extends Activity {

    // Variables
    Animation anim_00 = new AlphaAnimation(0.0f, 1.0f);
    TextView text_00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_title_screen);

        // The blinking Proceed text
        text_00 = (TextView) findViewById(R.id.text_000);
        anim_00.setDuration(500);
        anim_00.setStartOffset(20);
        anim_00.setRepeatMode(Animation.REVERSE);
        anim_00.setRepeatCount(Animation.INFINITE);
        text_00.startAnimation(anim_00);
    }

    // Click screen to go to Main Menu screen
    public void onProceed(View v) {
        Intent i = new Intent(getApplicationContext(), MainMenuScreen.class);
        startActivity(i);
        finish();
    }
}
