package br.com.desafioProgramador.bancoDados;
import java.sql.*;
import javax.swing.*;

public class LeituraBanco {
	private Connection conn; 
	public LeituraBanco(Connection conn) {
		this.conn = conn;
	}
	
	public String [][] leitura() throws SQLException {
		String sql = "SELECT nomeEmpregado, telefoneEmpregado, emailEmpregado from empregados"; 
		  try {
			  int i = 0,j = 0;
				Statement stmt = conn.createStatement();							  
				  ResultSet rs =  stmt.executeQuery(sql);
				  //while(rs.next()) {
					//  System.out.println(rs.getString("nomeEmpregado") + "\t" + rs.getString("telefoneEmpregado") + "\t" + rs.getString("emailEmpregado"));
				  //}
				  if(rs.last()) {
					  j = rs.getRow();
					  rs.beforeFirst();
				  }
				  String [][] resultado = new String[j][3];
				  while(rs.next()) {
				resultado[i][0] = rs.getString("nomeEmpregado");
				resultado[i][1] = rs.getString("telefoneEmpregado");
				resultado[i][3] = rs.getString("emailEmpregado");
				i = i + 1;
				  }			  
				  return resultado;
			     } catch (SQLException e) {
				e.printStackTrace();
				return null;
			   }finally{
				conn.close();   }	
	}

}
