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
 * create an instance of this fragment.
 */
public class RegistrationFragment extends Fragment {

    private TextView loginText;
    private Button registerButton;



    public RegistrationFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View RootView =  inflater.inflate(R.layout.fragment_registration, container, false);

        loginText = RootView.findViewById(R.id.login_textView);
        registerButton = RootView.findViewById(R.id.register_button);

        loginText.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                LoginFragment loginFragment = new LoginFragment();
                FragmentManager fragmentManager = getActivity().getSupportFragmentManager();

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.fragment_container_view, loginFragment).remove(RegistrationFragment.this).commit();

            }
        });

        registerButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent homeIntent = new Intent(getActivity(),HomeActivity.class);
                startActivity(homeIntent);
                getActivity().finish();

            }
        });


        // Inflate the layout for this fragment
        return RootView;
    }

}