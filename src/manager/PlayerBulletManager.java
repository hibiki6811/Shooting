package manager;

public class PlayerBulletManager {
	
	private int bulletSpawnCounter;
	
	public PlayerBulletManager() {
		bulletSpawnCounter = 0;
	}
	
	public final boolean isBulletSpawn(int bulletSpawnInterval, boolean isFire) {
		boolean isBulletSpawnInterval;
		if(isFire) {
			isBulletSpawnInterval = bulletSpawnCounter % bulletSpawnInterval == 0;
			bulletSpawnCounter++;
		}else {
			isBulletSpawnInterval = false;
			bulletSpawnCounter = 0;
		}
		return isBulletSpawnInterval;
	}
	
}
