package com.ejb.statefull;

import javax.ejb.Stateful;

@Stateful
public class Bank implements BankRemote {

	private int amount = 0;

	public boolean withdraw(int amount) {
		if (amount <= this.amount) {
			this.amount -= amount;
			return true;
		} else {
			return false;
		}
	}

	public void deposit(int amount) {
		this.amount += amount;
	}

	public int getBalance() {
		return amount;
	}
}