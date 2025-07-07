package shooting;

import java.util.Random;

import manager.GameObjectManager;
import object.Enemy;
import object.GameObject;
import object.Player;
import object.PlayerBullet;

public class GameObjectSpawn {
	
	private Player player;
	private Stage stage;
	private Random random;
	private boolean isBulletSpawn;
	private boolean isEnemySpawn;
	
	public GameObjectSpawn() {
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
		if(player.getBulletSpawnCounter() % player.getBulletSpawnInterval() != 0) return;
		if(!player.getIsFire()) return;
		if(bullet.isRenderable()) {
			if(bullet.getNum() == stage.getNumEnemies()) {
				isBulletSpawn = true;
			}
		}else {
			if(isBulletSpawn) {
				bullet.setX(player.getX() + 13);
				bullet.setY(player.getY());
				bullet.setIsRenderable(true);
				isBulletSpawn = false;
			}
			if(bullet.getNum() == player.getNumBullets()) {
				isBulletSpawn = true;
			}
		}
	}
	
	public final void spawn(Enemy enemy) {
		if(stage.getEnemySpawnCounter() % stage.getEnemySpawnInterval() != 0) return;
		if(enemy.isRenderable()) {
			if(enemy.getNum() == stage.getNumEnemies()) {
				isEnemySpawn = true;
			}
		}else {
			if(isEnemySpawn) {
				enemy.setX(random.nextInt(750));
				enemy.setY(-100);
				enemy.setIsRenderable(true);
				isEnemySpawn = false;
			}
			if(enemy.getNum() == stage.getNumEnemies()) {
				isEnemySpawn = true;
			}
		}
	}
	
}
