import java.util.Scanner;

public class CarExample {
	static class Car {
		
	}
	
	public static void main(String[] args) {
		String str = "Hello";
		String str2 =  new String("Hello");
		
		Car c1 = null;
		Car c2 = new Car();  //new Car() 은 인스턴스다. 인스턴스화
		Car c3 = new Car(); //new를 사용하면 힙에 만들어진다.
		c2 = null;
	}
	

	public static void main2(String[] args) {
		System.out.println("Hello OOP!");
		Math.random();
		Scanner scan = null;

	}

}
