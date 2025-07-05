package shooting;

import java.util.HashMap;
import java.util.Map;

public class Stage {
	
	private Map<String, Integer> stageObjectInfo;
	private int enemySpawnInterval;
	private int enemySpawnCounter;
	
	public Stage(){
		stageObjectInfo = new HashMap<>();;
		stageObjectInfo.put("enemy", 10);
		enemySpawnInterval = 200;
		enemySpawnCounter = 0;
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
	
	public int getEnemySpawnCounter() {
		return enemySpawnCounter;
	}
	
}
