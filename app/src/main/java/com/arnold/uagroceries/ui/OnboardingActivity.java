package com.arnold.uagroceries.ui;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;

import com.arnold.uagroceries.R;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;


public class OnboardingActivity extends AppCompatActivity {


    private final String TAG = this.getClass().getSimpleName();
    TabLayout tabLayout;
    ViewPager2 viewPager2;
    OnboardingAdapter onboardingAdapter;
    final Handler handler = new Handler();
    Button loginButton, registerButton;


    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_onboarding);

        tabLayout = findViewById(R.id.tabLayout);
        viewPager2 = findViewById(R.id.viewPager2);
        onboardingAdapter = new OnboardingAdapter(this);
        loginButton = findViewById(R.id.sign_in_button);
        registerButton = findViewById(R.id.sign_up_button);

        viewPager2.setAdapter(onboardingAdapter);

        TabLayoutMediator tabLayoutMediator = new TabLayoutMediator(tabLayout, viewPager2, new TabLayoutMediator.TabConfigurationStrategy() {
            @Override
            public void onConfigureTab(@NonNull TabLayout.Tab tab, int position) {

            }
        });

        tabLayoutMediator.attach();


        viewPager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(final int position) {
                super.onPageSelected(position);

                handler.removeCallbacks(viewPagerRunnable1);
                handler.postDelayed(viewPagerRunnable1, 2000);

                if (viewPager2.getCurrentItem() == 2) {

                    handler.removeCallbacks(viewPagerRunnable1);
                    handler.postDelayed(viewPagerRunnable2, 2000);
                }


            }

        });


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hostActivity = new Intent(OnboardingActivity.this, HostActivity.class);
                hostActivity.putExtra("EXTRA", "Login");
                Log.i(TAG, "onClick: LOGIN");
                startActivity(hostActivity);

            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hostActivity = new Intent(OnboardingActivity.this, HostActivity.class);
                hostActivity.putExtra("EXTRA", "Register");
                startActivity(hostActivity);

            }
        });

    }

    @Override
    protected void onPause() {
        super.onPause();
        handler.removeCallbacks(viewPagerRunnable1, viewPagerRunnable2);

    }

    @Override
    protected void onResume() {
        super.onResume();

        handler.postDelayed(viewPagerRunnable1, 2000);

        if (viewPager2.getCurrentItem() == 2) {

            handler.postDelayed(viewPagerRunnable2, 2000);
        }
    }

    final Runnable viewPagerRunnable1 = new Runnable() {
        @Override
        public void run() {

            viewPager2.setCurrentItem(viewPager2.getCurrentItem() + 1, true);

        }

    };

    final Runnable viewPagerRunnable2 = new Runnable() {
        @Override
        public void run() {
            viewPager2.setCurrentItem(0, true);
        }
    };


}




