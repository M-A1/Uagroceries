package com.arnold.uagroceries;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Delivery2Fragment extends Fragment {

    View view;

    public Delivery2Fragment() {

    }

    @NonNull
    @Override

    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.delivery2_fragment, container, false);
        return view;
    }

}
