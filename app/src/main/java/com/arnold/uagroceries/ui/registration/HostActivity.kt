package com.arnold.uagroceries.ui.registration

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.arnold.uagroceries.R

class HostActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState, persistentState)
        setContentView(R.layout.activity_home_activity)

        when (intent.getStringExtra("EXTRA")) {
            "Login" -> supportFragmentManager.beginTransaction().replace(R.id.fragment_container_view, LoginFragment()).commit()
            "Register" -> supportFragmentManager.beginTransaction().replace(R.id.fragment_container_view, RegistrationFragment()).commit()
        }


    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }
}