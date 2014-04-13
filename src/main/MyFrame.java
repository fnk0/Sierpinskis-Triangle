package main;
/**
 * This class holds the frame for the Sierpenski triangle program.
 * @author Marcus Gabilheri
 * @version 1.0
 * @since Feb 15, 2014
 *
 */
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MyFrame extends JFrame {

	private static final long serialVersionUID = -4874481754647933051L;
	private static Container contentPane;
	private static Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
	
	public MyFrame() {
		super("Sierpenski Triangle by Marcus Gabilheri");
		int WIDTH = (int) (screenSize.getWidth() / 4) * 2;
		int HEIGHT = (int) (screenSize.getHeight() / 4) * 3;
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		contentPane = getContentPane();
		DrawTriangle draw = new DrawTriangle();
		contentPane.add(draw);
	}
}
