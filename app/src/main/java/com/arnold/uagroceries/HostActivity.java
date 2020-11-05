package com.arnold.uagroceries;

import androidx.appcompat.app.AppCompatActivity;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;

public class HostActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);

        switch (getIntent().getStringExtra("EXTRA")){
            case "Login":
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view, new LoginFragment()).addToBackStack(null).commit();
                break;

            case "Register":
                getSupportFragmentManager().beginTransaction().replace(R.id.fragment_container_view, new RegistrationFragment()).addToBackStack(null).commit();
                break;


        }



    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}