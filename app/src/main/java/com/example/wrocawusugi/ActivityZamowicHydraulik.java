package com.example.wrocawusugi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class ActivityZamowicHydraulik extends AppCompatActivity {
    AnimationDrawable simple2Animation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zamowic_hydraulik);

        ImageView imageView = (ImageView)findViewById(R.id.image2);
        imageView.setBackgroundResource(R.drawable.animation2);
        simple2Animation = (AnimationDrawable) imageView.getBackground();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        simple2Animation.start();
    }
}