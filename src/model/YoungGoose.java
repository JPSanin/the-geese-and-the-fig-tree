package model;

import processing.core.PApplet;
import processing.core.PImage;

public class YoungGoose extends InteractableObject {
	private int sleepingPosX;
	public YoungGoose(int posX, int posY, int sizeX, int sizeY, PApplet app) {
		super(posX, posY, sizeX, sizeY, app);
		sleepingPosX=415;
	}

	@Override
	public void draw(PImage[] images) {
		
		switch(super.getActions()) {
		case 0:
			getApp().image(images[0], getPosX(), getPosY(), getSizeX(),getSizeY());
			
			break;
		case 1:
			if((getApp().millis()/1000)%2==0) {
				getApp().image(images[1], getPosX(), getPosY(), getSizeX(),getSizeY());
			}else {
				getApp().image(images[0], getPosX(), getPosY(), getSizeX(),getSizeY());
			}
			break;
		case 2:
			getApp().image(images[2], sleepingPosX, 60, getSizeX(),getSizeY());
			break;
		}
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
		sleepingPosX-=2;
		
		if(bgPosX<=-400) {
			sleepingPosX=15;
		}
		
	}

	@Override
	public void parallaxRight(int bgPosX) {
		// TODO Auto-generated method stub
		
	}



}
