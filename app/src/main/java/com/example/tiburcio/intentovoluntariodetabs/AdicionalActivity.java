package com.example.tiburcio.intentovoluntariodetabs;

import android.app.Application;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TextInputEditText;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.ArrayList;

public class AdicionalActivity extends AppCompatActivity {
    Principal miAppChuspi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adicional);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        String texto = getIntent().getStringExtra("Texto");

        TextView textViewTexto = (TextView) findViewById(R.id.textViewTexto);
        textViewTexto.setText(texto);

        miAppChuspi = (Principal)getApplication();
        miAppChuspi.setPepe("pasó por España. Niña ven aquí...");

        // Lo nuevo para Agoney
        final TextInputEditText textInputEditTextNombre =
                (TextInputEditText) findViewById(R.id.textInputEditTextNombre);
        final TextInputEditText textInputEditTextEdad =
                (TextInputEditText) findViewById(R.id.textInputEditTextEdad);
        Button buttonAgnadir = (Button) findViewById(R.id.buttonAgnadir);
        buttonAgnadir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ArrayList<Alumno> alumnos = miAppChuspi.getAlumnos();

                if(textInputEditTextNombre.getText().toString().equals("")){
                    textInputEditTextNombre.setError("Campo Requerido");
                    textInputEditTextNombre.requestFocus();
                    return;
                }

                if(textInputEditTextEdad.getText().toString().equals("")){
                    textInputEditTextEdad.setError("Campo Requerido");
                    textInputEditTextEdad.requestFocus();
                    return;
                }
                alumnos.add(new Alumno(
                        textInputEditTextNombre.getText().toString(),
                        Integer.parseInt(textInputEditTextEdad.getText().toString())
                ));

                miAppChuspi.setAlumnos(alumnos);

                textInputEditTextEdad.setText("");
                textInputEditTextNombre.setText("");
                textInputEditTextNombre.requestFocus();
            }
        });


    }

}
