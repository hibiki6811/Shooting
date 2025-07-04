package manager;

import java.util.ArrayList;
import java.util.List;

import object.PlayerBullet;

public class PlayerBulletManager {
	
	private List<PlayerBullet> Bullets;
	private int bulletSpawnCounter;
	
	public PlayerBulletManager() {
		Bullets = new ArrayList<>();
		bulletSpawnCounter = 0;
	}
	
	public final void addPlayerBullet(PlayerBullet bullet) {
		Bullets.add(bullet);
	}
	
	public final List<PlayerBullet> getPlayerBullets() {
		return Bullets;
	}
	
}
