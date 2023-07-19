package com.example;

import util.Color;
import util.VT100;
import java.util.Scanner;

public class AlphaExample {
	public static void main(String[] args) {
		VT100.clearScreen();
		
		VT100.cursorMove(10, 10);
		VT100.setForeground(Color.Black);
		VT100.setBackground(Color.White);
		System.out.println("Hello");
		
		VT100.cursorMove(13, 5);
		VT100.setForeground(Color.Black);
		VT100.setBackground(Color.Green);
		System.out.println("World!");
		
		VT100.cursorMove(5, 20);
		VT100.setForeground(Color.Magenta);
		VT100.setBackground(Color.Black);
		System.out.println("Hello World!");
		
		VT100.reset();
	}
	public static void main4(String[] args) {
		VT100.clearScreen();
		
		VT100.cursorMove(10, 10);
		VT100.setForeground(37);
		VT100.setBackground(44);
		System.out.println("Hello");
		
		VT100.cursorMove(13, 5);
		VT100.setForeground(32);
		VT100.setBackground(47);
		System.out.println("World!");
		
		VT100.cursorMove(5, 20);
		VT100.setForeground(33);
		VT100.setBackground(46);
		System.out.println("Hello World!");
		
		VT100.reset();
	}
	
	public static void main3(String[] args) {
		VT100.clearScreen();
		Scanner scan = new Scanner(System.in);
	}

	public static void main2(String[] args) {
		util.VT100.clearScreen();
		
		java.util.Scanner scan = new java.util.Scanner(System.in);
	}

}
