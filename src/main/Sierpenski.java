package main;
/**
 * Main class for the Sierpenski triangle program
 * @author Marcus Gabilheri
 * @version 1.0
 * @since Feb 15, 2014
 *
 */
import java.awt.Color;
import java.util.ArrayList;

public class Sierpenski {
	
	public static final ArrayList<Color> colors = new ArrayList<Color>();
	
	public static void main(String[] args) {
		
		colors.add(Color.RED);
		colors.add(Color.GRAY);
		colors.add(Color.BLUE);
		colors.add(Color.CYAN);
		colors.add(Color.YELLOW);
		colors.add(Color.WHITE);
		colors.add(Color.ORANGE);
		colors.add(Color.MAGENTA);
		
		MyFrame frame = new MyFrame();
		frame.setVisible(true);
	}
	
	
}
