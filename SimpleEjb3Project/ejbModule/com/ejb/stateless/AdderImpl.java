package com.ejb.stateless;

import javax.ejb.Stateless;

@Stateless(mappedName="st1")
public class AdderImpl implements AdderImplRemote {
	public int add(int a, int b) {
		return a + b;
	}
}