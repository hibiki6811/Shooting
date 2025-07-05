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
	private int bulletSpawnRoopCount;
	private int enemySpawnRoopCount;
	private boolean isBulletSpawnable;
	private boolean isEnemySpawnable;
	
	public GameObjectSpawn() {
		random = new Random();
		isBulletSpawnable = true;
		isEnemySpawnable = true;
	}
	
	public void initialize(GameObjectManager manager, Stage stage) {
		for(GameObject object : manager.getGameObjects()) {
			if(object instanceof Player) {
				player = (Player)object;
				
			}
		}
		this.stage = stage;
	}
	
	public final void spawn(PlayerBullet bullet, RoopCount count) {
		if(isBulletSpawnable && !bullet.isRenderable() && player.getBulletSpawnCounter() % player.getBulletSpawnInterval() == 0 && player.getIsFire()) {
			bullet.setX(player.getX() + 13);
			bullet.setY(player.getY());
			bullet.setIsRenderable(true);
			isBulletSpawnable = false;
			bulletSpawnRoopCount = count.getRoopCount();
		}else if(!isBulletSpawnable && bulletSpawnRoopCount != count.getRoopCount()) {
			isBulletSpawnable = true;
			bulletSpawnRoopCount = count.getRoopCount();
			spawn(bullet, count);
		}
	}
	
	public final void spawn(Enemy enemy, RoopCount count) {
		if(isEnemySpawnable && !enemy.isRenderable() && stage.getEnemySpawnCounter() % stage.getEnemySpawnInterval() == 0) {
			enemy.setX(random.nextInt(750));
			enemy.setY(-100);
			enemy.setIsRenderable(true);
			isEnemySpawnable = false;
			enemySpawnRoopCount = count.getRoopCount();
		}else if(!isEnemySpawnable && enemySpawnRoopCount != count.getRoopCount()) {
			isEnemySpawnable = true;
			enemySpawnRoopCount = count.getRoopCount();
			spawn(enemy, count);
		}
	}
	

}
