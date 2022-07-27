package com.example.financas_pessoais.Connector;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import java.sql.*;

public class Database extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 4;
    public static final String DATABASE_NAME = "DespesasDB";
    private static final String SQL_CREATE_PASS = "CREATE TABLE Usuarios (" +
            "Username TEXT, senha TEXT, saldo FLOAT)";
//    private static final String SQL_CREATE_PASS = "CREATE TABLE tabelaGastos (" +
//            "id INTEGER PRIMARY KEY AUTOINCREMENT, Username TEXT, tipo TEXT," +
//            "data TEXT, saldo FLOAT)";
    private static final String SQL_DELETE_PASS = "DROP TABLE IF EXISTS passwords";

    public Database(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    public void onCreate(SQLiteDatabase db) {
        db.execSQL(SQL_CREATE_PASS);
    }

    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        db.execSQL(SQL_DELETE_PASS);
        onCreate(db);
    }
}




