package com.ejb.statefull;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {

	public static void main(String[] args) throws NamingException {
		Context context = new InitialContext();
		BankRemote remote = (BankRemote) context.lookup("stateful123");
		System.out.println(remote.getBalance());
	}
}
