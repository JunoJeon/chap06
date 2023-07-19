
public class FinalExample {
	
	static class Alpha {
		final static double PI = 3.141592;
		final int line;	// final filed
		int column;
		
		public Alpha() {
			line = 10;
			column = 20;
		}
		
		void show() {
			final int num = 100;
//			num++; (X)
		}
	}

	public static void main(String[] args) {
		Alpha a = new Alpha();
//		a.line = 20;  (X)
		a.column = 30;
		
//		Alpha.PI= 4.12; (x)
		
//		Math m = new Math(); (X)
		System.out.println(Math.PI);
//		System.out.println(Math.);

	}

}
