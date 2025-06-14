package shooting;

import factory.BackFactory;
import factory.EnemyFactory;
import factory.GameObjectFactory;
import factory.PlayerFactory;

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
		stage.gameSet(manager.getGameObjects());
		while(true) {
			stage.gameFlow(manager.getGameObjects());
			render.rendering();
			try {
				Thread.sleep(16);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
