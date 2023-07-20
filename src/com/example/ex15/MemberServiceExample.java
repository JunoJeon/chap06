package com.example.ex15;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberservice = new MemberService();
		boolean result = memberservice.login("hong", "12345");
		if (result) {
			System.out.println("로그온 되었습니다");
			memberservice.logout("hong");
		} else
			System.out.println("id Ehsms password가 올바르지않습니다.");

	}

}
