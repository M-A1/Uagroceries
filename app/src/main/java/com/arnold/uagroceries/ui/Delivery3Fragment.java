package com.arnold.uagroceries.ui;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.arnold.uagroceries.R;

public class Delivery3Fragment extends Fragment {

    View view;

    public Delivery3Fragment() {

    }

    @Override
    @Nullable

    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        view = inflater.inflate(R.layout.delivery3_fragment, container, false);
        return view;

    }
}
