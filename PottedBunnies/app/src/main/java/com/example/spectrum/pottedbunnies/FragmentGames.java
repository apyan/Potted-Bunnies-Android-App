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
 * Fragment for the Games page.
 */

public class FragmentGames extends Fragment implements View.OnClickListener {

    // Variables for Activity Fragment
    AppGraphics activityFragGraphics;
    Button button_00, button_01;

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

                break;
            default:
                break;
        }
    }

}