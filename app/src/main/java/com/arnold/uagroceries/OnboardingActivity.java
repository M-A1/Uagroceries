package com.arnold.uagroceries;

import android.os.Bundle;
import android.os.Handler;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class OnboardingActivity extends AppCompatActivity {

    TabLayout tabLayout;
    ViewPager2 viewPager2;
    OnboardingAdapter onboardingAdapter;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager2 = findViewById(R.id.viewPager2);
        onboardingAdapter = new OnboardingAdapter(this);

        viewPager2.setAdapter(onboardingAdapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

            }
        });

        tabLayoutMediator.attach();

        final Handler handler = new Handler();


        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(final int position) {
                super.onPageSelected(position);

                handler.removeCallbacks(runnable);
                handler.postDelayed(runnable, 2000);

                if (viewPager2.getCurrentItem() == 2) {

                    handler.removeCallbacks(runnable);
                    handler.postDelayed(runnable2, 2000);
                }


            }

        });
    }

    final Runnable runnable = new Runnable() {
        @Override
        public void run() {

            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1, true);

        }

    };

    final Runnable runnable2 = new Runnable() {
        @Override
        public void run() {
            viewPager2.setCurrentItem(0, true);
        }
    };


}




