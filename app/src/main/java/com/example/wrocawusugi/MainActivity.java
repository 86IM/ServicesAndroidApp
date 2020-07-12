package com.example.wrocawusugi;
import androidx.appcompat.app.AppCompatActivity;
import android.content.pm.ActivityInfo;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button button = (Button) findViewById(R.id.button_settings);
        Button button1 = (Button) findViewById(R.id.meble_button);
        Button button2 = (Button) findViewById(R.id.naprawy_button);
        Button button3 = (Button) findViewById(R.id.hydraulika_button);
        Button button4 = (Button) findViewById(R.id.elektryka_button);
        Button button5 = (Button) findViewById(R.id.elektryka_zamowic_button);


        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingsActivity();
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            }
        });
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMeble();
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityNaprawy();
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            }
        });


        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityHydraulika();
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityElektryka();
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            }
        });
        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityZamowicElectrik();
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            }
        });
    }


    public void openSettingsActivity() {
        Intent intent = new Intent(this, SettingsActivity.class);
        startActivity(intent);
    }
    public void openActivityMeble() {
        Intent intent = new Intent(this, ActivityMeble.class);
        startActivity(intent);
    }
    public void openActivityNaprawy() {
        Intent intent = new Intent(this, ActivityNaprawy.class);
        startActivity(intent);
    }
    public void openActivityHydraulika() {
        Intent intent = new Intent(this, ActivityHydraulika.class);
        startActivity(intent);
    }
    public void openActivityElektryka() {
        Intent intent = new Intent(this, ActivityElektryka.class);
        startActivity(intent);
    }
    public void openActivityZamowicElectrik() {
        Intent intent = new Intent(this, ActivityZamowicElectrik.class);
        startActivity(intent);
    }
}

