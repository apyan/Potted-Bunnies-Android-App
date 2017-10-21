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
 * Fragment for the Store page.
 */

public class FragmentStore extends Fragment implements View.OnClickListener {

    // Variables for Activity Fragment
    AppGraphics activityFragGraphics;
    Button button_00, button_01, button_02, button_03;

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

                break;
            default:
                break;
        }
    }

}
