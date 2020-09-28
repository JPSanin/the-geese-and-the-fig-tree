package view;

import controller.Controller;
import processing.core.PApplet;
import processing.core.PImage;

public class Main extends PApplet {
	private Controller controller;
	private int screen;
	
	private PImage background;
	private PImage[] startScreen;
	
	public static void main(String[] args) {
		PApplet.main(Main.class.getName());

	}
	
	public void settings() {
		size(800, 600);
		
	}

	public void setup() {
		controller=new Controller();
		screen=1;
		background=loadImage("images/Background.png");
		
		startScreen= new PImage[2];
		startScreen[0]=loadImage("images/Start1.png");
		startScreen[1]=loadImage("images/Start2.png");
	}
	
	public void draw() {
		switch(screen) {
		case 1:
			image(startScreen[0],0,0,800,600);
			if (mouseX > 250 && mouseX < 550 && mouseY > 350 && mouseY < 415) {
				image(startScreen[1],0,0,800,600);
			}
			break;
		
		}
		fill(0);
		text(mouseX+","+mouseY, mouseX, mouseY);
	}
	
	public void mousePressed() {
		
	}
}
