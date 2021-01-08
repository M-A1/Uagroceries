package com.arnold.uagroceries.ui

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.Window
import androidx.fragment.app.DialogFragment
import com.arnold.uagroceries.R
import com.google.android.material.textfield.TextInputLayout

class ForgotPasswordFragment : DialogFragment() {


    private var mEmail: TextInputLayout? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        //Kindly revise
        if (dialog != null && dialog?.window != null) {
            dialog?.window?.setBackgroundDrawable(ColorDrawable(Color.TRANSPARENT))
            dialog?.window?.requestFeature(Window.FEATURE_NO_TITLE)
        }

        return inflater.inflate(R.layout.dialog_forgot_password, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        mEmail = view.findViewById(R.id.email_textInputLayout)
        super.onViewCreated(view, savedInstanceState)
    }
}