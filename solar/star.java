package solar;

import java.awt.Graphics;
import java.awt.Image;

import util.GameUtil;

public class star {
	Image img;
	double x,y;
	int pic_width,pic_height;
	
	public void draw(Graphics g) {
		g.drawImage(img, (int)x, (int)y, pic_width, pic_height, null);
	}
	public star(String imgpath,double x,double y, int pic_width, int pic_height) {
		this.img = GameUtil.getImage(imgpath);
		this.x = x;
		this.y = y;
		this.pic_width = pic_width;
		this.pic_height = pic_height;
	}
	public star() {
	}
}
