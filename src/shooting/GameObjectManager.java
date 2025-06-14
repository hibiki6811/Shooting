package shooting;

import java.util.ArrayList;
import java.util.List;

import object.GameObject;

class GameObjectManager {
	
	private List<GameObject> gameObjects;
	
	GameObjectManager() {
		gameObjects = new ArrayList<>();
	}
	
	final void addGameObject(GameObject object) {
		if(!gameObjects.contains(object)) {
			gameObjects.add(object);
		}else {
			//System.out.println("オブジェクトが重複しています");
		}
	}
	
	final void addGameObjects(List<GameObject> objects) {
		for(GameObject object : objects) {
			addGameObject(object);
		}
	}
	
	final void showAllGameObjects() {
		for(GameObject object : gameObjects) {
			object.setIsRenderable(true);
		}
	}
	
	final void hideAlleGameObjects() {
		for(GameObject object : gameObjects) {
			object.setIsRenderable(false);
		}
	}
	
	final void moveAllGameObjects() {
		for(GameObject object : gameObjects) {
			object.move();
		}
	}
	
	final void initializeAllGameObjects() {
		for(GameObject object : gameObjects) {
			object.initialize();
		}
	}
	
	final List<GameObject> getGameObjects(){
	    return gameObjects;
	}
	
}
