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
	
	
	public Controller(PApplet app, PImage[] images) {
		//Inicializar Objetos
		elements=new InteractableObject[5];
		elements[0]= new Vine(50, 15, 608, 544, app);
		bg=new MountainsBackground(0, 0, 1200, 600,app);
		sceneCounter=1;
		this.images= images;
		treeVine=new PImage[5];
		treeVine[0]=images[1];
		treeVine[1]=images[2];
		treeVine[2]=images[3];
		treeVine[3]=images[4];
		treeVine[4]=images[5];
	}
	
	
	private void scene1() {
		bg.draw(images[0]);
		elements[0].draw(treeVine);
	}
	/*private void scene2() {}
	private void scene3() {}
	private void scene4() {}
	private void scene5() {}*/
	
	public void start() {
		switch(sceneCounter) {
		case 1:
			scene1();
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
