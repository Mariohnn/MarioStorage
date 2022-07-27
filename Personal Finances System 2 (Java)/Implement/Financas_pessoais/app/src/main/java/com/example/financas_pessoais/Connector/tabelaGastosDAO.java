package com.example.financas_pessoais.Connector;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import java.sql.*;
import com.example.financas_pessoais.func.Despesas;

public class tabelaGastosDAO extends Database{

    private Context context;
    private SQLiteDatabase database;

    public tabelaGastosDAO(Context context){
        this.context = context;
        this.database = (new Database(context)).getWritableDatabase();
    }


    public static String mostrarDespesas(String nome) {
        String result;
        try {
            result = "Gastos\n\n Nome - Tipo - Data - Valor\n\n";
            String sql = "SELECT * FROM tabelaGastos WHERE Username="+ nome;
            Cursor cursor = database.rawQuery(sql, null);
            while(cursor.moveToNext()) {
                result += (cursor.getString(2) + " - " + cursor.getString(3) + " - " + cursor.getString(4) + " - " + cursor.getString(5) + "\n" );
            }
        }catch (SQLException e) {
            result = "Falha no programa!";
        }
        return result;
    }

    public static boolean adicionarDespesa(String nome, String tipo, String data, float valor) {

        try {
            float sld=0;


            // Reduzindo o saldo do cliente
            String saldo ="SELECT saldo FROM Usuarios WHERE Username="+ nome;
            Cursor cursor = database.rawQuery(saldo, null);

            while(cursor.moveToNext()) {
                sld = cursor.getFloat(1);
            }
            sld = sld - valor;

            String perdeGrana = "UPDATE Usuarios SET saldo='"+ sld +"' WHERE Username='"+ nome +"';";
            cursor = database.rawQuery(perdeGrana, null);

            // criando a despesa
            String SQL = "INSERT INTO tabelaGastos VALUES (NULL, '" + nome + "', '" + tipo + "', '" + data + "', " + valor + ");";

            if(database.execSQL(SQL)==1) {return true;}
            return false;

        } catch (SQLException e) {
            return false;
        }
    }
}

