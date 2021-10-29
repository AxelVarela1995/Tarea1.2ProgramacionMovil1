package com.example.tarea12;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ActivityResult extends AppCompatActivity {
    String nombre, apellido,edad, correo;
    TextView txtnombree, txtapellidoo, txtedadd, txtcorreoo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        Bundle bundleDates = getIntent().getExtras();
        nombre = bundleDates.getString("names");
        apellido = bundleDates.getString("lastNames");
        edad = bundleDates.getString("age");
        correo = bundleDates.getString("email");

        txtnombree = findViewById(R.id.txtnombree);
        txtapellidoo = findViewById(R.id.txtapellidoo);
        txtedadd = findViewById(R.id.txtedadd);
        txtcorreoo = findViewById(R.id.txtmaill);

        txtnombree.setText(nombre);
        txtapellidoo.setText(apellido);
        txtedadd .setText(edad);
        txtcorreoo.setText(correo);
    }
}