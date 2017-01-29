package org.javaweb.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PrimeiroServlet
 */
@WebServlet("/PrimeiroServlet")
public class PrimeiroServlet extends HttpServlet {
	
	private static final long serialVersionUID = 440817816902756113L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();
		Date dataAtual = new Date();
		
		out.println("<html><body>");
		out.println("<h1>Alô Java Web!</h1>");
		out.println("Hoje é: " + dataAtual);
		out.println("</body></html>");
		
	}

}
