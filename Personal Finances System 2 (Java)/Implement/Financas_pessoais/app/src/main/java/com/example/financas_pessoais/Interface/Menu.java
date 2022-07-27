package com.example.financas_pessoais.Interface;

import androidx.appcompat.app.AppCompatActivity;

import com.example.financas_pessoais.Connector.UsuariosDAO;
import com.example.financas_pessoais.MainActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymenu);
        Intent intent = getIntent();
        String login = intent.getStringExtra("login");
    }

    public void bChecarSaldo(View bChecarSaldo) {
        Intent intent = getIntent();
        String nome = intent.getStringExtra("login");
        float x = 0;
        try{
            x = UsuariosDAO.checarSaldo(nome);
            String msg = "Seu saldo atual é: "+ x;
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        }catch(Exception E) {return;}
    }

    public void bAddSaldo(View bAddSaldo){
        Intent intent = getIntent();
        String nome = intent.getStringExtra("login");

        EditText retiraSaldo = findViewById(R.id.tValor);
        float saldo = Float.parseFloat(String.valueOf(retiraSaldo.getText()));

        if(UsuariosDAO.adicionarSaldo(nome, saldo)) {
            String msg = "Seu saldo foi adicionado!";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        }else {
            String msg = "Erro!";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        }
    }

    public void bAddDespesa(View bAddDespesa){
        Intent intent = new Intent(this, activity_add_despesa.class);
        intent.putExtra("login");
        startActivity(intent);
    }


}