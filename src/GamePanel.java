import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;

import javax.imageio.ImageIO;
import javax.swing.JPanel;
import javax.swing.Timer;

public class GamePanel extends JPanel implements ActionListener{

	private BufferedImage background;
	private int backgroundHeight = 0;
	int frameWidth;
	int frameHeight;
	int y1;
	int y2;
	
	
	public GamePanel(int frameWidth, int frameHeight){
	Timer timer = new Timer(1000/60, this);
	timer.addActionListener(this);
	
	try {
		background = ImageIO.read(getClass().getResource("image.png"));
		backgroundHeight = background.getHeight(); 
		}
		catch (Exception e) {
		System.out.println("no background image");
	}
	}
	
	
	
	public void paintComponent(Graphics g){
		g.drawImage(background, 0, 0, frameWidth, frameHeight, 0, y1, frameWidth, y2, this);
	}
	
	
	private int scrollSpeed = 5;
	public void moveBackground() {
		if(y1>=(backgroundHeight-frameHeight)) {
			y1 = 0;
			y2 = frameHeight;
		} 
		else {
			y1+=scrollSpeed;
			y2+=scrollSpeed;
		}
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		moveBackground();
		
	}

}
