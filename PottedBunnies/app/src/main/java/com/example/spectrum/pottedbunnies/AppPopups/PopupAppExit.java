package com.example.spectrum.pottedbunnies.AppPopups;

import android.content.Context;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.PopupWindow;

import com.example.spectrum.pottedbunnies.AppFunctions.AppGraphics;
import com.example.spectrum.pottedbunnies.R;

/**
 * Popup Window upon exiting the application.
 */

public class PopupAppExit {

    // Variables
    Context context;
    AppGraphics appGraphics;
    PopupWindow popupWindow;

    // Constructor
    public PopupAppExit (Context eContext) {
        context = eContext;
        appGraphics = new AppGraphics(context);

    }

    // Create the Popup Window
    public void createPopupWindow(View v) {

        LayoutInflater inflater = (LayoutInflater) context.
                getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View layout = inflater.inflate(R.layout.popup_exit_app,
                (ViewGroup) v.findViewById(R.id.popup_exit_app));
        popupWindow = new PopupWindow(layout, appGraphics.getFullWidth(),
                appGraphics.getFullHeight(), true);
        popupWindow.showAtLocation(layout, Gravity.CENTER, 0, 0);


        

        appGraphics.dimPopUpBackground(popupWindow);
    }
}
