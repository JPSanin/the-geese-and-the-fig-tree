package controller;

import model.*;

public class Controller {

	private InteractableObject[] elements;
	private MountainsBackground bg;
	private int SceneCounter;
	
	public Controller() {
		//Inicializar Objetos
		
	}
	
	public void switchScene() {}
	public void scene1() {}
	public void scene2() {}
	public void scene3() {}
	public void scene4() {}
	public void scene5() {}
	

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
		return SceneCounter;
	}

	public void setSceneCounter(int sceneCounter) {
		SceneCounter = sceneCounter;
	}
	
	
	
	
	
}
