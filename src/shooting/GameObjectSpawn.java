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
	
	public GameObjectSpawn() {
		random = new Random();
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
		if(!bullet.isRenderable() && player.getBulletSpawnCounter() % player.getBulletSpawnInterval() == 0 && player.getIsFire()) {
			bullet.setX(player.getX() + 13);
			bullet.setY(player.getY());
			bullet.setIsRenderable(true);
			player.resetBulletSpawnCounter();
		}
	}
	
	public final void spawn(Enemy enemy) {
		if(!enemy.isRenderable() && stage.getEnemySpawnCounter() % stage.getEnemySpawnInterval() == 0) {
			enemy.setX(random.nextInt(750));
			enemy.setY(-100);
			enemy.setIsRenderable(true);
		}
	}
	

}
