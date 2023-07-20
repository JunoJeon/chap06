package com.example;

import util.Alpha;
import util.VT100;

public class RectangleExample2 {
	
	public static void main(String[] args) throws InterruptedException {
		VT100.clearScreen();
		
		for(int i=0; i<1000; i++) {
			Alpha a = new Alpha();
			a.show();
			
			VT100.reset();
			VT100.cursorMove(1, 42);
			System.out.printf("count = [%05d]", i);
			
			Thread.sleep(5);
			
		}
		
		VT100.reset();
		VT100.cursorMove(21, 1);
		System.out.println("Program End..");
	}
}
