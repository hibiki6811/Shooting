package manager;

import java.util.ArrayList;
import java.util.List;

import object.GameObject;

public class GameObjectManager {
	
	private List<GameObject> gameObjects;
	
	public GameObjectManager() {
		gameObjects = new ArrayList<>();
	}
	
	public final void addGameObject(GameObject object) {
		if(!gameObjects.contains(object)) {
			gameObjects.add(object);
		}else {
			//System.out.println("オブジェクトが重複しています");
		}
	}
	
	public final void addGameObjects(List<GameObject> objects) {
		for(GameObject object : objects) {
			addGameObject(object);
		}
	}
	
	public final void showAllGameObjects() {
		for(GameObject object : gameObjects) {
			object.setIsRenderable(true);
		}
	}
	
	public final void hideAlleGameObjects() {
		for(GameObject object : gameObjects) {
			object.setIsRenderable(false);
		}
	}
	
	public final void moveAllGameObjects() {
		for(GameObject object : gameObjects) {
			object.move();
		}
	}
	
	public final void initializeAllGameObjects() {
		for(GameObject object : gameObjects) {
			object.initialize();
		}
	}
	
	public final List<GameObject> getGameObjects(){
	    return gameObjects;
	}
	
}
