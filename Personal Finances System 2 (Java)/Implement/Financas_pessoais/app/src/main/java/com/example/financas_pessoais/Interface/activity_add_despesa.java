package com.example.financas_pessoais.Interface;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.example.financas_pessoais.Connector.tabelaGastosDAO;

public class activity_add_despesa extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_despesa);
        Intent intent = getIntent();
        String login = intent.getStringExtra("login");
    }

    public void bAddsaldo(View bAddsaldo){

        Intent intent = getIntent();
        String nome = intent.getStringExtra("login");

        EditText retiraTipo = findViewById(R.id.tTipoGasto);
        String tipo = retiraTipo.getText().toString();

        EditText retiraData = findViewById(R.id.tData);
        String data = retiraData.getText().toString();

        EditText retiraSaldo = findViewById(R.id.tSaldo);
        float saldo = Float.parseFloat(String.valueOf(retiraSaldo.getText()));

        if(tabelaGastosDAO.adicionarDespesa(nome,tipo,data,saldo)) {
            String msg = "Despesa registrada com sucesso!";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        }else {
            String msg = "Não foi possível registrar o gasto.";
            Toast.makeText(this, msg, Toast.LENGTH_SHORT).show();
        }

    }





}