package com.example.practice;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class OnBoardings2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.onboard2);
    }

    public void next(View view) {
        Intent intent = new Intent(this, OnBoarding3.class);
        startActivity(intent);
    }

    public void skip(View view) {
        Intent intent = new Intent(this, OnBoarding3.class);
        startActivity(intent);
    }
}