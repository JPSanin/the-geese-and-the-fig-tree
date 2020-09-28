package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Vine extends InteractableObject{

	public Vine(int posX, int posY, int sizeX, int sizeY, PApplet app) {
		super(posX, posY, sizeX, sizeY, app);
		
	}

	@Override
	public void draw(PImage[] images) {
		getApp().image(images[0], getPosX(), getPosY(), getSizeX(),getSizeY());
		
	}

	@Override
	public void action() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void indicator() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parallaxLeft(int bgPosX) {
		int m;
		m=super.getPosX()-2;
		super.setPosX(m);
		if(bgPosX<=-400) {
			super.setPosX(-345);
		}
		
	}

	@Override
	public void parallaxRight(int bgPosX) {
		// TODO Auto-generated method stub
		
	}

}
