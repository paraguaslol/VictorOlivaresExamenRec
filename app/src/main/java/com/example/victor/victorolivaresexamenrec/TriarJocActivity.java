package com.example.victor.victorolivaresexamenrec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.Toast;

public class TriarJocActivity extends AppCompatActivity {
    //1-Declaracion de variables
    RadioButton rbOnce;
    RadioButton rbPrimitiva;
    Button btCancelarJoc;
    Button btSeleccionarJoc;
    MainActivity a;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_triar_joc);
        //2-Inicializacion
        final RadioButton rbOnce = findViewById(R.id.rbOnce);
        final RadioButton rbPrimitiva = findViewById(R.id.rbPrimitiva);
        Button btCancelarJoc = findViewById(R.id.btCancelarJoc);
        Button btSeleccionarJoc = findViewById(R.id.btSeleccionarJoc);
        //3-Listener para cancelar y volver al activity principal
        btCancelarJoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                setResult(RESULT_OK);
                finish();
            }
        });
        //4-Listener que comprueba que se haya marcado una opcion del radiogroup y luego la pase al main
        btSeleccionarJoc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!rbOnce.isChecked() && !rbPrimitiva.isChecked()) {
                    Toast.makeText(getApplicationContext(), "Selecciona una opcion.", Toast.LENGTH_SHORT).show();

                } else {
                    String opcion = "";
                    if (rbOnce.isChecked()) {
                        opcion = "Once";
                    } else {
                        if (rbPrimitiva.isChecked()) {
                            opcion = "Primitiva";
                        }
                    }
                    a.enviarDadesJoc(opcion);
                    setResult(RESULT_OK);
                    finish();
                }
            }

        });

    }
}
