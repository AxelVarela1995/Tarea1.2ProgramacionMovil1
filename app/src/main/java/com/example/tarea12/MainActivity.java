package com.example.tarea12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    EditText txtnombre, txtapellido, txtedad, txtcorreo;
    Button btnenviar;
    String nombre, apellido, edad, correo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtnombre = findViewById(R.id.txtNombre);
        txtapellido = findViewById(R.id.txtApellido);
        txtedad = findViewById(R.id.txtEdad);
        txtcorreo = findViewById(R.id.txtCorreo);
        btnenviar = findViewById(R.id.btnEnviar);

        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nombre = txtnombre.getText().toString();
                apellido = txtapellido.getText().toString();
                edad = txtedad.getText().toString();
                correo = txtcorreo.getText().toString();

                Intent intentSend = new Intent(getApplicationContext(), ActivityResult.class);

                Bundle bundleDates = new Bundle();
                bundleDates.putString("names", nombre);
                bundleDates.putString("lastNames", apellido);
                bundleDates.putString("age", edad);
                bundleDates.putString("email", correo);

                intentSend.putExtras(bundleDates);
                startActivity(intentSend);
            }
        });
    }
}