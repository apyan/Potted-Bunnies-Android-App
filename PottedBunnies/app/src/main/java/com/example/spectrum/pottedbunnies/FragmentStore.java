package com.example.spectrum.pottedbunnies;

import android.app.Fragment;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.PopupWindow;

import com.example.spectrum.pottedbunnies.AppFunctions.AppGraphics;

/**
 * Fragment for the Store page.
 */

public class FragmentStore extends Fragment implements View.OnClickListener {

    // Variables for Activity Fragment
    public AppGraphics activityFragGraphics;
    public Button button_00, button_01, button_02, button_03;
    public Button popup_00, popup_01, popup_02, popup_03, popup_04;
    public LinearLayout linear_00, linear_01;
    public PopupWindow coinsGemsPW;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Set fragment
        View v = inflater.inflate(R.layout.fragment_store, container, false);
        activityFragGraphics = new AppGraphics(getActivity());

        // Assigning UI attributes
        button_00 = (Button) v.findViewById(R.id.store_00);
        button_00.setOnClickListener(this);
        button_00.setTextColor(Color.WHITE);
        button_01 = (Button) v.findViewById(R.id.store_01);
        button_01.setOnClickListener(this);
        button_01.setTextColor(Color.WHITE);
        button_02 = (Button) v.findViewById(R.id.store_02);
        button_02.setOnClickListener(this);
        button_02.setTextColor(Color.WHITE);
        button_03 = (Button) v.findViewById(R.id.store_03);
        button_03.setOnClickListener(this);
        button_03.setTextColor(Color.WHITE);

        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            // To General Store
            case R.id.store_00:

                break;
            // To Seed Machine
            case R.id.store_01:

                break;
            // To Bunny Machine
            case R.id.store_02:

                break;
            // To Coins and Gems
            case R.id.store_03:
                // Create the Popup Window for Coins and Gems
                LayoutInflater inflater = (LayoutInflater) getActivity().
                        getSystemService(Context.LAYOUT_INFLATER_SERVICE);
                View layout = inflater.inflate(R.layout.popup_store_000,
                        (ViewGroup) v.findViewById(R.id.popup_store_000));
                coinsGemsPW = new PopupWindow(layout, activityFragGraphics.getFullWidth(),
                        activityFragGraphics.getFullHeight(), true);
                coinsGemsPW.showAtLocation(layout, Gravity.CENTER, 0, 0);

                // Assigns UI elements of the Popup
                popup_00 = (Button) coinsGemsPW.getContentView().findViewById(R.id.cg_store_close);
                linear_00 = (LinearLayout) coinsGemsPW.getContentView().findViewById(R.id.cg_value_00);
                linear_01 = (LinearLayout) coinsGemsPW.getContentView().findViewById(R.id.cg_value_01);
                popup_00.setOnClickListener(this);
                linear_00.setOnClickListener(this);
                linear_01.setOnClickListener(this);
                activityFragGraphics.dimPopUpBackground(coinsGemsPW);
                break;
            // To close the Coins and Gems popup
            case R.id.cg_store_close:
                coinsGemsPW.dismiss();
                break;
            // Watch Video for 100 Coins
            case R.id.cg_value_00:
                //coinsGemsPW.dismiss();
                break;
            // Watch Video for 2 Gems
            case R.id.cg_value_01:
                //coinsGemsPW.dismiss();
                break;
            default:
                break;
        }
    }

}
