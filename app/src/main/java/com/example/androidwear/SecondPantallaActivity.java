package com.example.androidwear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SecondPantallaActivity extends AppCompatActivity {

    private EditText edades;
    Button btnvolver;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_pantalla);


    ids();
    botones();
    }

    private void ids() {

        btnvolver = findViewById(R.id.button2);
        edades = findViewById(R.id.txt_2);
    }

    private void botones() {
        btnvolver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String nombre = edades.getText().toString();

                if (edades.getText().toString().equals("maria")) {
                    Intent pantalla = new Intent(SecondPantallaActivity.this, MainActivity.class);
                    startActivity(pantalla);

                } else {
                    Toast.makeText(SecondPantallaActivity.this, "No eres mayor", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}