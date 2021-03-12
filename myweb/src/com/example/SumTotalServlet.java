package com.example;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SumTotal")
public class SumTotalServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public SumTotalServlet() {
	}

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		Integer number1 = Integer.parseInt(request.getParameter("number1"));
		Integer number2 = Integer.parseInt(request.getParameter("number2"));
		int sum = (number1 + number2);
		out.println("Sum of " + number1 + " and  " + number2 + " = " + sum);
	}

}
