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
		
		images= new PImage[23];
		images[0]=loadImage("images/Background.png");
		
		images[1]=loadImage("images/tree1.png");
		images[2]=loadImage("images/tree2.png");
		images[3]=loadImage("images/tree3.png");
		images[4]=loadImage("images/tree4.png");
		images[5]=loadImage("images/treeBright.png");
		
		images[6]=loadImage("images/YoungGoose.png");
		images[7]=loadImage("images/YoungGooseBright.png");
		images[8]=loadImage("images/SleepingYoungGoose.png");
		images[9]=loadImage("images/SleepingYoungGooseBright.png");
		
		
		
		images[10]=loadImage("images/OldGoose.png");
		images[11]=loadImage("images/OldGooseBright.png");
		images[12]=loadImage("images/SleepingOldGoose.png");
		images[13]=loadImage("images/SleepingOldGooseBright.png");
		
		
		images[14]=loadImage("images/HunterCrouch.png");
		images[15]=loadImage("images/HunterCrouchBright.png");
		images[16]=loadImage("images/HunterStandLeft.png");
		images[17]=loadImage("images/HunterStandLeftBright.png");
		images[18]=loadImage("images/HunterStandBagBright.png");
		images[19]=loadImage("images/HunterStandRight.png");
		images[20]=loadImage("images/Bush.png");
		images[21]=loadImage("images/Net.png");
		images[22]=loadImage("images/initial-template.png");
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
			switch(controller.getSceneCounter()) {
			case 1:
				if (mouseX > 350 && mouseX < 390 && mouseY > 500 && mouseY < 520) {
					controller.getElements()[0].setActions(1);
					controller.getElements()[1].setActions(1);
				}
				if (mouseX > 545 && mouseX < 625 && mouseY > 465 && mouseY < 575) {
					controller.getElements()[1].setActions(2);
					controller.getElements()[2].setActions(1);
				}
				if (mouseX > 620 && mouseX < 705 && mouseY > 455 && mouseY < 565) {
					controller.getElements()[2].setActions(2);
					controller.setSceneCounter(2);
				}
				
				break;
			case 2:
				if (mouseX > 595 && mouseX < 645 && mouseY > 450 && mouseY < 540) {
					controller.getElements()[3].setActions(1);
					controller.getElements()[3].setActions(2);
					controller.setSceneCounter(3);
				}
				
				break;
				
			case 3:
					if (mouseX > 570 && mouseX < 610 && mouseY > 450 && mouseY < 490) {
					controller.getElements()[3].setActions(3);
					controller.getElements()[1].setActions(3);
					controller.setSceneCounter(4);
					}
				break;
			case 4:
				if (mouseX > 85 && mouseX < 115 && mouseY > 73 && mouseY <150) {
					controller.setSceneCounter(5);
					controller.getElements()[1].setActions(4);
					controller.getElements()[2].setActions(3);
					}
				
				break;
			case 5:
				if (mouseX >105 && mouseX < 145 && mouseY > 113 && mouseY <190) {
					controller.setSceneCounter(6);
					controller.getElements()[2].setActions(4);
					controller.getElements()[3].setActions(1);
					controller.getElements()[3].setActions(2);
					}
				
				break;
				
			}
			
			
			
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
