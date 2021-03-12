package com.example.statufull;

import java.io.IOException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import build.classes.com.ejb.statefull.BankRemote;

@WebServlet("/StatefullServlet")
public class StatefullServlet extends HttpServlet {

	private static final long serialVersionUID = -3128223650952795506L;
	private static final String LOOKUP = "java:global/enterprizeApp/SimpleEjb3Project/Bank!com.ejb.statefull.BankRemote";

	public StatefullServlet() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			InitialContext context = new InitialContext();
			BankRemote lookup = (BankRemote) context.lookup(LOOKUP);
			request.getSession().setAttribute("remote", lookup);
			request.getRequestDispatcher("account.jsp").forward(request, response);
		} catch (NamingException e) {
			e.printStackTrace();
		}

	}

}
