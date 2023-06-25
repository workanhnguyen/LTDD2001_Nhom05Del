package com.example.quanlychitieu;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends  AppCompatActivity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentItemAdd fragmentItemAdd = new FragmentItemAdd();

        // Replace the fragmentContainer with the FragmentTest fragment
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragmentContainerView4, fragmentItemAdd)
                .commit();
    }
}