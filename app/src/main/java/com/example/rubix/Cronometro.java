package com.example.rubix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Button;
import android.widget.Chronometer;

public class Cronometro extends AppCompatActivity {
    private Chronometer cronometro;
    private boolean corriendo;
    private long diferenciaTiempo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cronometro);

        cronometro= findViewById(R.id.cronometro);
        Button bot = (Button) findViewById(R.id.Profile);
        View.OnClickListener Profff = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Prof = new Intent(Cronometro.this,Profile.class);
                startActivity(Prof);
            }
        };
        bot.setOnClickListener(Profff);

    }

    public void empezarCronometro(View v){
        if(!corriendo){
            cronometro.setBase(SystemClock.elapsedRealtime() - diferenciaTiempo);
            cronometro.start();
            corriendo = true;

        }
    }

    public void pausarCronometro(View v){
        cronometro.stop();
        diferenciaTiempo = SystemClock.elapsedRealtime() - cronometro.getBase();
        corriendo = false;

    }

    public void reiniciarCronometro(View v){
        cronometro.setBase(SystemClock.elapsedRealtime());
        diferenciaTiempo = 0;
    }




}