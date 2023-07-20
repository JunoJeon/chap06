package com.example.ex19;

public class Account {
	static final int MIN_BALANCE = 0;
	static final int MAX_BALANCE = 1_000_000;
	int balance;
	
	int getBalance() {
		return balance;
	}
	void setBalance(int balance) {
		if(balance >= MIN_BALANCE && balance <= MAX_BALANCE)
		this.balance = balance;
	}
}
