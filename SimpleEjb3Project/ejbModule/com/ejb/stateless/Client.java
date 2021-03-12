package com.ejb.stateless;

import javax.naming.Context;
import javax.naming.InitialContext;

public class Client {

	private static final String LOOKUP = "st1";
//	private static final String LOOKUP = "java:global/SimpleEjb3Project/Adder!com.ejb.stateless.AdderRemote";

	public static void main(String[] args) throws Exception {
		Context context = new InitialContext();
		AdderImplRemote remote = (AdderImplRemote) context.lookup(LOOKUP);
		System.out.println(remote.add(32, 32));
	}
}