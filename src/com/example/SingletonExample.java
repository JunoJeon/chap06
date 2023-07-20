package com.example;

class Oracle {
	private static Oracle instance = new Oracle(); //프라이빗으로 안하면 외부에서 접근가능
	
	private Oracle() {
		
	}
	
	public static Oracle getInstance() {
		return instance;
	}
}

public class SingletonExample {
	
	public static void main(String[] args) {
//		Oracle o = new Oracle(); (X) 
		
		Oracle o1 = Oracle.getInstance();
		Oracle o2 = Oracle.getInstance();
		
		System.out.println(o1 == o2);
	}
}
