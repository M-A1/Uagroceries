package com.arnold.uagroceries.ui.registration

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.arnold.uagroceries.R
import com.arnold.uagroceries.ui.ForgotPasswordFragment
import com.arnold.uagroceries.ui.home.HomeActivity

class LoginFragment : Fragment() {

    private lateinit var registerTextView: TextView
    private lateinit var forgotPasswordTextView: TextView
    private lateinit var loginButton: Button

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {

        val rootView: View = inflater.inflate(R.layout.fragment_login, container, false)

        registerTextView = rootView.findViewById(R.id.register_TextView)
        forgotPasswordTextView = rootView.findViewById(R.id.forgot_password_text_view)
        loginButton = rootView.findViewById(R.id.login_button)


        registerTextView.setOnClickListener {

            val registrationFragment = RegistrationFragment()
            val fragmentManager = requireActivity().supportFragmentManager

            val fragmentTransaction = fragmentManager.beginTransaction()
            fragmentTransaction.replace(R.id.fragment_container_view, registrationFragment).remove(this@LoginFragment).commit()
        }

        loginButton.setOnClickListener {
            val homeIntent = Intent(activity, HomeActivity::class.java)
            startActivity(homeIntent)
            requireActivity().finish()
        }

        forgotPasswordTextView.setOnClickListener {
            showDialogBox()
        }


        return rootView

    }

    private fun showDialogBox() {

        val fm: FragmentManager = requireActivity().supportFragmentManager
        val forgotPasswordFragment = ForgotPasswordFragment()
        forgotPasswordFragment.show(fm, "fragment_edit_name")
    }


}