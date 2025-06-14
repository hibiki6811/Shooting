package shooting2;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Stage {
	
	private Map<String, Integer> stageObjectInfo;
	private int count = 0;
	
	Stage(){
		stageObjectInfo = new HashMap<>();;
		stageObjectInfo.put("enemy", 10);
	}
	
	Stage(Map<String, Integer> stageObjectInfo){
		this.stageObjectInfo = stageObjectInfo;
	}
	
	final Map<String, Integer> getStageObjectInfo(){
		return stageObjectInfo;
	}
	
	final void gameSet(List<GameObject> objects) {
		for(GameObject object : objects) {
			switch(object.getType()){
			case "back":
				object.setIsRenderable(true);
				break;
			case "player":
				object.setIsRenderable(true);
				break;
			default:
				break;
			}
		}
	}
	
	final void gameFlow(List<GameObject> objects) {
		for(GameObject object : objects) {
			switch(object.getType()) {
			case "enemy":
				if(count >= 200) {
					if(!object.isRenderable()) {
						object.setIsRenderable(true);
						count = 0;
					}
				}
			}
			if(object.isRenderable()) {
				object.move();
			}
		}
		count ++;
	}
	
	
}
