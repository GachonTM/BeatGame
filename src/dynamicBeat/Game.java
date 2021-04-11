package dynamicBeat;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.RenderingHints;
import java.util.ArrayList;

import javax.swing.ImageIcon;

public class Game extends Thread {
	
	private Image gameInfoImage = new ImageIcon(Main.class.getResource("../images/gameInfo.png")).getImage();
	private Image judgementLineImage = new ImageIcon(Main.class.getResource("../images/judgementLine.png")).getImage();
	private Image notRouteBigLineImage = new ImageIcon(Main.class.getResource("../images/notRouteBigLine.png")).getImage();
	private Image notBasicImage = new ImageIcon(Main.class.getResource("../images/notBasic.png")).getImage();
	private Image notBigBasicImage = new ImageIcon(Main.class.getResource("../images/notBigBasic.png")).getImage();
	
	private Image notRouteAImage = new ImageIcon(Main.class.getResource("../images/notRoute.png")).getImage();
	private Image notRouteSImage = new ImageIcon(Main.class.getResource("../images/notRoute.png")).getImage();
	private Image notRouteDImage = new ImageIcon(Main.class.getResource("../images/notRoute.png")).getImage();
	private Image notRouteFImage = new ImageIcon(Main.class.getResource("../images/notRoute.png")).getImage();
	private Image notRouteSpaceImage = new ImageIcon(Main.class.getResource("../images/notRouteBig.png")).getImage();
	private Image notRouteJImage = new ImageIcon(Main.class.getResource("../images/notRoute.png")).getImage();
	private Image notRouteKImage = new ImageIcon(Main.class.getResource("../images/notRoute.png")).getImage();
	private Image notRouteLImage = new ImageIcon(Main.class.getResource("../images/notRoute.png")).getImage();
	private Image notRouteSemicolonImage = new ImageIcon(Main.class.getResource("../images/notRoute.png")).getImage();
	
	private String titleName;
	private String difficulty;
	private String musicTitle;
	private Music gameMusic;
	
	ArrayList<Note> noteList = new ArrayList<Note>();
	
	
	public Game(String titleName, String difficulty, String musicTitle) {
		this.titleName = titleName;
		this.difficulty = difficulty;
		this.musicTitle = musicTitle;
		gameMusic = new Music(this.musicTitle, false);
		gameMusic.start();
	}
	
	public void screenDraw(Graphics2D g) {
		
		g.setColor(Color.white);
		g.setRenderingHint(RenderingHints.KEY_TEXT_ANTIALIASING, RenderingHints.VALUE_TEXT_ANTIALIAS_ON);
		g.setFont(new Font("Ariel", Font.BOLD, 30));
		g.drawString("000000", 565, 704);
		
		
		g.drawImage(notRouteAImage, 150, 30, null);
		g.drawImage(notRouteSImage, 250, 30, null);
		g.drawImage(notRouteDImage, 350, 30, null);
		g.drawImage(notRouteFImage, 450, 30, null);
		g.drawImage(notRouteSpaceImage, 553, 30, null);	
		g.drawImage(notRouteJImage, 730, 30, null);
		g.drawImage(notRouteKImage, 830, 30, null);
		g.drawImage(notRouteLImage, 930, 30, null);
		g.drawImage(notRouteSemicolonImage, 1030, 30, null);

		g.drawImage(notRouteBigLineImage, 140, 30, null);
		g.drawImage(notRouteBigLineImage, 150, 30, null);
		g.drawImage(notRouteBigLineImage, 240, 30, null);
		g.drawImage(notRouteBigLineImage, 250, 30, null);
		g.drawImage(notRouteBigLineImage, 340, 30, null);
		g.drawImage(notRouteBigLineImage, 350, 30, null);
		g.drawImage(notRouteBigLineImage, 440, 30, null);
		g.drawImage(notRouteBigLineImage, 450, 30, null);
		g.drawImage(notRouteBigLineImage, 540, 30, null);
		g.drawImage(notRouteBigLineImage, 550, 30, null);
		g.drawImage(notRouteBigLineImage, 715, 30, null);
		g.drawImage(notRouteBigLineImage, 725, 30, null);
		g.drawImage(notRouteBigLineImage, 815, 30, null);
		g.drawImage(notRouteBigLineImage, 825, 30, null);
		g.drawImage(notRouteBigLineImage, 915, 30, null);
		g.drawImage(notRouteBigLineImage, 925, 30, null);
		g.drawImage(notRouteBigLineImage, 1015, 30, null);
		g.drawImage(notRouteBigLineImage, 1025, 30, null);
		g.drawImage(notRouteBigLineImage, 1115, 30, null);
		g.drawImage(notRouteBigLineImage, 1125, 30, null);
		
		
		g.drawImage(gameInfoImage, 0, 665, null);
		g.drawImage(judgementLineImage, -10, 610, null);
		g.drawString(titleName, 20, 702);
	}
	
