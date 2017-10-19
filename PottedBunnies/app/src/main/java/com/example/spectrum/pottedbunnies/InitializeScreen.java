package com.example.spectrum.pottedbunnies;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Typeface;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InitializeScreen extends Activity {

    // Variables
    static int LOADING_TIME_MAX = 5000;
    public String fontPath;
    public Typeface font;

    public TextView text_00;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_initialize_screen);

        fontPath = "fonts/Rubik-Regular.ttf";
        font = Typeface.createFromAsset(getApplicationContext().getAssets(), fontPath);

        text_00 = (TextView) findViewById(R.id.text_000);
        text_00.setTypeface(font);
    }

    // Click loading image to go to title
    public void toProceed(View v) {
        Intent i = new Intent(getApplicationContext(), SplashTitleScreen.class);
        startActivity(i);
        finish();
    }
}
