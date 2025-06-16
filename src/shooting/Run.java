package shooting;

import javax.swing.JFrame;

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
	
	Run(){
		this.myFrame = new MyFrame(new JFrame());
		this.render = new Render(new ImageReader());
		this.manager = new GameObjectManager();
	}

	final void runGame() {
		myFrame.createFrame();
		myFrame.setPanel(render.getPanel());
		Operation operation = new Operation();
		myFrame.setOperation(operation);
		Stage stage = new Stage();
		manager.addGameObject(new BackFactory().createGameObject());
		PlayerFactory playerFactory = new PlayerFactory();
		manager.addGameObject(playerFactory.createGameObject());
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
			if(stage.isEnemySpawnInterval(count)) {
				for(GameObject object : manager.getGameObjects()) {
					if(!object.isRenderable() && object instanceof Enemy) {
						Enemy enemy = (Enemy)object;
						enemy.spawn();
						stage.updateEnemySpawnCounter();
						break;
					}
				}
			}
			operation.operation(playerFactory.getObject());
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
