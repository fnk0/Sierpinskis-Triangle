package main;

/**
 * This class will take care of drawing the Sierpinski triangle with a recursive algorythim
 * @author Marcus Gabilheri
 * @version 1.0
 * @since Feb 15, 2014
 *
 */
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;
import javax.swing.JPanel;

public class DrawTriangle extends JPanel {

	private static final long serialVersionUID = 6278713117956782641L;
	
	@Override
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		setBackground(Color.black);
		int width = getWidth();
		int height = getHeight();
		int side = 0;
		
		if(height > width) {
			side = width;
		} else {
			side = height;
		}
		g.setColor(generateColor());
		drawTriangle(g, 0, 0, side);	
	}
	
	private Color generateColor() {
		
		Random rand = new Random();
		int random = rand.nextInt(7);
		return Sierpenski.colors.get((int) random);
	}
	
	public void drawTriangle(Graphics g, int x, int y, int side) {
		
		if(side == 1) {
			g.drawRect(x, y, 1, 1);
		} else {
			
			// Center
			int xCenter = x + (side / 4);
			int yCenter = y;
			drawTriangle(g, xCenter, yCenter, side / 2);
			
			// Left
			int xLeft = x;
			int yLeft = y + (side / 2);
			drawTriangle(g, xLeft, yLeft, side / 2);
			
			// Right
			int xRight = x + (side / 2);
			int yRight = y + (side / 2);
			drawTriangle(g, xRight, yRight, side / 2);	
		}			
	}
}
