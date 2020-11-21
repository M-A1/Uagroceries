package com.arnold.uagroceries.util;

import android.util.DisplayMetrics;

import androidx.fragment.app.Fragment;


public class Metrics extends Fragment {

    DisplayMetrics metrics = getActivity().getResources().getDisplayMetrics();
    public int width = metrics.widthPixels;
    public int height = metrics.heightPixels;

    public void Metrics() {
    }
}
