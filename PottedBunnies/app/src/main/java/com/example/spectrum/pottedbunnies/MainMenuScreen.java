package com.example.spectrum.pottedbunnies;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.SystemClock;
import android.support.v4.app.FragmentActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.spectrum.pottedbunnies.AppFunctions.AppGraphics;

public class MainMenuScreen extends FragmentActivity {

    // Variables for Activity
    AppGraphics fragMGraphics;
    public Context context;
    Button button_00, button_01, button_02, button_03, button_04, button_05, button_06;
    TextView text_00, text_01;
    public ViewGroup.LayoutParams param_00;
    PopupWindow popupAppExit;

    public long buttonClickTime = 0;
    public long TIME_THRESHOLD = 250;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_menu_screen);

        // Set up graphic variables on the screen
        context = MainMenuScreen.this;
        fragMGraphics = new AppGraphics(context);

        // Assigning UI elements on the screen
        button_00 = (Button)findViewById(R.id.button_00);
        button_01 = (Button)findViewById(R.id.button_01);
        button_02 = (Button)findViewById(R.id.button_02);
        button_03 = (Button)findViewById(R.id.button_03);
        button_04 = (Button)findViewById(R.id.button_04);

        //String fontPath = "fonts/Titillium-Bold.ttf";
        //String fontPath = "fonts/Sansation-Bold.ttf";
        //Typeface font = Typeface.createFromAsset(getApplicationContext().getAssets(), fontPath);

        // Resizing buttons
        int widthDivision = fragMGraphics.getFullWidth() / 5;

        // Button 0
        param_00 = button_00.getLayoutParams();
        param_00.width = widthDivision;
        button_00.setLayoutParams(param_00);
        //button_00.setTypeface(font);
        button_00.setTextColor(Color.WHITE);
        // Button 1
        param_00 = button_01.getLayoutParams();
        param_00.width = widthDivision;
        button_01.setLayoutParams(param_00);
        //button_01.setTypeface(font);
        button_01.setTextColor(Color.WHITE);
        // Button 2
        param_00 = button_02.getLayoutParams();
        param_00.width = widthDivision;
        button_02.setLayoutParams(param_00);
        //button_02.setTypeface(font);
        button_02.setTextColor(Color.WHITE);
        // Button 3
        param_00 = button_03.getLayoutParams();
        param_00.width = widthDivision;
        button_03.setLayoutParams(param_00);
        //button_03.setTypeface(font);
        button_03.setTextColor(Color.WHITE);
        // Button 4
        param_00 = button_04.getLayoutParams();
        param_00.width = widthDivision;
        button_04.setLayoutParams(param_00);
        //button_04.setTypeface(font);
        button_04.setTextColor(Color.WHITE);

        // Set Home Fragment as Default
        getFragmentManager().beginTransaction().add(R.id.fragment_place, new FragmentHome()).commit();
    }

    // Home Fragment
    public void onHomeFragment(View v) {
        // Prevent multi-clicking, threshold of 250 ms
        if(SystemClock.elapsedRealtime() - buttonClickTime < TIME_THRESHOLD) {
            return;
        }
        buttonClickTime = SystemClock.elapsedRealtime();

        getFragmentManager().beginTransaction().replace(R.id.fragment_place, new FragmentHome()).commit();
    }

    // Games Fragment
    public void onGamesFragment(View v) {
        // Prevent multi-clicking, threshold of 250 ms
        if(SystemClock.elapsedRealtime() - buttonClickTime < TIME_THRESHOLD) {
            return;
        }
        buttonClickTime = SystemClock.elapsedRealtime();

        getFragmentManager().beginTransaction().replace(R.id.fragment_place, new FragmentGames()).commit();
    }

    // Gallery Fragment
    public void onGalleryFragment(View v) {
        // Prevent multi-clicking, threshold of 250 ms
        if(SystemClock.elapsedRealtime() - buttonClickTime < TIME_THRESHOLD) {
            return;
        }
        buttonClickTime = SystemClock.elapsedRealtime();

        getFragmentManager().beginTransaction().replace(R.id.fragment_place, new FragmentGallery()).commit();
    }

    // Store Fragment
    public void onStoreFragment(View v) {
        // Prevent multi-clicking, threshold of 250 ms
        if(SystemClock.elapsedRealtime() - buttonClickTime < TIME_THRESHOLD) {
            return;
        }
        buttonClickTime = SystemClock.elapsedRealtime();

        getFragmentManager().beginTransaction().replace(R.id.fragment_place, new FragmentStore()).commit();
    }

    // Options Fragment
    public void onOptionsFragment(View v) {
        // Prevent multi-clicking, threshold of 250 ms
        if(SystemClock.elapsedRealtime() - buttonClickTime < TIME_THRESHOLD) {
            return;
        }
        buttonClickTime = SystemClock.elapsedRealtime();

        getFragmentManager().beginTransaction().replace(R.id.fragment_place, new FragmentOptions()).commit();
    }

    // The phone's hardware back button is pressed
    @Override
    public void onBackPressed() {

        // Create the Popup Window for the application to exit
        LayoutInflater inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup_exit_app,
                (ViewGroup) findViewById(R.id.popup_exit_app));
        popupAppExit = new PopupWindow(layout, fragMGraphics.getFullWidth(),
                fragMGraphics.getFullHeight(), true);
        popupAppExit.showAtLocation(layout, Gravity.CENTER, 0, 0);

        // UI Elements of the Popup
        button_05 = (Button) popupAppExit.getContentView().findViewById(R.id.button_proceed);
        button_06 = (Button) popupAppExit.getContentView().findViewById(R.id.button_back);
        text_00 = (TextView) popupAppExit.getContentView().findViewById(R.id.popup_title);
        text_01 = (TextView) popupAppExit.getContentView().findViewById(R.id.text_000);

        fragMGraphics.dimPopUpBackground(popupAppExit);

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
