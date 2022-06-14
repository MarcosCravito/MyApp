package br.com.senac.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class LoginActivity extends AppCompatActivity {
    //declarando variáveis

    EditText edtEmail, edtSenha;
    Button btnLogin;
    TextView txtRecuperarSenha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        //puxando as variaveis do xml para o java
        edtEmail = findViewById(R.id.edtEmail);
        edtSenha = findViewById(R.id.edtPassword);
        btnLogin = findViewById(R.id.btnLogin);
        txtRecuperarSenha = findViewById(R.id.txtRecuperarSenha);

        // criando o clique do botão
        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //pegar o valor do email e senha atráves do click do usuário

                String email, senha;

                email = edtEmail.getText().toString();
                senha = edtSenha.getText().toString();

                //Criando a estrurura de decisão para acesso ao sistema
                if (email.equals("senac@sp.senac.br") && senha.equals("senac")) {
                    //entrar aqui...

                    Intent intent = new Intent(getApplicationContext(),MenuPrincipalAcitivity.class);
                    //passar parâmetro para outras janelas
                    startActivity(intent);

                }
            }
        });

        txtRecuperarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
    }


    public void abrirFacebook(View view) {
        Toast.makeText(getApplicationContext(), "Cliquei no botão do facebook ", Toast.LENGTH_SHORT).show();
    }

}