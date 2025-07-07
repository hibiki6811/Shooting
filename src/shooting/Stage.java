package shooting;

import java.util.HashMap;
import java.util.Map;

public class Stage {
	
	private Map<String, Integer> stageObjectInfo;
	private int enemySpawnInterval;
	private int enemySpawnCounter;
	private int numEnemies;
	
	public Stage(){
		stageObjectInfo = new HashMap<>();;
		stageObjectInfo.put("enemy", 10);
		enemySpawnInterval = 200;
		enemySpawnCounter = 0;
		numEnemies = 5;
	}
	
	public Stage(Map<String, Integer> stageObjectInfo){
		this.stageObjectInfo = stageObjectInfo;
	}
	
	public final Map<String, Integer> getStageObjectInfo(){
		return stageObjectInfo;
	}
	
	public final int getEnemySpawnInterval() {
		return enemySpawnInterval;
	}
	
	public final void addEnemySpaenCounter() {
		enemySpawnCounter++;
	}
	
	public final int getEnemySpawnCounter() {
		return enemySpawnCounter;
	}
	
	public final int getNumEnemies() {
		return numEnemies;
	}
	
}
