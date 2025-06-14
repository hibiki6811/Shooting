package shooting;

import java.util.HashMap;
import java.util.Map;

class Stage {
	
	private Map<String, Integer> stageObjectInfo;
	private int enemyCount;
	private int enemyInterval;
	
	Stage(){
		stageObjectInfo = new HashMap<>();;
		stageObjectInfo.put("enemy", 10);
		enemyCount = 0;
		enemyInterval = 200;
	}
	
	Stage(Map<String, Integer> stageObjectInfo){
		this.stageObjectInfo = stageObjectInfo;
	}
	
	final Map<String, Integer> getStageObjectInfo(){
		return stageObjectInfo;
	}
	
	final boolean isEnemyInterval(int count) {
		return count >= enemyCount;
	}
	
	final void updateEnemyCount() {
		enemyCount = enemyCount + enemyInterval;
	}
	
	
}
