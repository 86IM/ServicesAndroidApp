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


        Button button_settings = (Button) findViewById(R.id.button_settings);
        Button meble_button = (Button) findViewById(R.id.meble_button);
        Button naprawy_button = (Button) findViewById(R.id.naprawy_button);
        Button hydraulika_button = (Button) findViewById(R.id.hydraulika_button);
        Button elektryka_button = (Button) findViewById(R.id.elektryka_button);

        //Buttons add

        Button elektryka_zamowic_button = (Button) findViewById(R.id.elektryka_zamowic_button);
        Button hydraulika_zamowic_button2 = (Button) findViewById(R.id.hydraulika_zamowic_button2);
        Button meble_zamowic_button3 = (Button) findViewById(R.id.meble_zamowic_button3);
        Button agd_zamowic_button4 = (Button) findViewById(R.id.agd_zamowic_button4);
        Button malowanie_zamowic_button5 = (Button) findViewById(R.id.malowanie_zamowic_button5);
        Button sprzatanie_zamowic_button6 = (Button) findViewById(R.id.sprzatanie_zamowic_button6);



        button_settings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openSettingsActivity();
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            }
        });
        meble_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityMeble();
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            }
        });
        naprawy_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityNaprawy();
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            }
        });
        hydraulika_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityHydraulika();
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            }
        });
        elektryka_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityElektryka();
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            }
        });
        agd_zamowic_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityZamowicAgd();
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            }
        });
        elektryka_zamowic_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityZamowicElectrik();
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            }
        });
        hydraulika_zamowic_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityZamowicHydraulik();
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            }
        });
        meble_zamowic_button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityZamowicMeble();
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            }
        });
        agd_zamowic_button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityZamowicAgd();
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            }
        });
        malowanie_zamowic_button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityZamowicMalowanie();
                setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);

            }

        });
        sprzatanie_zamowic_button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivityZamowicSprzatanie();
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

    public void openActivityZamowicHydraulik() {
        Intent intent = new Intent(this, ActivityZamowicHydraulik.class);
        startActivity(intent);
    }

    public void openActivityZamowicMeble() {
        Intent intent = new Intent(this, ActivityZamowicMeble.class);
        startActivity(intent);
    }

    public void openActivityZamowicAgd() {
        Intent intent = new Intent(this, ActivityZamowicAgd.class);
        startActivity(intent);
    }

    public void openActivityZamowicMalowanie() {
        Intent intent = new Intent(this, ActivityZamowicMalowanie.class);
        startActivity(intent);
    }

    public void openActivityZamowicSprzatanie() {
        Intent intent = new Intent(this, ActivityZamowicSprzatanie.class);
        startActivity(intent);
    }

}

