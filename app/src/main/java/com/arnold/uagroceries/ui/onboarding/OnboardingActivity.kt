package com.arnold.uagroceries.ui.onboarding

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.PersistableBundle
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import androidx.viewpager2.widget.ViewPager2.OnPageChangeCallback
import com.arnold.uagroceries.R
import com.arnold.uagroceries.adapters.OnboardingAdapter
import com.arnold.uagroceries.ui.BaseActivity
import com.arnold.uagroceries.ui.registration.HostActivity
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class OnboardingActivity : BaseActivity() {

    private lateinit var tabLayout: TabLayout
    private lateinit var viewPager2: ViewPager2
    private lateinit var OnboardingAdapter: OnboardingAdapter
    private lateinit var loginButton: Button
    private lateinit var registerButton: Button
    val handler = Handler()

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_onboarding)

        tabLayout = findViewById(R.id.tabLayout)
        viewPager2 = findViewById(R.id.viewPager2)
        OnboardingAdapter = OnboardingAdapter(this)
        loginButton = findViewById(R.id.sign_in_button)
        registerButton = findViewById(R.id.sign_up_button)

        viewPager2.adapter = OnboardingAdapter

        val tabLayoutMediator = TabLayoutMediator(tabLayout, viewPager2) { tab, position -> }

        tabLayoutMediator.attach()

        viewPager2.registerOnPageChangeCallback(object : OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                handler.removeCallbacks(viewPagerRunnable1)
                handler.postDelayed(viewPagerRunnable1, 2000)
                if (viewPager2.currentItem == 2) {
                    handler.removeCallbacks(viewPagerRunnable1)
                    handler.postDelayed(viewPagerRunnable2, 2000)
                }
            }
        })

        loginButton.setOnClickListener {
            val hostActivity = Intent(this@OnboardingActivity, HostActivity::class.java)
            hostActivity.putExtra("EXTRA", "Login")
            startActivity(hostActivity)
        }

        registerButton.setOnClickListener {
            val hostActivity = Intent(this@OnboardingActivity, HostActivity::class.java)
            hostActivity.putExtra("EXTRA", "Register")
            startActivity(hostActivity)
        }


    }

    override fun onPause() {
        super.onPause()
        handler.removeCallbacks(viewPagerRunnable1, viewPagerRunnable2)
    }

    override fun onResume() {
        super.onResume()
        handler.postDelayed(viewPagerRunnable1, 2000)
        if (viewPager2.currentItem == 2) {
            handler.postDelayed(viewPagerRunnable2, 2000)
        }
    }

    val viewPagerRunnable1 = Runnable { viewPager2.setCurrentItem(viewPager2.currentItem + 1, true) }

    val viewPagerRunnable2 = Runnable { viewPager2.setCurrentItem(0, true) }


}