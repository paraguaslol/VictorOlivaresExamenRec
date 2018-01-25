package com.example.victor.victorolivaresexamenrec;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements EnviarDades {
    //1-Declaracion de variables
    Button btComencem;
    String opcion;
    String jugar = "JUGAR";
    String comencem = "COMENCEM";
    private static final int SUB_ACTIVITY_INFO = 2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //2-Inicializacion
        btComencem = (Button) findViewById(R.id.btComencem);
        //3-Listener del boton comenzar y jugar.
        //Cuando el texto del boton sea comencen, nos abrirá la activity de Triar joc para elegir entre Once y Primitiva, y cambiara el texto a jugar
        //Una vez seleccionada la opción, volveremos a la activity principal y le podremos dar a jugar con la opcion guardada,
        //La cual nos cargará un fragment u otro al abrir la activity de Jugar
        btComencem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(btComencem.getText().toString()==comencem){
                Intent i = new Intent(getApplicationContext(),TriarJocActivity.class);
                startActivityForResult(i,SUB_ACTIVITY_INFO);
                btComencem.setText(jugar);
                }else if(btComencem.getText().toString()==jugar){
                    Intent i = new Intent(getApplicationContext(),JugarActivity.class);
                    startActivityForResult(i, SUB_ACTIVITY_INFO);
                    btComencem.setText(comencem);
                }
            }
        });

    }

    @Override //metodo de la interfaz para desde otra activity enviar la opcion seleccionada, y avisa con un toast
    public void enviarDadesJoc(String opcion) {
        this.opcion=opcion;
        Toast.makeText(getApplicationContext(),"Joc triat: "+opcion, Toast.LENGTH_SHORT).show();
    }
}
