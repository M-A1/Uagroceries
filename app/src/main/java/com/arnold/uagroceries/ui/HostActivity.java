package com.arnold.uagroceries.ui;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.arnold.uagroceries.R;

public class HostActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);


        switch (getIntent().getStringExtra("EXTRA")){
            case "Login":
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view, new LoginFragment()).commit();
                break;

            case "Register":
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view, new RegistrationFragment()).commit();
                break;


        }



    }

   @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}