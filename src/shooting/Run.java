package shooting;

import javax.swing.JFrame;

import factory.BackFactory;
import factory.BulletFactory;
import factory.EnemyFactory;
import factory.PlayerFactory;
import object.Bullet;
import object.Enemy;
import object.GameObject;
import object.Player;

class Run {
	
	private MyFrame myFrame;
	private Render render;
	private GameObjectManager manager;
	private Operation operation;
	
	Run(){
		myFrame = new MyFrame(new JFrame());
		render = new Render(new ImageReader());
		manager = new GameObjectManager();
		operation = new Operation();
	}

	final void runGame() {
		myFrame.createFrame();
		myFrame.setPanel(render.getPanel());
		myFrame.setOperation(operation);
		
		manager.addGameObject(new BackFactory().createGameObject());
		PlayerFactory playerFactory = new PlayerFactory();
		manager.addGameObject(playerFactory.createGameObject());
		EnemyFactory enemyFactory = new EnemyFactory();
		manager.addGameObject(enemyFactory.createGameObject());
		manager.addGameObject(enemyFactory.createGameObject());
		manager.addGameObject(enemyFactory.createGameObject());
		manager.addGameObject(enemyFactory.createGameObject());
		manager.addGameObject(enemyFactory.createGameObject());
		BulletFactory bulletFactory = new BulletFactory();
		manager.addGameObject(bulletFactory.createGameObject());
		manager.addGameObject(bulletFactory.createGameObject());
		manager.addGameObject(bulletFactory.createGameObject());
		manager.addGameObject(bulletFactory.createGameObject());
		manager.addGameObject(bulletFactory.createGameObject());
		manager.initializeAllGameObjects();
		
		render.setRenderGameObject(manager.getGameObjects());
		render.sortGameObject();
		
		Stage stage = new Stage();
		Player player = playerFactory.getObject();
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
			if(player.isBulletSpawnInterval()) {
				for(GameObject object : manager.getGameObjects()) {
					if(!object.isRenderable() && object instanceof Bullet) {
						Bullet bullet = (Bullet)object;
						bullet.spawn(player.getX(), player.getY());
						break;
					}
				}
			}
			operation.operation(player);
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
