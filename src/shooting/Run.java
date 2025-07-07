package shooting;

import javax.swing.JFrame;

import factory.BackFactory;
import factory.EnemyFactory;
import factory.PlayerBulletFactory;
import factory.PlayerFactory;
import manager.GameObjectManager;
import object.GameObject;
import process.Control;
import process.Controllable;
import process.Movable;
import process.Move;
import process.Spawn;
import process.Spawnable;

public class Run {
	
	private MyFrame myFrame;
	private Render render;
	private GameObjectManager manager;
	private Move move;
	private Spawn spawn;
	private Control control;
	
	public Run(){
		myFrame = new MyFrame(new JFrame());
		render = new Render(new ImageReader());
		manager = new GameObjectManager();
		move = new Move();
		spawn = new Spawn();
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
				if(object instanceof Movable) {
					Movable movableObject = (Movable)object;
					movableObject.move(move);
				}
			}
			stage.addEnemySpaenCounter();
			render.rendering();
			try {
				Thread.sleep(16);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
}
