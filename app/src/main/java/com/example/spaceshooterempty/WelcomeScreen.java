package com.example.spaceshooterempty;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class WelcomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(new SpaceShooter(this));

    }
}