package com.example.spectrum.pottedbunnies;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.spectrum.pottedbunnies.AppFunctions.AppGraphics;

/**
 * Fragment for the Store page.
 */

public class FragmentStore extends Fragment implements View.OnClickListener {

    // Variables for Activity Fragment
    AppGraphics activityFragGraphics;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Set fragment
        View v = inflater.inflate(R.layout.fragment_store, container, false);
        activityFragGraphics = new AppGraphics(getActivity());

        return v;
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            /*
            case R.id.citizen_button:

                break;
                */
            default:
                break;
        }
    }

}
