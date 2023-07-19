
public class StaticMemberExample {
	static class Alpha {
		static int count; 
		
		int cnt;
		int line;		//인스턴스 필드 Hip에 생성 
		int column;
		int fg;
		int bg;
		char ch;
		
		static {
			System.out.println("########");
			System.out.println("Alpha");
			System.out.println("########");
		}
		static {
			System.out.println("########2");
			System.out.println("Alpha");
			System.out.println("########2");
		}
		public	Alpha() {
			Alpha.count++;
			this.cnt++;
		}
		
		void show() {
			System.out.println(Alpha.count);
			System.out.println(this.cnt);
			System.out.println(this.line);
			int num = 10;
		}
		
		void hide () {
			System.out.println(Alpha.count);
			System.out.println(this.cnt);
			System.out.println(this.line);
		}
		
		static void clearScreen() {
			System.out.println("clearScreen()... ");
		}
	}

	public static void main(String[] args) {
		Alpha.clearScreen();
		
		Alpha a1 = new Alpha();
		Alpha a2 = new Alpha();
		Alpha a3 = new Alpha();
		
		System.out.println(a1.cnt);
		System.out.println(a2.cnt);
		System.out.println(a3.cnt);
		System.out.println(Alpha.count);
		
		System.out.println(Math.random());
		
		
	}

}
