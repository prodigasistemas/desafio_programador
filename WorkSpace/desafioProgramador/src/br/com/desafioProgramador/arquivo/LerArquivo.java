package br.com.desafioProgramador.arquivo;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;

import javax.print.DocFlavor.URL;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.*;
import java.util.Arrays;

import javax.swing.*;
import br.com.desafioProgramador.bancoDados.CriarConexao;
import br.com.desafioProgramador.bancoDados.InserirBanco;
import br.com.desafioProgramador.bancoDados.LeituraBanco;

/**
 * Servlet implementation class LerArquivo
 */
@WebServlet("/readfile")
public class LerArquivo extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private BufferedReader br;
	private String linha, nomeArquivo, path;
	private Connection conn;
	private String [][]resultado;
       
    public LerArquivo() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			PrintWriter out = response.getWriter();
			conn = CriarConexao.dbConnector();
			String sql = "SELECT nomeEmpregado, telefoneEmpregado, emailEmpregado from empregados"; 
			Statement stmt = conn.createStatement();
			ResultSet rs =  stmt.executeQuery(sql);
            out.println("<table border='1'>");               
            out.println("<tr>");
            out.println("<th>Nome</th>");
            out.println("<th>Telefone</th>");
            out.println("<th>Email</th>");
            out.println("</tr>");
			while(rs.next()) {
                out.println("<tr>");
                out.println("<td>"+rs.getString("nomeEmpregado")+"</td>");
                out.println("<td>"+rs.getString("telefoneEmpregado")+"</td>");
                out.println("<td>"+rs.getString("emailEmpregado")+"</td>");
                out.println("</tr>");
			 }
            out.println("</table>");
			 stmt.close();	

			
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
	}
 
	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {

		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		  response.setContentType ("text/html;charset=utf-8");
		   nomeArquivo = request.getParameter("nomeArquivo");
		   PrintWriter out = response.getWriter();
		   BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Zinho\\Desktop\\Projeto\\desafio_programador\\WorkSpace\\desafioProgramador\\src\\" + nomeArquivo));
		   linha = br.readLine();
			try {			
			conn = CriarConexao.dbConnector();			
			InserirBanco l = new InserirBanco(conn); 

		   while ((linha = br.readLine()) != null) {
			   String []normalizacao = linha.split(";");
				l.adicionar(normalizacao[0],normalizacao[1],normalizacao[2]);
			}
		   	br.close();
			conn.close();
		    out.println("<script type=\"text/javascript\">");
		    out.println("location='cadastro.jsp';");
		    out.println("</script>");
			}catch (SQLException e) {			
			e.printStackTrace();
		}
	}
		
}
