package com.example.user.birdapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class BirdActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird);

        Intent intent = getIntent();
        Bird bird = (Bird)intent.getSerializableExtra("bird");
        Log.d("BirdActivity: ", bird.getFamily());
    }
}
