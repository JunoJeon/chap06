
public class CallbyValueExample {
	
	static void process(int num) {
		num += 10;
		System.out.println("num = " + num);
	}
	
	
	public static void main(String[] args) {
		int num = 100;
		process(num);
		
		System.out.println("main num = " + num);

	}

}
