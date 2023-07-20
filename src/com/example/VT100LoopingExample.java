package com.example;

public class VT100LoopingExample {

	public static void main(String[] args) throws InterruptedException {
		System.out.println("\033[2J");
		
		for(int i=0; i<5000; i++) {
			int line = (int)(Math.random()*20-1);
			int column = (int)(Math.random()*40+1);
			int fg = (int)(Math.random()*8+30);
			int bg = (int)(Math.random()*8+40);
			char ch = (char)(Math.random()*26 +'A');
			
			System.out.printf("\033[%d;%dH", line, column);
			System.out.printf("\033[%dm", fg);
			System.out.printf("\033[%dm", bg);
			System.out.printf("%c", ch);
			
			System.out.println("\033[1;41H");
			System.out.println("\033[0m");
			System.out.printf("i= [%5d]", i);
			Thread.sleep(10);
			
		
		
		}
		System.out.println("\033[0m");
		System.out.println("\033[21;1H");
		System.out.println("Program End..");

	}

}
