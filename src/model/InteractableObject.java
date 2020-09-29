package model;

import processing.core.PApplet;
import processing.core.PImage;

public abstract class InteractableObject {

	private int posX;
	private int posY;
	private int sizeX;
	private int sizeY;
	private int actions;
	private PApplet app;
	
	public InteractableObject(int posX, int posY, int sizeX, int sizeY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.app = app;
		actions=0;
	}

	
	public abstract void draw(PImage[] images);
	public abstract void action();
	public abstract void parallaxLeft(int bgPosX);
	public abstract void parallaxRight(int bgPosX);
	
	
	
	public int getPosX() {
		return posX;
	}

	public void setPosX(int posX) {
		this.posX = posX;
	}

	public int getPosY() {
		return posY;
	}

	public void setPosY(int posY) {
		this.posY = posY;
	}

	public int getSizeX() {
		return sizeX;
	}

	public void setSizeX(int sizeX) {
		this.sizeX = sizeX;
	}

	public int getSizeY() {
		return sizeY;
	}

	public void setSizeY(int sizeY) {
		this.sizeY = sizeY;
	}

	
	public int getActions() {
		return actions;
	}


	public void setActions(int actions) {
		this.actions = actions;
	}


	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
	
	
}
