package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import build.classes.com.ejb.helloworld.Hello;

@WebServlet("/HelloWorld")
public class HelloWorldEJB extends HttpServlet {

	private static final String LOOKUP = "java:global/enterprizeApp/SimpleEjb3Project/HelloBean!com.ejb.helloworld.Hello";

	private static final long serialVersionUID = 5895629101493300333L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		try {

			InitialContext context = new InitialContext();
			Hello lookup = (Hello) context.lookup(LOOKUP);

			PrintWriter out = response.getWriter();
			out.print(lookup.sayHello());

		} catch (Exception e) {
			System.out.println(e);
		}
	}
}