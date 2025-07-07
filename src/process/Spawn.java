package process;

import java.util.Random;

import manager.GameObjectManager;
import object.Enemy;
import object.GameObject;
import object.Player;
import object.PlayerBullet;
import shooting.Stage;

public class Spawn {
	
	private Player player;
	private Stage stage;
	private Random random;
	private boolean isBulletSpawn;
	private boolean isEnemySpawn;
	
	public Spawn() {
		random = new Random();
		isBulletSpawn = true;
		isEnemySpawn = true;
	}
	
	public void initialize(GameObjectManager manager, Stage stage) {
		for(GameObject object : manager.getGameObjects()) {
			if(object instanceof Player) {
				player = (Player)object;
				
			}
		}
		this.stage = stage;
	}
	
	public final void spawn(PlayerBullet bullet) {
		if(!player.getIsFire()) return;
		if(player.getBulletSpawnCounter() % player.getBulletSpawnInterval() != 0) return;
		if(isBulletSpawn && !bullet.isRenderable()) {
			setSpawnPoint(bullet, player.getX() + 13,  player.getY());
			isBulletSpawn = false;
		}
		if(bullet.getNum() == player.getNumBullets()) {
			isBulletSpawn = true;
		}
	}
	
	public final void spawn(Enemy enemy) {
		if(stage.getEnemySpawnCounter() % stage.getEnemySpawnInterval() != 0) return;
		if(isEnemySpawn && !enemy.isRenderable()) {
			setSpawnPoint(enemy, random.nextInt(750), -100);
			isEnemySpawn = false;
		}
		if(enemy.getNum() == stage.getNumEnemies()) {
			isEnemySpawn = true;
		}
	}
	
	private final void setSpawnPoint(GameObject object, int x, int y) {
		object.setX(x);
		object.setY(y);
		object.setIsRenderable(true);
	}
	
}
