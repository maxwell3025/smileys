package smileys;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.JFrame;

public class smiley extends JFrame {
BufferedImage img= null;
	public smiley() throws IOException {
		setSize(1000, 1000);
		 img = ImageIO.read(new File("glad.png"));
		setVisible(true);
	}
	public void paint(Graphics g){

	}

	public static void main(String[] args) throws IOException {
		smiley s = new smiley();
	}

}
