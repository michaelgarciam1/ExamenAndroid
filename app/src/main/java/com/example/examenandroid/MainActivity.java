package com.example.examenandroid;

import android.content.res.Configuration;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cambioDireccion();
    }

    private void cambioDireccion(){
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            FrameLayout fr= findViewById(R.id.frame2);
            fr.setVisibility(View.GONE);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame1, new FragmentLista())
                    .addToBackStack(null)
                    .commit();
        } else {
            FrameLayout fr= findViewById(R.id.frame2);
            fr.setVisibility(View.VISIBLE);
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame1, new FragmentLista())
                    .addToBackStack(null)
                    .commit();
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame2, new FragmentFutbol())
                    .addToBackStack(null)
                    .commit();
        }
    }



    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
            if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
                FrameLayout fr= findViewById(R.id.frame2);
                fr.setVisibility(View.GONE);
                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame1, new FragmentLista())
                        .addToBackStack(null)
                        .commit();
            } else {
                FrameLayout fr= findViewById(R.id.frame2);
                fr.setVisibility(View.VISIBLE);

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame1, new FragmentLista())
                        .addToBackStack(null)
                        .commit();

                getSupportFragmentManager().beginTransaction()
                        .replace(R.id.frame2, new FragmentFutbol())
                        .addToBackStack(null)
                        .commit();
            }
        }
    }
