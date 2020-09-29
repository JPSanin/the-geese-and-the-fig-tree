package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Net extends InteractableObject {

	public Net(int posX, int posY, int sizeX, int sizeY, PApplet app) {
		super(posX, posY, sizeX, sizeY, app);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void draw(PImage[] images) {
		switch(super.getActions()) {
		case 0:
			getApp().image(images[0], getPosX(), getPosY(), getSizeX(),getSizeY());
			break;
		
		}
		
	}

	@Override
	public void action() {}


	@Override
	public void parallaxLeft(int bgPosX) {
		
		int m;
		m=super.getPosX()-2;
		super.setPosX(m);
		if(bgPosX<=-400) {
			super.setPosX(-50);
		}
	}

	@Override
	public void parallaxRight(int bgPosX) {
		int m;
		m=super.getPosX()+2;
		super.setPosX(m);
		if(bgPosX>=0) {
			super.setPosX(350);
		}
		
	}

	

}
