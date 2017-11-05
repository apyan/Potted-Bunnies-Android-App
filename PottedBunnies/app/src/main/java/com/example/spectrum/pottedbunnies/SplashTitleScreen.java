package com.example.spectrum.pottedbunnies;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.view.animation.Animation;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.widget.Toast;

import com.example.spectrum.pottedbunnies.AppFunctions.AppGraphics;

public class SplashTitleScreen extends Activity {

    // Variables for Activity
    public AppGraphics splashScreenGraphics;
    public PopupWindow popupAppExit;
    public Context context;
    public Animation anim_00 = new AlphaAnimation(0.0f, 1.0f);
    public TextView text_00, text_01, text_02;
    public Button button_00, button_01;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initiate activity elements
        setContentView(R.layout.activity_splash_title_screen);
        splashScreenGraphics = new AppGraphics(this);
        context = this;

        // The blinking Proceed prompt text
        text_00 = (TextView) findViewById(R.id.text_000);
        anim_00.setDuration(500);
        anim_00.setStartOffset(20);
        anim_00.setRepeatMode(Animation.REVERSE);
        anim_00.setRepeatCount(Animation.INFINITE);
        text_00.startAnimation(anim_00);
    }

    // Click screen to go to Main Menu screen
    public void onProceed(View v) {
        Intent intent = new Intent(getApplicationContext(), MainMenuScreen.class);
        startActivity(intent);
        finish();
    }

    // The phone's hardware back button is pressed
    @Override
    public void onBackPressed() {

        // Create the Popup Window for the application to exit
        LayoutInflater inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup_exit_app,
                (ViewGroup) findViewById(R.id.popup_exit_app));
        popupAppExit = new PopupWindow(layout, splashScreenGraphics.getFullWidth(),
                splashScreenGraphics.getFullHeight(), true);
        popupAppExit.showAtLocation(layout, Gravity.CENTER, 0, 0);

        // UI Elements of the Popup
        button_00 = (Button) popupAppExit.getContentView().findViewById(R.id.button_proceed);
        button_01 = (Button) popupAppExit.getContentView().findViewById(R.id.button_back);
        text_01 = (TextView) popupAppExit.getContentView().findViewById(R.id.popup_title);
        text_02 = (TextView) popupAppExit.getContentView().findViewById(R.id.text_000);
        splashScreenGraphics.dimPopUpBackground(popupAppExit);
    }

    // For the Popup to close the application
    public void onPopupProceed(View v) {
        popupAppExit.dismiss();
        finish();
    }

    // For the Popup to go back to the application
    public void onPopupBack(View v) {
        popupAppExit.dismiss();
    }
}
