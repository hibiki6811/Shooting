package shooting;

import java.util.Random;

import manager.EnemyManager;
import manager.GameObjectManager;
import manager.PlayerBulletManager;
import object.Enemy;
import object.GameObject;
import object.Player;
import object.PlayerBullet;

public class GameObjectSpawn {
	
	private GameObjectManager manager;
	private Random random;
	
	public GameObjectSpawn(GameObjectManager manager) {
		this.manager = manager;
		random = new Random();
	}
	
	public final void spawn(PlayerBulletManager playerBulletManager, Player player) {
		if(playerBulletManager.isBulletSpawn(player.getBulletSpawnInterval(), player.getIsFire())) {
			for(GameObject object : manager.getGameObjects()) {
				if(object instanceof PlayerBullet && !object.isRenderable()) {
					PlayerBullet bullet = (PlayerBullet)object;
					bullet.spawn(player.getX(), player.getY());
					break;
				}
			}
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
