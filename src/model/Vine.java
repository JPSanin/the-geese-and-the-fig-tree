package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Vine extends InteractableObject{
	private int imageCounter;
	public Vine(int posX, int posY, int sizeX, int sizeY, PApplet app) {
		super(posX, posY, sizeX, sizeY, app);
		imageCounter=1;
		
	}

	

	@Override
	public void draw(PImage[] images) {
		switch(super.getActions()) {
		case 0:
			if((getApp().millis()/1000)%2==0) {
				getApp().image(images[4], getPosX(), getPosY(), getSizeX(),getSizeY());
			}else {
				getApp().image(images[0], getPosX(), getPosY(), getSizeX(),getSizeY());
			}
			break;
		case 1:
			if((getApp().millis()/1000)%2==0) {
				if(imageCounter<3) {
					imageCounter++;
				}
			}
			getApp().image(images[imageCounter], getPosX(), getPosY(), getSizeX(),getSizeY());
			if(imageCounter==3) {
				super.setActions(2);
			}
			break;
		case 2:
			getApp().image(images[3], getPosX(), getPosY(), getSizeX(),getSizeY());
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
			super.setPosX(-345);
		}
		
	}

	@Override
	public void parallaxRight(int bgPosX) {
		int m;
		m=super.getPosX()+2;
		super.setPosX(m);
		if(bgPosX>=0) {
			super.setPosX(55);
		}
		
	}
	
	public int getImageCounter() {
		return imageCounter;
	}

	public void setImageCounter(int imageCounter) {
		this.imageCounter = imageCounter;
	}

}
