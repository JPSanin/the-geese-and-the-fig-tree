package controller;

import model.*;
import processing.core.PApplet;
import processing.core.PImage;

public class Controller{

	private InteractableObject[] elements;
	private MountainsBackground bg;
	private int sceneCounter;
	private PImage[] images;
	private PImage[] treeVine;
	private PImage[] youngGooseImg;
	private PImage[] oldGooseImg;
	
	
	public Controller(PApplet app, PImage[] images) {
		//Inicializar Objetos
		elements=new InteractableObject[5];
		elements[0]= new Vine(55, 55, 608, 504, app);
		elements[1]= new YoungGoose(523, 452, 127, 141, app);
		elements[2]= new OldGoose(600, 440, 127, 141, app);
		bg=new MountainsBackground(0, 0, 1200, 600,app);
		sceneCounter=1;
		this.images= images;
		treeVine=new PImage[5];
		treeVine[0]=images[1];
		treeVine[1]=images[2];
		treeVine[2]=images[3];
		treeVine[3]=images[4];
		treeVine[4]=images[5];
		youngGooseImg=new PImage[2];
		youngGooseImg[0]=images[6];
		youngGooseImg[1]=images[7];
		oldGooseImg=new PImage[2];
		oldGooseImg[0]=images[8];
		oldGooseImg[1]=images[9];
	}
	
	
	private void scene1() {
		bg.draw(images[0]);
		elements[0].draw(treeVine);
		elements[1].draw(youngGooseImg);
		elements[2].draw(oldGooseImg);
		
	}
	
	private void scene2() {
		bg.parallaxLeft();
		bg.draw(images[10]);
		
		
	}
	
	/*
	private void scene3() {}
	private void scene4() {}
	private void scene5() {}*/
	
	public void start() {
		switch(sceneCounter) {
		case 1:
			scene1();
			break;
		case 2:
			scene2();
			break;
		}
		
	}
	

	public InteractableObject[] getElements() {
		return elements;
	}

	public void setElements(InteractableObject[] elements) {
		this.elements = elements;
	}

	public MountainsBackground getBg() {
		return bg;
	}

	public void setBg(MountainsBackground bg) {
		this.bg = bg;
	}


	public int getSceneCounter() {
		return sceneCounter;
	}


	public void setSceneCounter(int sceneCounter) {
		this.sceneCounter = sceneCounter;
	}


	
	
	
	
	
}
