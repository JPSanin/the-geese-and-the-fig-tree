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
	private PImage[] hunterImg;
	private PImage[] netImg;
	private boolean finished;
	
	
	public Controller(PApplet app, PImage[] images) {
		//Inicializar Objetos
		elements=new InteractableObject[5];
		elements[0]= new Vine(55, 55, 608, 504, app);
		elements[1]= new YoungGoose(523, 452, 127, 141, app);
		elements[2]= new OldGoose(600, 440, 127, 141, app);
		elements[3]= new Hunter(945, 438, 155, 163, app);
		elements[4]=new Net(350, 250, 288, 195, app);
		bg=new MountainsBackground(0, 0, 1200, 600,app);
		sceneCounter=1;
		finished=false;
		this.images= images;
		
		treeVine=new PImage[5];
		treeVine[0]=images[1];
		treeVine[1]=images[2];
		treeVine[2]=images[3];
		treeVine[3]=images[4];
		treeVine[4]=images[5];
		
		youngGooseImg=new PImage[4];
		youngGooseImg[0]=images[6];
		youngGooseImg[1]=images[7];
		youngGooseImg[2]=images[8];
		youngGooseImg[3]=images[9];
		
		oldGooseImg=new PImage[4];
		oldGooseImg[0]=images[10];
		oldGooseImg[1]=images[11];
		oldGooseImg[2]=images[12];
		oldGooseImg[3]=images[13];
		
		hunterImg=new PImage[7];
		hunterImg[0]=images[14];
		hunterImg[1]=images[15];
		hunterImg[2]=images[16];
		hunterImg[3]=images[17];
		hunterImg[4]=images[18];
		hunterImg[5]=images[19];
		hunterImg[6]=images[20];
		
		netImg= new PImage[1];
		netImg[0]=images[21];
		
	}
	
	
	private void scene1() {
		bg.draw(images[0]);
		elements[1].draw(youngGooseImg);
		elements[2].draw(oldGooseImg);
		elements[0].draw(treeVine);
		
		
	}
	
	private void scene2() {
		bg.parallaxLeft();
		elements[0].parallaxLeft(bg.getPosX());
		elements[1].parallaxLeft(bg.getPosX());
		elements[2].parallaxLeft(bg.getPosX());
		elements[3].parallaxLeft(bg.getPosX());
		bg.draw(images[0]);
		elements[1].draw(youngGooseImg);
		elements[2].draw(oldGooseImg);
		elements[0].draw(treeVine);
		elements[3].draw(hunterImg);
		
	}
	
	private void scene3() {
		bg.parallaxRight();
		elements[0].parallaxRight(bg.getPosX());
		elements[1].parallaxRight(bg.getPosX());
		elements[2].parallaxRight(bg.getPosX());
		elements[3].parallaxRight(bg.getPosX());
		bg.draw(images[0]);
		elements[1].draw(youngGooseImg);
		elements[2].draw(oldGooseImg);
		elements[0].draw(treeVine);
		elements[3].draw(hunterImg);
	}
	
	private void scene4() {
		bg.parallaxLeft();
		elements[0].parallaxLeft(bg.getPosX());
		elements[1].parallaxLeft(bg.getPosX());
		elements[2].parallaxLeft(bg.getPosX());
		elements[3].parallaxLeft(bg.getPosX());
		elements[4].parallaxLeft(bg.getPosX());
		bg.draw(images[0]);
		elements[1].draw(youngGooseImg);
		elements[2].draw(oldGooseImg);
		elements[0].draw(treeVine);
		elements[4].draw(netImg);
		elements[3].draw(hunterImg);
		
		
		
	}
	
	private void scene5() {
		bg.draw(images[0]);
		elements[2].draw(oldGooseImg);
		elements[0].draw(treeVine);
		elements[1].draw(youngGooseImg);
		elements[4].draw(netImg);
		elements[3].draw(hunterImg);
		
	}
	
	private void scene6() {
		bg.parallaxRight();
		elements[0].parallaxRight(bg.getPosX());
		elements[1].parallaxRight(bg.getPosX());
		elements[2].parallaxRight(bg.getPosX());
		elements[3].parallaxRight(bg.getPosX());
		elements[4].parallaxRight(bg.getPosX());
		bg.draw(images[0]);
		elements[0].draw(treeVine);
		elements[2].draw(oldGooseImg);
		elements[1].draw(youngGooseImg);
		elements[4].draw(netImg);
		elements[3].draw(hunterImg);
		
	}
	
	private void scene7() {
		bg.draw(images[0]);
		elements[0].draw(treeVine);
		elements[2].draw(oldGooseImg);
		elements[1].draw(youngGooseImg);
		elements[4].draw(netImg);
		elements[3].draw(hunterImg);
		elements[2].action();
		elements[1].action();
		elements[3].action();
		if(elements[1].getPosX()<=-200) {
			sceneCounter=8;
		}
	}
	
	
	/*
	
	
	private void scene5() {}*/
	
	public void start() {
		switch(sceneCounter) {
		case 1:
			scene1();
			break;
		case 2:
			scene2();
			break;
			
		case 3:
			scene3();
			break;
		case 4:
			scene4();
			break;
		case 5:
			scene5();
			break;
		case 6:
			scene6();
			break;
		case 7:
			scene7();
			break;
		case 8:
			finished=true;
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


	public boolean isFinished() {
		return finished;
	}


	
	
	
	
	
}
