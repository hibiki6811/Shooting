package shooting;

import factory.BackFactory;
import factory.EnemyFactory;
import factory.GameObjectFactory;
import factory.PlayerFactory;
import object.Enemy;
import object.GameObject;

class Run {
	
	private MyFrame myFrame;
	private Render render;
	private GameObjectManager manager;
	
	Run(MyFrame myFrame, Render render, GameObjectManager manager){
		this.myFrame = myFrame;
		this.render = render;
		this.manager = manager;
	}

	final void runGame() {
		myFrame.createFrame();
		myFrame.setPanel(render.getPanel());
		Stage stage = new Stage();
		manager.addGameObject(new BackFactory().createGameObject());
		manager.addGameObject(new PlayerFactory().createGameObject());
		GameObjectFactory enemyFactory = new EnemyFactory();
		manager.addGameObject(enemyFactory.createGameObject());
		manager.addGameObject(enemyFactory.createGameObject());
		manager.addGameObject(enemyFactory.createGameObject());
		manager.addGameObject(enemyFactory.createGameObject());
		manager.addGameObject(enemyFactory.createGameObject());
		manager.initializeAllGameObjects();
		render.setRenderGameObject(manager.getGameObjects());
		render.sortGameObject();
		int count = 0;
		while(true) {
			for(GameObject object : manager.getGameObjects()) {
				if(stage.isEnemyInterval(count) && !object.isRenderable() && object instanceof Enemy) {
					object.setIsRenderable(true);
					stage.updateEnemyCount();
				}
			}
			manager.moveAllGameObjects();
			render.rendering();
			count ++;
			try {
				Thread.sleep(16);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
