package snake;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;

public class Egg {
	public int getRow() {
		return row;
	}
	public void setRow(int row) {
		this.row = row;
	}
	public int getCol() {
		return col;
	}
	public void setCol(int col) {
		this.col = col;
	}
	int w=Yard.BLOCK_SIZE;
	int h=Yard.BLOCK_SIZE;
	int row,col;
	private static Random r=new Random();
	private Color color=Color.GREEN;
	public Egg(int row, int col) {
		
		this.row = row;
		this.col = col;
	}
	
	public Egg() {
		this(r.nextInt(Yard.ROWS-3)+3,r.nextInt(Yard.COLS));
	}
	
	public void reAppear() {
		this.row=r.nextInt(Yard.ROWS-3)+3;
		this.col=r.nextInt(Yard.COLS);
		}
	public Rectangle getRect() {
		return new Rectangle(Yard.BLOCK_SIZE*this.col, Yard.BLOCK_SIZE*this.row,this.w,this.h);
	}
public void draw(Graphics g) {
	Color c=g.getColor();
	g.setColor(color);
	g.setColor(Color.RED);
	g.fillOval(Yard.BLOCK_SIZE*col, Yard.BLOCK_SIZE*row, w, h);
	g.setColor(c);
	if(color==Color.GREEN)color=Color.RED;
	else color=Color.GREEN;
}
}