	public void pressA() {
		notRouteAImage = new ImageIcon(Main.class.getResource("../images/notRouteEntered.png")).getImage();
		new Music("buttonPressedMusic.mp3", false).start();
	}
	public void releaseA() {
		notRouteAImage = new ImageIcon(Main.class.getResource("../images/notRoute.png")).getImage();
	}
	
	
	public void pressS() {
		notRouteSImage = new ImageIcon(Main.class.getResource("../images/notRouteEntered.png")).getImage();
		new Music("buttonPressedMusic.mp3", false).start();
	}
	public void releaseS() {
		notRouteSImage = new ImageIcon(Main.class.getResource("../images/notRoute.png")).getImage();
	}
	
	
	public void pressD() {
		notRouteDImage = new ImageIcon(Main.class.getResource("../images/notRouteEntered.png")).getImage();
		new Music("buttonPressedMusic.mp3", false).start();
	}
	public void releaseD() {
		notRouteDImage = new ImageIcon(Main.class.getResource("../images/notRoute.png")).getImage();
	}
	
	
	public void pressF() {
		notRouteFImage = new ImageIcon(Main.class.getResource("../images/notRouteEntered.png")).getImage();
		new Music("buttonPressedMusic.mp3", false).start();
	}
	public void releaseF() {
		notRouteFImage = new ImageIcon(Main.class.getResource("../images/notRoute.png")).getImage();
	}
	
	
	public void pressSpace() {
		notRouteSpaceImage = new ImageIcon(Main.class.getResource("../images/notRouteBigEntered.png")).getImage();
		new Music("buttonPressedMusic.mp3", false).start();
	}
	public void releaseSpace() {
		notRouteSpaceImage = new ImageIcon(Main.class.getResource("../images/notRouteBig.png")).getImage();
	}
	
	
	public void pressJ() {
		notRouteJImage = new ImageIcon(Main.class.getResource("../images/notRouteEntered.png")).getImage();
		new Music("buttonPressedMusic.mp3", false).start();
	}
	public void releaseJ() {
		notRouteJImage = new ImageIcon(Main.class.getResource("../images/notRoute.png")).getImage();
	}
	
	
	public void pressK() {
		notRouteKImage = new ImageIcon(Main.class.getResource("../images/notRouteEntered.png")).getImage();
		new Music("buttonPressedMusic.mp3", false).start();
	}
	public void releaseK() {
		notRouteKImage = new ImageIcon(Main.class.getResource("../images/notRoute.png")).getImage();
	}
	
	
	public void pressL() {
		notRouteLImage = new ImageIcon(Main.class.getResource("../images/notRouteEntered.png")).getImage();
		new Music("buttonPressedMusic.mp3", false).start();
	}
	public void releaseL() {
		notRouteLImage = new ImageIcon(Main.class.getResource("../images/notRoute.png")).getImage();
	}
	
	
	public void pressSemicolon() {
		notRouteSemicolonImage = new ImageIcon(Main.class.getResource("../images/notRouteEntered.png")).getImage();
		new Music("buttonPressedMusic.mp3", false).start();
	}
	public void releaseSemicolon() {
		notRouteSemicolonImage = new ImageIcon(Main.class.getResource("../images/notRoute.png")).getImage();
	}
	
	
	@Override
	public void run() {
		
	}
	
	public void close() {
		gameMusic.close();
		this.interrupt();
	}
	
}
