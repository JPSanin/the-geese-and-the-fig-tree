package model;

import processing.core.PApplet;
import processing.core.PImage;

public class OldGoose extends InteractableObject{

	public OldGoose(int posX, int posY, int sizeX, int sizeY, PApplet app) {
		super(posX, posY, sizeX, sizeY, app);
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void parallaxRight(int bgPosX) {
		// TODO Auto-generated method stub
		
	}

}
