package shooting;

import javax.swing.JFrame;

import factory.BackFactory;
import factory.EnemyFactory;
import factory.PlayerBulletFactory;
import factory.PlayerFactory;
import manager.EnemyManager;
import manager.GameObjectManager;
import manager.PlayerBulletManager;
import object.Player;

public class Run {
	
	private MyFrame myFrame;
	private Render render;
	private GameObjectManager manager;
	private GameObjectSpawn spawn;
	private Operation operation;
	
	public Run(){
		myFrame = new MyFrame(new JFrame());
		render = new Render(new ImageReader());
		manager = new GameObjectManager();
		spawn = new GameObjectSpawn(manager);
		operation = new Operation();
	}

	public final void runGame() {
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
		PlayerBulletFactory bulletFactory = new PlayerBulletFactory();
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
		PlayerBulletManager playerBulletManager = new PlayerBulletManager();
		EnemyManager enemyManager = new EnemyManager();
		
		while(true) {
			spawn.spawn(playerBulletManager, player);
			spawn.spawn(enemyManager, stage);
			operation.operation(player);
			manager.moveAllGameObjects();
			render.rendering();
			try {
				Thread.sleep(16);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
