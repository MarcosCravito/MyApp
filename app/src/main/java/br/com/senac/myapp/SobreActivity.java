package br.com.senac.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class SobreActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sobre);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_principal, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        //Realizar o clique nos itens de menu

        switch (item.getItemId()) {
            case R.id.menucadastrar:
                Toast.makeText(getApplicationContext(), "Cliquei no Cadastrar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menualterar:
                Toast.makeText(getApplicationContext(), "Cliquei no alterar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menuexcluir:
                Toast.makeText(getApplicationContext(), "Cliquei no excluir", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menupesquisar:
                Toast.makeText(getApplicationContext(), "Cliquei no pesquisar", Toast.LENGTH_SHORT).show();
                break;
            case R.id.menusair:
                Toast.makeText(getApplicationContext(), "Cliquei no sair", Toast.LENGTH_SHORT).show();
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}