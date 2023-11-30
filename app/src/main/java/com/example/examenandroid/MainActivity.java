package com.example.examenandroid;

import android.content.res.Configuration;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (getResources().getConfiguration().orientation == Configuration.ORIENTATION_PORTRAIT) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.frame1, new FragmentLista())
                    .addToBackStack(null)
                    .commit();
        } else {
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
}