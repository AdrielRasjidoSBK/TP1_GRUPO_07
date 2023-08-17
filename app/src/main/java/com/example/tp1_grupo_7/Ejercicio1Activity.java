package com.example.tp1_grupo_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Ejercicio1Activity extends AppCompatActivity {

    private EditText et1;
    private EditText et2;

    private TextView tvResult;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ejercicio1);

        et1 = (EditText) findViewById(R.id.txt_Ej1_PrimerNumero);
        et2 = (EditText) findViewById(R.id.txt_Ej1_SegundoNumero);
        tvResult = (TextView) findViewById(R.id.tv_Resultado);

    }

    public void pantallaPrincipal(View view){
        Intent pantallaPrincipal = new Intent(this, MainActivity.class);
        startActivity(pantallaPrincipal);
    }

    //Ejercicio 1 - Sumar


    public void Sumar(View view) {
        String PrimerNumero_String = et1.getText().toString();
        String SegundoNumero_String = et2.getText().toString();

        int PrimerNumero_int = Integer.parseInt(PrimerNumero_String);
        int SegundoNumero_int = Integer.parseInt(SegundoNumero_String);

        int result = PrimerNumero_int + SegundoNumero_int;

        tvResult.setText(String.valueOf(result)); // Corrección aquí
    }


}