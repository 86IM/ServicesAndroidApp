package com.example.wrocawusugi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class ActivityZamowicAgd extends AppCompatActivity {

    AnimationDrawable simple4Animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zamowic_agd);
        ImageView imageView = (ImageView)findViewById(R.id.image4);
        imageView.setBackgroundResource(R.drawable.animation4);
        simple4Animation = (AnimationDrawable) imageView.getBackground();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        simple4Animation.start();
    }
}