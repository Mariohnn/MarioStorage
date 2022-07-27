package Connector;
import java.sql.*;


public class BancoDeDados {
    private static String url = "jdbc:mysql://localhost:3306/DespesasDB";
    String usuario = "mariohn";
    String senha = "password";
    public static Connection conexao = null;
    
    public BancoDeDados() {
        if(conexao == null) {
            conecta();
        }
    }
    
    public boolean conecta() {
        try {
            BancoDeDados.conexao = DriverManager.getConnection(url, usuario, senha);
            return true;
        }
        catch(SQLException e) {
            return false;
        }
    }
    
    public boolean desconecta() {
        try {
            conexao.close();
            return true;
        } catch (SQLException e) {
            return false;
        }
    }
    
    public static Connection getConexao() {
        return BancoDeDados.conexao;
    }
    
}