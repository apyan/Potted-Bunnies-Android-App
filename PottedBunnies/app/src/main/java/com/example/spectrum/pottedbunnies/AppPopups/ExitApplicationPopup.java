package com.example.spectrum.pottedbunnies.AppPopups;

import android.app.Activity;
import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;
import android.widget.TextView;

import com.example.spectrum.pottedbunnies.AppFunctions.AppGraphics;
import com.example.spectrum.pottedbunnies.R;

/**
 * This popup appears upon closing the application.
 */

public class ExitApplicationPopup extends PopupWindow {

    // Variables
    AppGraphics appGraphics;
    LayoutInflater inflater;
    View layout;
    Button button_00, button_01;
    TextView text_00, text_01;
    View.OnClickListener press_00, press_01;
    public boolean endApplication = false;

    // Constructor
    public ExitApplicationPopup(final Context context, final Activity currentActivity) {

        // Initialize the Popup
        super(context);
        appGraphics = new AppGraphics(context);

        // Create the Popup Window for the application to exit
        inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        layout = inflater.inflate(R.layout.popup_exit_app,
                (ViewGroup) getContentView().findViewById(R.id.popup_exit_app));
        new PopupWindow(layout, appGraphics.getFullWidth(),
                appGraphics.getFullHeight(), true);
        showAtLocation(layout, Gravity.CENTER, 0, 0);

        // UI Elements
        button_00 = (Button) getContentView().findViewById(R.id.button_proceed);
        button_01 = (Button) getContentView().findViewById(R.id.button_back);
        text_00 = (TextView) getContentView().findViewById(R.id.popup_title);
        text_01 = (TextView) getContentView().findViewById(R.id.text_000);

        // Sets up the button pressing
        // Button_00: Button to Proceed
        press_00 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Closes the Popup and end application
                dismiss();
                currentActivity.finish();
            }
        };
        button_00.setOnClickListener(press_00);

        // Button_01: Button to Back
        press_01 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Closes the Popup
                dismiss();
            }
        };
        button_01.setOnClickListener(press_01);

        appGraphics.dimPopUpBackground(this);
    }
}
