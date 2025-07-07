package process;

import object.Enemy;
import object.Player;
import object.PlayerBullet;

public class Move {
	
	public final void move(Player player) {
		if(player.isRenderable()) {
			int x = player.getX();
			int y = player.getY();
			if(player.getIsMovingUp()) {
				y = y - player.getSpeed();
			}
			if(player.getIsMovingDown()) {
				y = y + player.getSpeed();
			}
			if(player.getIsMovingLeft()) {
				x = x - player.getSpeed();
			}
			if(player.getIsMovingRight()) {
				x = x + player.getSpeed();
			}
			if(player.getIsFire()) {
				player.addBulletSpawnCounter();
			}else {
				player.setBulletSpawnCounter(0);
			}
			player.setX(x);
			player.setY(y);
		}
	}
	
	public final void move(PlayerBullet bullet) {
		if(bullet.isRenderable()) {
			int y = bullet.getY();
			if(y <= -50) {
				bullet.setIsRenderable(false);
			}else {
				y = y - bullet.getSpeed();
			}
			bullet.setY(y);
		}
	}
	
	public final void move(Enemy enemy) {
		if(enemy.isRenderable()) {
			int y = enemy.getY();
			if(y >= 650) {
				enemy.setIsRenderable(false);
			}else {
				y ++;
			}
			enemy.setY(y);
		}
	}

}
