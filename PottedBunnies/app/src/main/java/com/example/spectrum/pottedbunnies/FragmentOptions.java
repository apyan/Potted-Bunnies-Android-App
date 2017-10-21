package com.example.spectrum.pottedbunnies;

import android.app.Fragment;
import android.graphics.Color;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.example.spectrum.pottedbunnies.AppFunctions.AppGraphics;

/**
 * Fragment for the Options page.
 */

public class FragmentOptions extends Fragment implements View.OnClickListener {

    // Variables for Activity Fragment
    AppGraphics activityFragGraphics;
    Button button_00, button_01, button_02, button_03, button_04, button_05,
            button_06, button_07, button_08, button_09;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Set fragment
        View v = inflater.inflate(R.layout.fragment_options, container, false);
        activityFragGraphics = new AppGraphics(getActivity());

        // Assigning UI attributes
        button_00 = (Button) v.findViewById(R.id.options_00);
        button_00.setOnClickListener(this);
        button_00.setTextColor(Color.WHITE);
        button_01 = (Button) v.findViewById(R.id.options_01);
        button_01.setOnClickListener(this);
        button_01.setTextColor(Color.WHITE);
        button_02 = (Button) v.findViewById(R.id.options_02);
        button_02.setOnClickListener(this);
        button_02.setTextColor(Color.WHITE);
        button_03 = (Button) v.findViewById(R.id.options_03);
        button_03.setOnClickListener(this);
        button_03.setTextColor(Color.WHITE);
        button_04 = (Button) v.findViewById(R.id.options_04);
        button_04.setOnClickListener(this);
        button_04.setTextColor(Color.WHITE);
        button_05 = (Button) v.findViewById(R.id.options_05);
        button_05.setOnClickListener(this);
        button_05.setTextColor(Color.WHITE);
        button_06 = (Button) v.findViewById(R.id.options_06);
        button_06.setOnClickListener(this);
        button_06.setTextColor(Color.WHITE);
        button_07 = (Button) v.findViewById(R.id.options_07);
        button_07.setOnClickListener(this);
        button_07.setTextColor(Color.WHITE);
        button_08 = (Button) v.findViewById(R.id.options_08);
        button_08.setOnClickListener(this);
        button_08.setTextColor(Color.WHITE);
        button_09 = (Button) v.findViewById(R.id.options_09);
        button_09.setOnClickListener(this);
        button_09.setTextColor(Color.WHITE);

        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            // To Profile
            case R.id.options_00:

                break;
            // To Game Records
            case R.id.options_01:

                break;
            // To Graphics
            case R.id.options_02:

                break;
            // To Sound
            case R.id.options_03:

                break;
            // To Notifications
            case R.id.options_04:

                break;
            // To Connect
            case R.id.options_05:

                break;
            // To Support
            case R.id.options_06:

                break;
            // To Bulletin
            case R.id.options_07:

                break;
            // To Credits
            case R.id.options_08:

                break;
            // To Clear Data
            case R.id.options_09:

                break;
            default:
                break;
        }
    }

}
