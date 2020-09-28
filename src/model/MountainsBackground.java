package model;

import processing.core.PApplet;
import processing.core.PImage;

public class MountainsBackground {
	private int posX;
	private int posY;
	private int sizeX;
	private int sizeY;
	private PApplet app;
	
	public MountainsBackground(int posX, int posY, int sizeX, int sizeY, PApplet app) {
		this.posX = posX;
		this.posY = posY;
		this.sizeX = sizeX;
		this.sizeY = sizeY;
		this.app = app;
	}
	
	public void parallax() {
		
	}
	
	public void draw(PImage image) {
		app.image(image, posX, posY, sizeX,sizeY);
	}

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

	public PApplet getApp() {
		return app;
	}

	public void setApp(PApplet app) {
		this.app = app;
	}
	
}
