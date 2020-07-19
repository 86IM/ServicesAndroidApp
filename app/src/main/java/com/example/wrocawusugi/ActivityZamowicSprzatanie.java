package com.example.wrocawusugi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class ActivityZamowicSprzatanie extends AppCompatActivity {
    AnimationDrawable simple6Animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zamowic_sprzatanie);

        ImageView imageView = (ImageView)findViewById(R.id.image6);
        imageView.setBackgroundResource(R.drawable.animation6);
        simple6Animation = (AnimationDrawable) imageView.getBackground();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        simple6Animation.start();
    }
}