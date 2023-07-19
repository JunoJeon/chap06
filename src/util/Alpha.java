package util;

public class Alpha {
	int line;
	int column;
	Color fg;
	Color bg;
	char ch;
	
	public Alpha() {
		line = (int)(Math.random()*20 + 1);
		column = (int)(Math.random()*40 + 1);
		
		do {
		fg = Color.values()[(int)(Math.random()*8)];
		bg = Color.values()[(int)(Math.random()*8)];
		} while (fg==bg);
		ch = (char)(Math.random()*26 + 'A');

	}
	
	public void show() {
		VT100.cursorMove(line, column);
		VT100.setForeground(fg);
		VT100.setBackground(bg);
		VT100.print(ch);
	}
}
