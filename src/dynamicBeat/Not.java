package dynamicBeat;

import java.awt.Graphics2D;
import java.awt.Image;

import javax.swing.ImageIcon;

public class Not extends Thread {
	
	private Image notBasicImage = new ImageIcon(Main.class.getResource("../images/notBasic.png")).getImage();
	private int x, y = 610 - (1000 / Main.SLEEP_TIME * Main.NOTE_SPEED) * Main.REACH_TIME;
	private String notType;
	
	public Not(String notType) {
		if(notType.equals("A")) {
			x = 228;
		}
		else if(notType.equals("S")) {
			x = 432;
		}
		else if(notType.equals("D")) {
			x = 532;
		}	
		else if(notType.equals("F")) {
			x = 632;
		}
		else if(notType.equals("Space")) {
			x = 732;
		}
		else if(notType.equals("J")) {
			x = 832;
		}
		else if(notType.equals("K")) {
			x = 932;
		}
		else if(notType.equals("L")) {
			x = 1032;
		}
		else if(notType.equals("Semicolon")) {
			x = 1132;								
		}
		this.notType = notType;
	}
	
	public void screenDraw(Graphics2D g) {
		if(!notType.equals("Space"))
		{
			g.drawImage(notBasicImage, x, y, null);
		}
		else
		{
			g.drawImage(notBasicImage, x, y, null);
			g.drawImage(notBasicImage, x + 100, y, null);
		}
	}
	public void drop() {
		y += Main.NOTE_SPEED;
	}
	
	@Override
	public void run() {
		try {
			while (true) {
				drop();
				Thread.sleep(Main.SLEEP_TIME);
			}
		} catch(Exception e) {
			System.err.println(e.getMessage());
		}
		
	}
}
