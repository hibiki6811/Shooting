package factory;

import object.Enemy;
import object.GameObject;

public class EnemyFactory extends GameObjectFactory{

	@Override
	public final GameObject createGameObject() {
		return new Enemy();
	}
	
}
