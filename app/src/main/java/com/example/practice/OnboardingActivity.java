package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;



public class OnboardingActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboard1);
    }

    public void next(View view) {
        Intent intent = new Intent(this, OnBoardings2.class);
        startActivity(intent);
    }
    public void skip(View view) {
        Intent intent = new Intent(this, OnBoarding3.class);
        startActivity(intent);
    }
}