package org.wanda.chap3;

public class Account {

	private String name;
	private double balance;

	
	
	public Account(String name ,double balance) {
		super();
		this.name = name;
		if(balance > 0) {
		this.balance = balance;
		}
	}
	
	public Account() {
		
	}

	
	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) throws Exception {
		if(balance > 0) {
		this.balance = balance;
		}
		else {
			throw new Exception("saldo tidak boleh lebih dari 0");
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	
}
