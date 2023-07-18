
public class AlphaExample {
	
	static class Alpha {
		int fg;
		int bg;
		char ch;
		
		public Alpha() {
			fg = (int)(Math.random()*8+30);
			bg = (int)(Math.random()*8+40);
			ch = (char)(Math.random()*26+'A');
			System.out.println("Alpha()...");
		}
		
		void show () {
			System.out.printf("\033[%dm", fg);
			System.out.printf("\033[%dm", bg);
			System.out.print(ch);
			System.out.print("\033[0m");
			
		}
		void hide () {
			int num;
		}
		
	}
	static class A {
		public A() {
			
		}
		public A(int fg) {
			
		}
		public A(int fg, int bg) {
			
		}
		public A(long fg, int bg) {
			
		}
		public A(int bg, long fg) {
			
		}
		
	}
	
	public static void main(String[] args) {
		A a = new A();
		
	}
	
	public static void main3(String[] args) {
		
		for (int i=0; i<10; i++) {
			for (int j=0; j<20; j++) {
				Alpha a = new Alpha();
				a.show();
			}
			System.out.println();
		}
	}

	public static void main2(String[] args) {
		System.out.println("Program Start");
		Alpha a1 = new Alpha();
		Alpha a2 = new Alpha();
		
		a1.show();
		a2.show();
		System.out.println(a1.fg);
		
		System.out.println("\033[0m");
		
		System.out.println("Program End");

	}

}
