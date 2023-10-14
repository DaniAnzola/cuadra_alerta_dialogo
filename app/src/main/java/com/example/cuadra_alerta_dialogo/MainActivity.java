package com.example.cuadra_alerta_dialogo;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnGo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnGo=findViewById(R.id.btnGo);
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder alertDialogoBuilder= new AlertDialog.Builder(MainActivity.this);
                alertDialogoBuilder.setTitle("Cuidado");
                alertDialogoBuilder.setMessage("Estastas seguro de quierre ir al siguiente");
                alertDialogoBuilder.setCancelable(false);


                alertDialogoBuilder.setPositiveButton("adelante", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Intent in=new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(in);
                    }
                });



                alertDialogoBuilder.setNegativeButton("no", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {

                    }
                });


                AlertDialog alertDialog = alertDialogoBuilder.create();
                alertDialog.show();
            }
        });


    }
}