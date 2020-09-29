package model;

import processing.core.PApplet;
import processing.core.PImage;

public class Hunter extends InteractableObject{
	private int bushX;
	private int bushY;
	private int standingX;
	private int standingY;
	private int standingWidth;
	private int standingHeigth;
	
	public Hunter(int posX, int posY, int sizeX, int sizeY, PApplet app) {
		super(posX, posY, sizeX, sizeY, app);
		this.bushX=850;
		this.bushY=460;
		this.standingX=945;
		this.standingY=385;
		this.standingWidth=155;
		this.standingHeigth=207;
		
	}

	@Override
	public void draw(PImage[] images) {
		
		switch(super.getActions()) {
		case 0:
			if((getApp().millis()/1000)%2==0) {
				getApp().image(images[1], getPosX(), getPosY(), getSizeX(),getSizeY());
			}else {
				getApp().image(images[0], getPosX(), getPosY(), getSizeX(),getSizeY());
			}
			break;
		case 1:
			getApp().image(images[2], standingX,standingY,standingWidth,standingHeigth);
			break;
		case 2:
			if((getApp().millis()/1000)%2==0) {
				getApp().image(images[4], standingX,standingY,standingWidth,standingHeigth);
			}else {
				getApp().image(images[2], standingX,standingY,standingWidth,standingHeigth);
			}
			break;
		case 3:
			getApp().image(images[5], standingX,standingY,standingWidth,standingHeigth);
			break;
		case 4:
			getApp().image(images[0], getPosX(), getPosY(), getSizeX(),getSizeY());
			break;
		}
		
		
		getApp().image(images[6], bushX, bushY, 330,141);
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
		int m;
		m=super.getPosX()-2;
		super.setPosX(m);
		bushX-=2;
		standingX+=1;
		if(standingX>=550) {
			standingX=550;
			
		}
		if(bgPosX<=-400) {
			super.setPosX(545);
			if(super.getActions()==3) {
				super.setActions(4);
			}
			
			bushX=450;
		}
		
	}

	@Override
	public void parallaxRight(int bgPosX) {
		int m;
		m=super.getPosX()+2;
		super.setPosX(m);
		bushX+=2;
		standingX-=1;
		if(standingX<=500) {
			standingX=500;
		}
		if(bgPosX>=0) {
			super.setPosX(500);
			
			bushX=850;
		}
		
	}

	public int getStandingX() {
		return standingX;
	}

	

	
	
}
