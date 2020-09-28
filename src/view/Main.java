package view;

import controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
	private Controller controller;
	private int screen;
	
	private PImage[] images;
	private PImage[] startScreen;
	private PImage[] endScreen;
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}
	
	public void settings() {
		size(800, 600);
		
	}

	public void setup() {
		
		images= new PImage[11];
		images[0]=loadImage("images/Background.png");
		images[1]=loadImage("images/tree1.png");
		images[2]=loadImage("images/tree2.png");
		images[3]=loadImage("images/tree3.png");
		images[4]=loadImage("images/tree4.png");
		images[5]=loadImage("images/treeBright.png");
		images[6]=loadImage("images/YoungGoose.png");
		images[7]=loadImage("images/YoungGooseBright.png");
		images[8]=loadImage("images/OldGoose.png");
		images[9]=loadImage("images/OldGooseBright.png");
		images[10]=loadImage("images/initial-template.png");
		controller=new Controller(this,images);
		screen=2;
		
		
		startScreen= new PImage[2];
		startScreen[0]=loadImage("images/Start1.png");
		startScreen[1]=loadImage("images/Start2.png");
		
		endScreen= new PImage[2];
		endScreen[0]=loadImage("images/End1.png");
		endScreen[1]=loadImage("images/End2.png");
	}
	
	public void draw() {
		switch(screen) {
		case 1:
			image(startScreen[0],0,0,800,600);
			if (mouseX > 250 && mouseX < 550 && mouseY > 350 && mouseY < 415) {
				image(startScreen[1],0,0,800,600);
			}
			break;
		case 2:
			controller.start();
			break;
		case 3:
			image(endScreen[0],0,0,800,600);
			if (mouseX > 250 && mouseX < 550 && mouseY > 350 && mouseY < 415) {
				image(endScreen[1],0,0,800,600);
			}
			break;
			
		}
		fill(0);
		text(mouseX+","+mouseY, mouseX, mouseY);
		
	}
	
	public void mousePressed() {
		switch(screen) {
		case 1:
			
			if (mouseX > 250 && mouseX < 550 && mouseY > 350 && mouseY < 415) {
				screen=2;
			}
			break;
		case 2:
			screen=3;
			break;
		case 3:
			image(endScreen[0],0,0,800,600);
			if (mouseX > 250 && mouseX < 550 && mouseY > 350 && mouseY < 415) {
				exit();
			}
			break;
		}
	}
}
