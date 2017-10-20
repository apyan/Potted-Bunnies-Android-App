package com.example.spectrum.pottedbunnies;

import android.app.Fragment;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.Typeface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.example.spectrum.pottedbunnies.AppFunctions.AppGraphics;

/**
 * Fragment for the Home page.
 */

public class FragmentHome extends Fragment implements View.OnClickListener {

    // Variables for Activity Fragment
    AppGraphics activityFragGraphics;

    Button button_00, button_01;
    ImageView imageView_00;

    // Testing Purposes
    int currentValue = 0;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Set fragment
        View v = inflater.inflate(R.layout.fragment_home, container, false);
        activityFragGraphics = new AppGraphics(getActivity());

        // Assign UI elements
        imageView_00 = (ImageView) v.findViewById(R.id.plant_00);
        imageView_00.setOnClickListener(this);
        button_00 =  (Button) v.findViewById(R.id.citizen_button);
        button_00.setOnClickListener(this);
        button_01 =  (Button) v.findViewById(R.id.mail_button);
        button_01.setOnClickListener(this);

        // Set title font
        String fontPath = "fonts/Titillium-Bold.ttf";
        String fontPath_0 = "fonts/Titillium-Semibold.ttf";
        //String fontPath = "fonts/Sansation-Bold.ttf";
        //String fontPath_0 = "fonts/Sansation-Regular.ttf";
        /*Typeface font = Typeface.createFromAsset(getActivity().getAssets(), fontPath);
        Typeface font_0 = Typeface.createFromAsset(getActivity().getAssets(), fontPath_0);
        TextView text_title = (TextView) v.findViewById(R.id.lessons_title);
        text_title.setTypeface(font);
        text_title.setTextColor(Color.WHITE);*/

        // Button onClick Inputs
        /*Button button_00 = (Button) v.findViewById(R.id.lessons_00);
        button_00.setOnClickListener(this);
        button_00.setTypeface(font_0);
        button_00.setTextColor(Color.WHITE);
        Button button_01 = (Button) v.findViewById(R.id.lessons_01);
        button_01.setOnClickListener(this);
        button_01.setTypeface(font_0);
        button_01.setTextColor(Color.WHITE);
        Button button_02 = (Button) v.findViewById(R.id.lessons_02);
        button_02.setOnClickListener(this);
        button_02.setTypeface(font_0);
        button_02.setTextColor(Color.WHITE);
        Button button_03 = (Button) v.findViewById(R.id.lessons_03);
        button_03.setOnClickListener(this);
        button_03.setTypeface(font_0);
        button_03.setTextColor(Color.WHITE);
        Button button_04 = (Button) v.findViewById(R.id.lessons_04);
        button_04.setOnClickListener(this);
        button_04.setTypeface(font_0);
        button_04.setTextColor(Color.WHITE);
        Button button_05 = (Button) v.findViewById(R.id.lessons_05);
        button_05.setOnClickListener(this);
        button_05.setTypeface(font_0);
        button_05.setTextColor(Color.WHITE);*/

        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            // Touching the Plant Bunny
            case R.id.plant_00:
                int [] values = new int[]{ R.drawable.planted_seed_000, R.drawable.planted_sprout_000,
                        R.drawable.planted_sprout_001, R.drawable.planted_sprout_002,
                        R.drawable.planted_blossom_000, R.drawable.planted_blossom_001,
                        R.drawable.planted_blossom_002};
                currentValue++;
                if(currentValue == values.length) currentValue = 0;
                imageView_00.setImageResource(values[currentValue]);
                break;
            // To Citizenship
            case R.id.citizen_button:

                break;
            // Open Mailbox Popup
            case R.id.mail_button:

                break;
            default:
                break;
        }
    }

}
