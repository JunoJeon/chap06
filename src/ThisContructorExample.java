
public class ThisContructorExample {
	static class Alpha {
		int line;
		int column;
		int fg;
		int bg;
		char ch;
		
		public Alpha(int line, int column) {
//			this.line = line;
//			this.column = column;
//			this.fg = 31;
//			this.bg = 44;
//			this.ch = 'A';
			this(line, column, 31, 44, 'A');
		}
		
		public Alpha(int line, int column, int fg, int bg, char ch) {
			this.line = line;
			this.column = column;
			this.fg = fg;
			this.bg = bg;
			this.ch = ch;
		}
		void show() {
			System.out.printf("[%d,%d,%d,%d,%c]\n", line, column, fg, bg, ch);
		}
	}
	

	public static void main(String[] args) {
		Alpha a1 = new Alpha(10, 5, 31, 44,'A');
		Alpha a2 = new Alpha(20, 30);
		
		a1.show();
		a2.show();
		
	}

}
