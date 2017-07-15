package solar;

import java.awt.Graphics;
import java.awt.Image;

import util.Constant;
import util.GameUtil;
import util.myFrame;

/*
 * 太阳系主窗口
 */
public class solarFrame extends myFrame{
	Image bg = GameUtil.getImage("images/bg.jpg");
	star sun=new star("images/01sun.png",Constant.Game_width/2-15,Constant.Game_height/2,50,50);
	Planet mercury = new Planet(sun,"images/02mercury.png",50,30,0.4,10,10);
	Planet venus = new Planet(sun,"images/03venus.png",80,37,0.3,30,30);
	Planet earth = new Planet(sun,"images/04earth.png",120,60,0.2,30,30);
	Planet moon = new Planet(earth,"images/05moon.png",25,15,0.4,10,10,true);
	Planet mars = new Planet(sun,"images/06mars.png",160,80,0.1,15,15);
	Planet jupiter = new Planet(sun,"images/07jupiter.png",270,135,0.08,80,80);
	Planet saturn = new Planet(sun,"images/08saturn.png",300,150,0.06,75,75);
	Planet uranus = new Planet(sun,"images/09uranus.png",360,180,0.02,40,40);
	Planet neptune = new Planet(sun,"images/010neptune.png",400,230,0.007,40,40);
	
	
	public void paint(Graphics g) {
		g.drawImage(bg, 0, 0, null);
		sun.draw(g);
		earth.draw(g);
		mars.draw(g);
		neptune.draw(g);
		mercury.draw(g);
		saturn.draw(g);
		uranus.draw(g);
		venus.draw(g);
		jupiter.draw(g);
		moon.draw(g);
	}
				
	public static void main(String[] arg) {
		new solarFrame().lauchFrame();
	}
}
