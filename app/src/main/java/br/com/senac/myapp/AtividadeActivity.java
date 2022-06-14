package br.com.senac.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class AtividadeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade);

        //executar um processo em background

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                //abrir janela de login
                startActivity(new Intent(getApplicationContext(),AtividadeActivity.class));
            }
        }, 3000);
    }
}
