package com.example.william.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText edtNome;
    private EditText edtIdade;
    private EditText edtAltura;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edtNome = (EditText)findViewById(R.id.edtNome);
        edtIdade = (EditText)findViewById(R.id.edtIdade);
        edtAltura = (EditText)findViewById(R.id.edtAltura);



    }

    public void trataEnvia(View view){
        Intent it = new Intent(this,Rela.class);
        it.putExtra("nome",edtNome.getText().toString());
        it.putExtra("idade",edtIdade.getText().toString());
        it.putExtra("altura",edtAltura.getText().toString());
        startActivity(it);

    }
}
