package com.example.androidwear;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText edad;
    Button btncambiar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ids();
        botones();
    }



    private void ids() {

        btncambiar = findViewById(R.id.button);
        edad = findViewById(R.id.txt_clave);
    }

    private void botones() {
        btncambiar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int textoEdad = Integer.parseInt(edad.getText().toString());

                if (textoEdad >= 18){
                    Intent pantalla = new Intent(MainActivity.this, SecondPantallaActivity.class);
                    startActivity(pantalla);

                }else{
                    Toast.makeText(MainActivity.this, "No eres mayor", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}