package Connector;

import java.sql.*;


import trab.Users;

public class UsuariosDAO extends BancoDeDados{
	
	
	// Criar Registros
	public static boolean register(String login, String senha) throws SQLException {
		
		Statement stmt = getConexao().createStatement();
		ResultSet rs = null;
		int x;
		
		String teste = "SELECT * FROM Usuarios WHERE Username='" + login + "'";
		rs = stmt.executeQuery(teste);
		if(rs.next()) {return false;}
		
		
		String SQL = "INSERT INTO Usuarios VALUES ('" + login + "', '" + senha + "', '0');";
		x = stmt.executeUpdate(SQL);
		if(x==1) {return true;}
		return false;
	}
	
	
	//Autenticacao
	public static boolean checkLogin(String login, String senha) throws SQLException{
		
		Statement stmt = getConexao().createStatement();
		ResultSet rs = null;
		
		String SQL = "SELECT * FROM Usuarios WHERE Username='" + login + "' && senha='" + senha + "';";
		rs = stmt.executeQuery(SQL);
			
		if(rs.next()) {
			return true;
		}
		return false;
	}
	
	
	public static boolean adicionarSaldo(String user, float valor) {
		try {
			Statement stmt = getConexao().createStatement();
			ResultSet rs = null;
			float sld = 0;
			int x;
			
			String SQL = "SELECT saldo FROM Usuarios WHERE Username='" + user + "';";
			rs = stmt.executeQuery(SQL);
			while(rs.next()) {
				sld = rs.getFloat(1);
			}
			sld = sld + valor;
			
			String SQL2 = "UPDATE Usuarios SET saldo='" + sld + "' WHERE Username='" + user + "';";
			if(stmt.executeUpdate(SQL2)==1) {return true;}
			return false;
			
		} catch (SQLException e) {
			return false;
		}
	}
	
	
	public static float checarSaldo(String user) throws SQLException{
			Statement st = getConexao().createStatement();
			ResultSet rs = null;
			float x = 0;
			
			rs = st.executeQuery("SELECT saldo FROM Usuarios WHERE Username='" + user + "';");
			while(rs.next()) {
				x = rs.getFloat(1);
			}
			
			return x;
			
		
	}
	
	
}


