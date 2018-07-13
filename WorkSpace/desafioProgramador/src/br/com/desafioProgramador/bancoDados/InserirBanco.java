package br.com.desafioProgramador.bancoDados;

import java.sql.*;
import javax.swing.*;

public class InserirBanco {
	private Connection conn; 
	public InserirBanco(Connection conn) {
		this.conn = conn;
	}
	
	public void adicionar(String nome, String telefone, String email) throws SQLException {
		String sql = "insert into empregados(nomeEmpregado,telefoneEmpregado,emailEmpregado)values(?,?,?)"; 
		  try {
				PreparedStatement stmt = conn.prepareStatement(sql);
				
				  stmt.setString(1, nome);
				  stmt.setString(2, telefone);
				  stmt.setString(3, email);				  
				  stmt.execute();
				  stmt.close();
				
			     } catch (SQLException e) {
				e.printStackTrace();
			   }	
	}
}
