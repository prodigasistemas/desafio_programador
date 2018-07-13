package br.com.desafioProgramador.bancoDados;

import java.sql.*;
import javax.swing.*;

import java.sql.Connection;


public class CriarConexao {
	Connection conn = null;
	public static Connection dbConnector() {
		try {
			Class.forName("org.sqlite.JDBC");
			Connection conn = DriverManager.getConnection("jdbc:sqlite:C:\\Users\\Zinho\\Desktop\\Projeto\\desafio_programador\\WorkSpace\\desafioProgramador\\src\\empregados.db");
			return conn;
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null, e);
			return null;
		}
	}
	
}