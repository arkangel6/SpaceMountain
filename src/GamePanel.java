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
	int y1 = 0;
	int y2 = 500;
	int x;
	Unicorn unicorn = new Unicorn(150, 0 ,50,50);
	ObjectManager manager;
	
	public GamePanel(int frameWidth, int frameHeight){
	this.frameHeight = frameHeight;
	this.frameWidth = frameWidth;
	Timer timer = new Timer(x, this);
	timer.addActionListener(this);
	
	manager = new ObjectManager();
	manager.addObject(unicorn);
	try {
		background = ImageIO.read(getClass().getResource("image.png"));
		backgroundHeight = background.getHeight(); 
		}
		catch (Exception e) {
		System.out.println("no background image");
	}
	
	timer.start();
	if(timer.isRunning()){
		System.out.println("true");
		}
		
	}
	
	
	
	
	
	public void paintComponent(Graphics g){
		g.drawImage(background, 0, 0, frameWidth, frameHeight, 0, y1, frameWidth, y2 , this);
	}
	
	
	private int scrollSpeed = 10;
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
