package com.example.tp1_grupo_7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //<include layout="@layout/toolbar"/> en caso de que no ande lo otro, lo agregameos al activity_main.xml
    }

    public void  Ejercicio1(View view){
        Intent Ejercicio1 = new Intent(this, Ejercicio1Activity.class);
        startActivity(Ejercicio1);
    }

    public void Ejercicio2(View view){
        Intent Ejercicio2 = new Intent(this, Ejercicio2Activity.class);
        startActivity(Ejercicio2);
    }
}