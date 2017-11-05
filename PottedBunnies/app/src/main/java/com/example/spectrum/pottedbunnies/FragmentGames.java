package com.example.spectrum.pottedbunnies;

import android.app.Fragment;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.PopupWindow;

import com.example.spectrum.pottedbunnies.AppFunctions.AppGraphics;

/**
 * Fragment for the Games page.
 */

public class FragmentGames extends Fragment implements View.OnClickListener {

    // Variables for Activity Fragment
    public AppGraphics activityFragGraphics;
    public PopupWindow orderPluckingPW;
    public Button button_00, button_01;
    public Button popup_00, popup_01, popup_02, popup_03, popup_04;
    public Intent toActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Set fragment
        View v = inflater.inflate(R.layout.fragment_games, container, false);
        activityFragGraphics = new AppGraphics(getActivity());

        // Assigning UI attributes
        button_00 = (Button) v.findViewById(R.id.games_00);
        button_00.setOnClickListener(this);
        button_00.setTextColor(Color.WHITE);
        button_01 = (Button) v.findViewById(R.id.games_01);
        button_01.setOnClickListener(this);
        button_01.setTextColor(Color.WHITE);

        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            // To Matching Pots game
            case R.id.games_00:

                break;
            // To Order Plucking game
            case R.id.games_01:
                // Create the Popup Window for Order Plucking game
                LayoutInflater inflater = (LayoutInflater) getActivity().
                        getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View layout = inflater.inflate(R.layout.popup_games_000,
                        (ViewGroup) v.findViewById(R.id.popup_games_000));
                orderPluckingPW = new PopupWindow(layout, activityFragGraphics.getFullWidth(),
                        activityFragGraphics.getFullHeight(), true);
                orderPluckingPW.showAtLocation(layout, Gravity.CENTER, 0, 0);

                // Assigns UI elements of the Popup
                popup_00 = (Button) orderPluckingPW.getContentView().findViewById(R.id.button_op_close);
                popup_01 = (Button) orderPluckingPW.getContentView().findViewById(R.id.op_mode_025);
                popup_02 = (Button) orderPluckingPW.getContentView().findViewById(R.id.op_mode_050);
                popup_03 = (Button) orderPluckingPW.getContentView().findViewById(R.id.op_mode_075);
                popup_04 = (Button) orderPluckingPW.getContentView().findViewById(R.id.op_mode_100);
                popup_00.setOnClickListener(this);
                popup_01.setOnClickListener(this);
                popup_02.setOnClickListener(this);
                popup_03.setOnClickListener(this);
                popup_04.setOnClickListener(this);
                activityFragGraphics.dimPopUpBackground(orderPluckingPW);
                break;
            // To close the Order Plucking popup
            case R.id.button_op_close:
                orderPluckingPW.dismiss();
                break;
            // Order Plucking Mode: 25
            case R.id.op_mode_025:
                orderPluckingPW.dismiss();
                toActivity = new Intent(getActivity(), GameOrderPluckingScreen.class);
                startActivity(toActivity);
                break;
            // Order Plucking Mode: 50
            case R.id.op_mode_050:
                orderPluckingPW.dismiss();
                toActivity = new Intent(getActivity(), GameOrderPluckingScreen.class);
                startActivity(toActivity);
                break;
            // Order Plucking Mode: 75
            case R.id.op_mode_075:
                orderPluckingPW.dismiss();
                toActivity = new Intent(getActivity(), GameOrderPluckingScreen.class);
                startActivity(toActivity);
                break;
            // Order Plucking Mode: 100
            case R.id.op_mode_100:
                orderPluckingPW.dismiss();
                toActivity = new Intent(getActivity(), GameOrderPluckingScreen.class);
                startActivity(toActivity);
                break;
            default:
                break;
        }
    }

}
