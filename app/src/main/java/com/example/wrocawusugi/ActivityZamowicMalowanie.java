package com.example.wrocawusugi;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.widget.ImageView;

public class ActivityZamowicMalowanie extends AppCompatActivity {
    AnimationDrawable simple5Animation;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_zamowic_malowanie);

        ImageView imageView = (ImageView)findViewById(R.id.image5);
        imageView.setBackgroundResource(R.drawable.animation5);
        simple5Animation = (AnimationDrawable) imageView.getBackground();
    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        simple5Animation.start();
    }
}