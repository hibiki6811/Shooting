package shooting;

import java.util.Random;

import manager.EnemyManager;
import manager.GameObjectManager;
import object.Enemy;
import object.GameObject;
import object.Player;
import object.PlayerBullet;

public class GameObjectSpawn {
	
	private Player player;
	private Random random;
	
	public GameObjectSpawn() {
		random = new Random();
	}
	
	public void initialize(GameObjectManager manager) {
		for(GameObject object : manager.getGameObjects()) {
			if(object instanceof Player) {
				player = (Player)object;
				
			}
		}
	}
	
	public final void spawn(PlayerBullet bullet) {
		if(player.getBulletSpawnCounter() % player.getBulletSpawnInterval() == 0) {
			bullet.setX(player.getX() + 13);
			bullet.setY(player.getY());
			bullet.setIsRenderable(true);
		}
	}
	
	public final void spawn(EnemyManager enemyManager, Stage stage) {
		if(enemyManager.isEnemySpawn(stage.getEnemySpawnInterval())) {
			for(GameObject object : manager.getGameObjects()) {
				if(object instanceof Enemy && !object.isRenderable()) {
					Enemy enemy = (Enemy)object;
					enemy.spawn(-100, random.nextInt(750));
					break;
				}
			}
		}
	}
	

}
