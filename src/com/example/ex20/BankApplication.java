package com.example.ex20;

import java.util.Scanner;

public class BankApplication {
	
	private static Account[] accountArray = new Account[100];
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("----------------------------------------------");
			System.out.println("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			if(selectNo ==1 ) {
				createAccount();	
			} else if (selectNo == 2) {
				accountList();
			} else if (selectNo == 3) {
				deposit();
			} else if (selectNo == 4) {
				withdraw();
			} else if (selectNo == 5) {
				run = false;
			}
		}
		System.out.println("프로그램 종료");
	}
	
	private static void createAccount() {
		System.out.println("------");
		System.out.println("계좌생성");
		System.out.println("------");
		System.out.println("계좌번호 : ");
		String ano = scanner.next();
		System.out.println("계좌주 : ");
		String owner = scanner.next();
		System.out.println("초기입금액 : ");
		int money = scanner.nextInt();
		
		Account account = new Account(ano, owner, money);
		
		boolean isCreate = false;
		for(int i=0; i<accountArray.length; i++)
			if(accountArray[i] == null) {
				accountArray[i] = account;
				isCreate = true;
				break;
			}
		if (isCreate)
			System.out.println("계좌가 생성 되었습니다.");
		else
			System.out.println("계좌 생성에 실패하셨습니다.");
	}
	
	private static void accountList() {
		for (int i=0; i<accountArray.length; i++) {
			if(accountArray[i] == null) {
				break;
			}
			
			Account account = accountArray[i];
			System.out.printf("%10s %10s %10d\n", account.getAno(), account.getOwner(), account.getBalance());
		}
	}
	
	private static void deposit() {
		System.out.println("====");
		System.out.println("예금");
		System.out.println("====");
		System.out.println("계좌번호");
		String ano = scanner.next();
		System.out.println("예금액");
		int money = scanner.nextInt();
		
		Account account = findAccount(ano);
		
		if (account==null) {
			System.out.println("해당 계좌가 없습니다");
			return;
		}
		account.setBalance(account.getBalance() + money);
		System.out.println("예금이 성공되었습니다.");
	}
	
	private static void withdraw() {
		System.out.println("====");
		System.out.println("출금");
		System.out.println("====");
		System.out.println("계좌번호");
		String ano = scanner.next();
		System.out.println("출금액");
		int money = scanner.nextInt();
		
		Account account = findAccount(ano);
		
		if (account==null) {
			System.out.println("해당 계좌가 없습니다");
			return;
		}
		account.setBalance(account.getBalance() - money);
		System.out.println("출금이 성공되었습니다.");
	}
//	Account 배열에서 ano와 동일한 Account 객체 찾기
	private static Account findAccount(String ano) {
		for (Account account : accountArray)
			if (account == null)
				break;
			else {
				if (ano.equals(account.getAno()))
					return account;
			}
		
		return null;
	}
}
