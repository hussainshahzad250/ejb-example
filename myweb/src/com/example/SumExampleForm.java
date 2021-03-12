package com.example;

import java.io.IOException;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import build.classes.com.ejb.helloworld.Hello;

@WebServlet("/sumExampleForm")
public class SumExampleForm extends HttpServlet {
	private static final String LOOKUP = "java:global/enterprizeApp/SimpleEjb3Project/HelloBean!com.ejb.helloworld.Hello";
	private static final long serialVersionUID = 1L;

	public SumExampleForm() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {
			InitialContext context = new InitialContext();
			Hello lookup = (Hello) context.lookup(LOOKUP);
			request.getSession().setAttribute("remote", lookup);
			request.getRequestDispatcher("operation.jsp").forward(request, response);
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
