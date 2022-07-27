package com.example.financas_pessoais;

import com.example.financas_pessoais.Connector.UsuariosDAO;
import com.example.financas_pessoais.Interface.Menu;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
            Log.i("PlainText", "Activity principal criada");
    }

    public void bEntrar(View bEntrar){
        EditText retiraLogin = findViewById(R.id.tLogin);
        String login = retiraLogin.getText().toString();

        EditText retiraSenha = findViewById(R.id.tSenha);
        String senha = retiraSenha.getText().toString();

        try {
            if(UsuariosDAO.checkLogin(login, senha)){
                Intent intent = new Intent(this, Menu.class);

                intent.putExtra("login", retiraLogin.getText().toString());

                startActivity(intent);
            }else{
                String msg = "Credenciais inválidas, tente Novamente.";
                Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
            }
        }catch(Exception E) {return;}
    }

    public void bRegistrar(View bRegistrar){
        EditText retiraLogin = findViewById(R.id.tLogin);
        String login = retiraLogin.getText().toString();

        EditText retiraSenha = findViewById(R.id.tSenha);
        String senha = retiraSenha.getText().toString();

        try {
            if(UsuariosDAO.register(login, senha)){
                String msg = "Usuário registrado com sucesso.";
                Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
            }else{
                String msg = "Usuário já existe!";
                Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
            }
        }catch(Exception E) {return;}
    }

}


