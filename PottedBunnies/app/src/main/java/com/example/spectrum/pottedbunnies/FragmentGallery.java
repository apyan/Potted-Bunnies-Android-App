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
 * Fragment for the Gallery page.
 */

public class FragmentGallery extends Fragment implements View.OnClickListener {

    // Variables for Activity Fragment
    AppGraphics activityFragGraphics;
    Button button_00, button_01, button_02, button_03, button_04, button_05;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Set fragment
        View v = inflater.inflate(R.layout.fragment_gallery, container, false);
        activityFragGraphics = new AppGraphics(getActivity());

        // Assigning UI attributes
        button_00 = (Button) v.findViewById(R.id.gallery_00);
        button_00.setOnClickListener(this);
        button_00.setTextColor(Color.WHITE);
        button_01 = (Button) v.findViewById(R.id.gallery_01);
        button_01.setOnClickListener(this);
        button_01.setTextColor(Color.WHITE);
        button_02 = (Button) v.findViewById(R.id.gallery_02);
        button_02.setOnClickListener(this);
        button_02.setTextColor(Color.WHITE);
        button_03 = (Button) v.findViewById(R.id.gallery_03);
        button_03.setOnClickListener(this);
        button_03.setTextColor(Color.WHITE);
        button_04 = (Button) v.findViewById(R.id.gallery_04);
        button_04.setOnClickListener(this);
        button_04.setTextColor(Color.WHITE);
        button_05 = (Button) v.findViewById(R.id.gallery_05);
        button_05.setOnClickListener(this);
        button_05.setTextColor(Color.WHITE);

        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            // To the Inventory
            case R.id.gallery_00:

                break;
            // To the Citizens
            case R.id.gallery_01:

                break;
            // To the Potted Bunnies
            case R.id.gallery_02:

                break;
            // To the Scores
            case R.id.gallery_03:

                break;
            // To the Trophies
            case R.id.gallery_04:

                break;
            // To the Sticker Book
            case R.id.gallery_05:

                break;
            default:
                break;
        }
    }

}
