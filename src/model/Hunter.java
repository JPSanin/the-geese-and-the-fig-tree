package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Hunter extends InteractableObject{
	private int bushX;
	private int bushY;
	//image(bush,850,460,330,141);
	public Hunter(int posX, int posY, int sizeX, int sizeY, PApplet app) {
		super(posX, posY, sizeX, sizeY, app);
		this.bushX=850;
		this.bushY=460;
	}

	@Override
	public void draw(PImage[] images) {
		getApp().image(images[0], getPosX(), getPosY(), getSizeX(),getSizeY());
		getApp().image(images[6], bushX, bushY, 330,141);
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
		bushX-=2;
		if(bgPosX<=-400) {
			super.setPosX(545);
			bushX=450;
		}
		
	}

	@Override
	public void parallaxRight(int bgPosX) {
		// TODO Auto-generated method stub
		
	}

	

	
	
}
