package com.arnold.uagroceries.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.arnold.uagroceries.ui.onboarding.fragments.Delivery1Fragment
import com.arnold.uagroceries.ui.onboarding.fragments.Delivery2Fragment
import com.arnold.uagroceries.ui.onboarding.fragments.Delivery3Fragment

class OnboardingAdapter(fragmentActivity: FragmentActivity) : FragmentStateAdapter(fragmentActivity) {


    companion object {
        private const val NUM_OF_PAGES: Int = 3
    }

    override fun getItemCount(): Int {
        return NUM_OF_PAGES
    }

    override fun createFragment(position: Int): Fragment {

        return when (position) {
            0 -> {
                Delivery1Fragment()
            }
            1 -> {
                Delivery2Fragment()
            }
            else -> {
                Delivery3Fragment()
            }
        }
    }
}