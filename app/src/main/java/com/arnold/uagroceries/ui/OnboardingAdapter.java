package com.arnold.uagroceries.ui;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class OnboardingAdapter extends FragmentStateAdapter {

    final static int NUM_PAGES = 3;


    public OnboardingAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {

        if (position == 0) {
            return new Delivery1Fragment();

        } else if (position == 1) {
            return new Delivery2Fragment();

        } else {
            return new Delivery3Fragment();
        }

    }

    @Override
    public int getItemCount() {
        return NUM_PAGES;
    }
}
