package br.com.senac.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class CafeBadilicoActivity extends AppCompatActivity implements View.OnClickListener {
    //declarando a variável global
    Button btnReservar, idbtnPriHora, idbtnSegHora, idbtnTerHora, idbtnQuaHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cafe_badilico_layout);
        //Apresentar a variável java para o xml
        btnReservar = findViewById(R.id.idReservar);
        idbtnPriHora = findViewById(R.id.idbtnPriHora);
        idbtnSegHora = findViewById((R.id.idbtnSegHora);
        idbtnTerHora = findViewById(R.id.idbtnTerHora);
        idbtnQuaHora = findViewById(R.id.idbtnQuaHora);

        idbtnPriHora.setOnClickListener(this);
        idbtnSegHora.setOnClickListener(this);
        idbtnTerHora.setOnClickListener(this);
        idbtnQuaHora.setOnClickListener(this);

        //Criar ação de click para o botão reservar

        btnReservar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "cliquei em reservar", Toast.LENGTH_SHORT).show();
            }
        });


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.idbtnPriHora:
                Toast.makeText(getApplicationContext(), "cliquei na primeira hora", Toast.LENGTH_SHORT).show();
                break;
            case R.id.idbtnSegHora:
                Toast.makeText(getApplicationContext(), "cliquei na segunda hora", Toast.LENGTH_SHORT).show();
                break;
            case R.id.idbtnTerHora:
                Toast.makeText(getApplicationContext(), "cliquei na terceira hora", Toast.LENGTH_SHORT).show();
                break;
            case R.id.idbtnQuaHora:
                Toast.makeText(getApplicationContext(), "cliquei na quarta hora", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}