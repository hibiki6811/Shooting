package shooting;

import java.util.HashMap;
import java.util.Map;

class Stage {
	
	private Map<String, Integer> stageObjectInfo;
	private int enemySpawnCounter;
	private int enemySpawnInterval;
	
	Stage(){
		stageObjectInfo = new HashMap<>();;
		stageObjectInfo.put("enemy", 10);
		enemySpawnCounter = 0;
		enemySpawnInterval = 200;
	}
	
	Stage(Map<String, Integer> stageObjectInfo){
		this.stageObjectInfo = stageObjectInfo;
	}
	
	final Map<String, Integer> getStageObjectInfo(){
		return stageObjectInfo;
	}
	
	final boolean isEnemySpawn() {
		boolean isEnemySpawn = enemySpawnCounter % enemySpawnInterval == 0;
		enemySpawnCounter++;
		return isEnemySpawn;
	}
	
}
