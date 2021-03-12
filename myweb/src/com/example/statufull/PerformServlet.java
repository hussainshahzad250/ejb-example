package com.example.statufull;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import build.classes.com.ejb.statefull.BankRemote;

@WebServlet("/PerformServlet")
public class PerformServlet extends HttpServlet {

	private static final long serialVersionUID = 6726626837767057327L;

	public PerformServlet() {
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		BankRemote remote = (BankRemote) session.getAttribute("remote");
		PrintWriter out = response.getWriter();
		String operation = request.getParameter("operation");
		String amount = request.getParameter("amount");

		if (operation != null) {

			if (operation.equals("deposit")) {
				remote.deposit(Integer.parseInt(amount));
				out.print("Amount successfully deposited!");
			} else if (operation.equals("withdraw")) {
				boolean status = remote.withdraw(Integer.parseInt(amount));
				if (status) {
					out.print("Amount successfully withdrawn!");
				} else {
					out.println("Insufficient amount");
				}
			} else {
				out.println("Current Amount: " + remote.getBalance());
			}
		}
	}

}
