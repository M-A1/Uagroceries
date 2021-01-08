package com.arnold.uagroceries.ui.registration

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.arnold.uagroceries.R
import com.arnold.uagroceries.ui.home.HomeActivity

class RegistrationFragment : Fragment() {

    private lateinit var loginText: TextView
    private lateinit var registerButton: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        val rootView: View = inflater.inflate(R.layout.fragment_registration, container, false)

        loginText = rootView.findViewById(R.id.login_textView)
        registerButton = rootView.findViewById(R.id.register_button)

        loginText.setOnClickListener {
            val loginFragment = LoginFragment()
            val fragmentManager = requireActivity().supportFragmentManager
            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container_view, loginFragment).remove(this@RegistrationFragment).commit()
        }

        registerButton.setOnClickListener {
            val homeIntent = Intent(activity, HomeActivity::class.java)
            startActivity(homeIntent)
            requireActivity().finish()
        }


        // Inflate the layout for this fragment
        return rootView
    }


}