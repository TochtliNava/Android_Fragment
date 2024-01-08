package com.tochtlinava.fragment;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button azul, verde, rojo;
    FragmentAzul frAzul;
    FragmentVerde frVerde;
    FragmentRojo frRojo;

    FragmentAmarillo frAmarillo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        azul = (Button) findViewById(R.id.buttonAzul);
        verde = (Button) findViewById(R.id.buttonVerde);
        rojo = (Button) findViewById(R.id.buttonRojo);
        frAzul = new FragmentAzul();
        frVerde = new FragmentVerde();
        frRojo = new FragmentRojo();
        frAmarillo = new FragmentAmarillo();
    }

    /**
     *  Método para el listener de los 3 botones
     */

    public void func(View vista){
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        int opc = vista.getId();
        if(opc == R.id.buttonAzul){
            transaction.replace(R.id.contenedorFragment, frAzul);
        }
        if(opc == R.id.buttonVerde){
            transaction.replace(R.id.contenedorFragment, frVerde);
        }
        if(opc == R.id.buttonRojo){
            transaction.replace(R.id.contenedorFragment, frRojo);
        }
        if(opc == R.id.buttonAmarillo){
            transaction.replace(R.id.contenedorFragment, frAmarillo);
        }
        transaction.commit();
    }
}