package com.example.victor.victorolivaresexamenrec;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class JugarActivity extends AppCompatActivity {
    //Declaramos e iniciamos
    private String numero;
    private int numeroAleatorioOnce = (int)(Math.random()*99999)+1;
    private int numeroAleatorioPrimitiva1 = (int)(Math.random()*99)+1;
    private int numeroAleatorioPrimitiva2 = (int)(Math.random()*99)+1;
    private int numeroAleatorioPrimitiva3 = (int)(Math.random()*99)+1;
    private int numeroAleatorioPrimitiva4 = (int)(Math.random()*99)+1;
    private int numeroAleatorioPrimitiva5 = (int)(Math.random()*99)+1;
    private int numeroAleatorioPrimitiva6 = (int)(Math.random()*99)+1;
    private String numeroAleatorioPrimitiva = numeroAleatorioPrimitiva1+"-"+numeroAleatorioPrimitiva2+"-"+numeroAleatorioPrimitiva3+"-"+numeroAleatorioPrimitiva4+"-"+numeroAleatorioPrimitiva5+"-"+numeroAleatorioPrimitiva6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_jugar);
        //Comparamos el numero introducido por el usuario desde el fragment con el generado y actualizamos los textViews de abajo.

    }
    public void setNumero(String numero){
        this.numero=numero;
    }
}
