import java.awt.Color;
import java.awt.Graphics;

public class Unicorn extends GameObject{
 
	public Unicorn(int x, int y, int width, int height){
		super(x, y, width, height);
	}
	void draw(Graphics g){
		g.setColor(Color.YELLOW);
		//g.fillRect(150, 0, 50, 50);
		
	}
}
