package com.example.rubix;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button next = (Button) findViewById(R.id.button_edit);
        View.OnClickListener btnlistener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent BTN = new Intent( MainActivity.this,Biblioteca.class );
                startActivity(BTN);

            }
        };
        next.setOnClickListener(btnlistener);

    }

}