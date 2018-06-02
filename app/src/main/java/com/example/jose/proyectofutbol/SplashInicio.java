package com.example.jose.proyectofutbol;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class SplashInicio extends AppCompatActivity {
    private static final int duration = 9200;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_inicio);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent intent = new Intent(SplashInicio.this, MainActivity.class);
                startActivity(intent);
                finish();

            }
        }, duration);
    }
}
