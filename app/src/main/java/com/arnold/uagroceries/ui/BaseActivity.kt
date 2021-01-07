package com.arnold.uagroceries.ui

import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.constraintlayout.widget.ConstraintLayout
import com.arnold.uagroceries.R

class BaseActivity : AppCompatActivity() {

    override fun setContentView(layoutResID: Int) {

        val constraintLayout: ConstraintLayout = layoutInflater.inflate(R.layout.activity_base_activity, null)
                as ConstraintLayout
        val frameLayout: FrameLayout = constraintLayout.findViewById(R.id.activity_base)

        layoutInflater.inflate(layoutResID, frameLayout, true)
        super.setContentView(layoutResID)
    }
}