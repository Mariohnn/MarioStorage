package Connector; 

import java.sql.*;

import trab.Despesas;

public class tabelaGastosDAO extends BancoDeDados{
	
	public static String mostrarDespesas(String nome) {
        String result;
        try {
            result = "Gastos\n\n Nome - Tipo - Data - Valor\n\n";
            Statement st = getConexao().createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM tabelaGastos WHERE Username='"+ nome +"';");
            while(rs.next()) {
                result += (rs.getString(2) + " - " + rs.getString(3) + " - " + rs.getString(4) + " - " + rs.getString(5) + "\n" );
            }
        }catch (SQLException e) {
            result = "Falha no programa!";
        }
        return result;
    } 
	
	public static boolean adicionarDespesa(String nome, String tipo, String data, float valor) {
		
		try {
			float sld=0;
			Statement stmt = getConexao().createStatement();
			ResultSet rs = null;
			
			// Reduzindo o saldo do cliente
			String saldo ="SELECT saldo FROM Usuarios WHERE Username='"+ nome +"'";
			rs = stmt.executeQuery(saldo);
			while(rs.next()) {
				sld = rs.getFloat(1);
			}
			sld = sld - valor;
			
			String perdeGrana = "UPDATE Usuarios SET saldo='"+ sld +"' WHERE Username='"+ nome +"';";
			stmt.executeUpdate(perdeGrana);
			
			// criando a despesa
			String SQL = "INSERT INTO tabelaGastos VALUES (NULL, '" + nome + "', '" + tipo + "', '" + data + "', " + valor + ");";

			if(stmt.executeUpdate(SQL)==1) {return true;}
			return false;
			
		} catch (SQLException e) {
			return false;
		}
	}
}
