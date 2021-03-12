package com.ejb.helloworld;

import javax.naming.InitialContext;
import javax.naming.NamingException;

public class Client {

	private static final String LOOKUP = "java:global/SimpleEjb3Project/HelloBean!com.ejb.helloworld.Hello";

	public static void main(String[] args) throws NamingException {
		InitialContext context = new InitialContext();
		Hello lookup = (Hello) context.lookup(LOOKUP);
		System.out.println(lookup.sayHello());
	}

}