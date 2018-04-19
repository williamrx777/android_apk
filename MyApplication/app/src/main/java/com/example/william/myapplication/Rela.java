package com.example.william.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Rela extends AppCompatActivity {
    private TextView txtNome;
    private TextView txtAltura;
    private TextView txtIdade;
    private Button btnVoltar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rela);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        txtNome =(TextView)findViewById(R.id.txtNome);
        txtIdade=(TextView)findViewById(R.id.txtIdade);
        txtAltura=(TextView)findViewById(R.id.txtAltura);
        btnVoltar=(Button)findViewById(R.id.btnVoltar);
        btnVoltar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                trataVoltar(v);
            }
        });

        Intent it =getIntent();
        txtNome.setText(it.getStringExtra("nome"));
        txtIdade.setText(it.getStringExtra("idade"));
        txtAltura.setText(it.getStringExtra("altura"));
    }

    public void trataVoltar(View view){

        onBackPressed();

    }


}
