package com.example.SECURICO;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.SECURICO.Fregment.Fragment_Sign_up;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.mainlayout, new Fragment_Sign_up())
                .commit();

    }
}