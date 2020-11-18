package com.arnold.uagroceries;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.fragment.NavHostFragment;
import androidx.navigation.ui.NavigationUI;

import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class HostActivity extends AppCompatActivity {

    private final String TAG = this.getClass().getSimpleName();
    NavHostFragment navHostFragment;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_host);

/*
        navHostFragment = (NavHostFragment) getSupportFragmentManager().findFragmentById(R.id.nav_host_fragment_container);
*/

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