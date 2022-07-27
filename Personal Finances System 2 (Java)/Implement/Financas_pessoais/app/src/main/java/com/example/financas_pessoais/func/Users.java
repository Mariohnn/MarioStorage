package com.example.financas_pessoais.func;

import android.content.Context;

import com.example.financas_pessoais.Connector.UsuariosDAO;

public class Users extends UsuariosDAO {
    public String user;
    public String Password;
    public float saldo;

    public Users(Context context) {
        super(context);
    }

    public String getUser() {
        return user;
    }
    public void setUser(String user) {
        this.user = user;
    }
    public String getPassword() {
        return Password;
    }
    public void setPassword(String password) {
        Password = password;
    }
    public float getSaldo() {
        return saldo;
    }
    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
}
