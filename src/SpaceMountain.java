import javax.swing.JFrame;

public class SpaceMountain {
	JFrame frame;
	GamePanel gamepanel;
	
	public static void main(String[] args) {
		SpaceMountain sp = new SpaceMountain();
	}
	public SpaceMountain() {
		frame = new JFrame();
		gamepanel = new GamePanel(352, 1600);
		setup();
	}
void setup(){
		
		frame.setVisible(true);
		
		frame.add(gamepanel);
		frame.setSize(300, 500);
	
		
		
}
}
