package com.example.rubix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.util.Random;

public class Scrumbler extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrumbler);

        String [] x = {"F","R","U","L","D","F´","R´","U´","L´","D´"};

        Random rand = new Random();
        Button Generate = (Button) findViewById(R.id.btn_Generate);
        TextView Random = (TextView) findViewById(R.id.random);


        View.OnClickListener btnlistener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                    int n = rand.nextInt(10);
                    String a = x[n];
                    Random.setText(a);

            }

        };
        Generate.setOnClickListener(btnlistener);

        Button Next = (Button) findViewById(R.id.Button_crono);

        View.OnClickListener Crono = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cron = new Intent(Scrumbler.this,Cronometro.class);
                startActivity(cron);
            }
        };
        Next.setOnClickListener(Crono);


    }
}