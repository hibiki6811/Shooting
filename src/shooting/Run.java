package shooting;

import javax.swing.JFrame;

import factory.BackFactory;
import factory.EnemyFactory;
import factory.PlayerBulletFactory;
import factory.PlayerFactory;
import manager.GameObjectManager;
import object.GameObject;

public class Run {
	
	private MyFrame myFrame;
	private Render render;
	private GameObjectManager manager;
	private GameObjectSpawn spawn;
	private Control control;
	
	public Run(){
		myFrame = new MyFrame(new JFrame());
		render = new Render(new ImageReader());
		manager = new GameObjectManager();
		spawn = new GameObjectSpawn();
		control = new Control();
	}

	public final void runGame() {
		myFrame.createFrame();
		myFrame.setPanel(render.getPanel());
		myFrame.setOperation(control);
		
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
		spawn.initialize(manager, stage);
		
		while(true) {
			for(GameObject object : manager.getGameObjects()) {
				if(object instanceof Spawnable) {
					Spawnable spawnObject = (Spawnable)object;
					spawnObject.spawn(spawn);
				}
				if(object instanceof Controllable) {
					Controllable controlObject = (Controllable)object;
					controlObject.control(control);
				}
			}
			stage.addEnemySpaenCounter();
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
