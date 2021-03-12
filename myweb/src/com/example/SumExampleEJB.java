package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.InitialContext;
import javax.naming.NamingException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import build.classes.com.ejb.stateless.AdderImplRemote;

@WebServlet("/sumExample")
public class SumExampleEJB extends HttpServlet {
	private static final String LOOKUP = "java:global/enterprizeApp/SimpleEjb3Project/AdderImpl!com.ejb.stateless.AdderImplRemote";
	private static final long serialVersionUID = 1L;

	public SumExampleEJB() {
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		try {
			InitialContext context = new InitialContext();
			AdderImplRemote lookup = (AdderImplRemote) context.lookup(LOOKUP);
			out.println(lookup.add(10, 20));
		} catch (NamingException e) {
			e.printStackTrace();
		}
	}
}
