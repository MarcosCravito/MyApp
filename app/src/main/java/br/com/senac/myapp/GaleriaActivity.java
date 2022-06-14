package br.com.senac.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class GaleriaActivity extends AppCompatActivity {
    //Declarar a variável global com o mesmo tipo de componente xml

    FloatingActionButton fabGaleria;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galeria);

        //Variável do java recebendo variável do xml
        fabGaleria = findViewById(R.id.fabGaleria);

        //Criando evento de clique no fab

        fabGaleria.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),"Cliquei no botão FAB",Toast.LENGTH_SHORT).show();
            }
        });
    }
}