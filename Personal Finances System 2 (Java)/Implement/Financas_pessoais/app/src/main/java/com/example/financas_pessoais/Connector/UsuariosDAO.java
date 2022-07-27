package com.example.financas_pessoais.Connector;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.sql.*;
import com.example.financas_pessoais.func.Users;

public class UsuariosDAO extends Database{
    private Context context;
    private SQLiteDatabase database;

    public UsuariosDAO(Context context){
        super();
        this.context = context;
        this.database = (new Database(context)).getWritableDatabase();
    }

    // Criar Registros
    public static boolean register(String login, String senha) throws SQLException {

        int x;

        String teste = "SELECT * FROM Usuarios WHERE Username=" + login;
        Cursor cursor = database.rawQuery(teste, null);

        if(cursor.moveToNext()) {return false;}


        String SQL = "INSERT INTO Usuarios VALUES (" + login + ", " + senha + ", '0')";
        x = database.execSQL(SQL);
        if(x==1) {return true;}
        return false;
    }


    //Autenticacao
    public static boolean checkLogin(String login, String senha) throws SQLException{

        String SQL = "SELECT * FROM Usuarios WHERE Username=" + login + " && senha=" + senha;
        Cursor cursor = database.execSQL(SQL);

        if(cursor.moveToNext()) {
            return true;
        }
        return false;
    }


    public static boolean adicionarSaldo(String user, float valor) {
        try {
            float sld = 0;
            int x;

            String SQL = "SELECT saldo FROM Usuarios WHERE Username=" + user;
            Cursor cursor = database.execSQL(SQL);
            while(cursor.moveToNext()) {
                sld = cursor.getFloat(1);
            }
            sld = sld + valor;

            String SQL2 = "UPDATE Usuarios SET saldo='" + sld + "' WHERE Username='" + user;
            if(database.execSQL(SQL2)==1) {return true;}
            return false;

        } catch (SQLException e) {
            return false;
        }
    }


    public static float checarSaldo(String user) throws SQLException{

        float x = 0;

        Cursor cursor = database.execSQL("SELECT saldo FROM Usuarios WHERE Username=" + user);
        while(cursor.moveToNext()) {
            x = cursor.getFloat(1);
        }

        return x;


    }


}



