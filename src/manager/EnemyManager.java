package manager;

public class EnemyManager {
	
	private int enemySpawnCounter;
	
	public EnemyManager() {
		enemySpawnCounter = 0;
	}
	
	public final boolean isEnemySpawn(int enemySpawnInterval) {
		boolean isEnemySpawn = enemySpawnCounter % enemySpawnInterval == 0;
		enemySpawnCounter++;
		return isEnemySpawn;
	}
}
