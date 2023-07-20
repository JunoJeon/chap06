package com.example.ex19;

public class AccountExample {

	public static void main(String[] args) {
	Account account = new Account();
	
	account.setBalance(10000);
	System.out.println(account.getBalance());
	
	account.setBalance(-1000);
	System.out.println(account.getBalance());
	
	account.setBalance(2000000);
	System.out.println(account.getBalance());
	
	account.setBalance(100000);
	System.out.println(account.getBalance());
	}
}
