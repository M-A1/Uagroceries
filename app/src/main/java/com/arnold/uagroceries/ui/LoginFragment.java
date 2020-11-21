package com.arnold.uagroceries.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import com.arnold.uagroceries.R;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link LoginFragment newInstance} factory method to
 * create an instance of this fragment.
 */
public class LoginFragment extends Fragment {

    private final String TAG = getClass().getSimpleName();

    private TextView registerTextView, forgotPasswordTextView;
    private Button loginButton;


    public LoginFragment() {
        // Required empty public constructor
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View RootView = inflater.inflate(R.layout.fragment_login, container, false);


        registerTextView = RootView.findViewById(R.id.register_TextView);
        forgotPasswordTextView = RootView.findViewById(R.id.forgot_password_text_view);
        loginButton = RootView.findViewById(R.id.login_button);


        registerTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Refactor this
                RegistrationFragment registrationFragment  = new RegistrationFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container_view,registrationFragment).remove(LoginFragment.this).commit();

            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent homeIntent = new Intent(getActivity(), HomeActivity.class);
                startActivity(homeIntent);
                getActivity().finish();
            }
        });

        forgotPasswordTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogBox();
            }
        });

        // Inflate the layout for this fragment

        return RootView;
    }

    public void showDialogBox() {

        FragmentManager fn = getActivity().getSupportFragmentManager();
        ForgotPasswordFragment forgotPasswordFragment = new ForgotPasswordFragment();
        forgotPasswordFragment.show(fn, "fragment_edit_name");

    }


}