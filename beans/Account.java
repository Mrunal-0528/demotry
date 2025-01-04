package com.Account;

public class Account {
	private int id;
	private int pin;
	private double balance;
	private String acname;
	public Account() {
		super();
	}
	public Account(int id, int pin, double balance, String acname) {
		super();
		this.id = id;
		this.pin = pin;
		this.balance = balance;
		this.acname = acname;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPin() {
		return pin;
	}
	public void setPin(int pin) {
		this.pin = pin;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getAcname() {
		return acname;
	}
	public void setAcname(String acname) {
		this.acname = acname;
	}
	@Override
	public String toString() {
		return "Account [id=" + id + ", pin=" + pin + ", balance=" + balance + ", acname=" + acname + "]";
	}
	
	public boolean withdraw(double amt) {
		if(amt>=10000) {
			this.balance=this.balance-amt;
			return true;
		}
		else {
			return false;
		}
	}
	
	public void deposit(double amt) {
		this.balance=this.balance+amt;
	}
	
}
