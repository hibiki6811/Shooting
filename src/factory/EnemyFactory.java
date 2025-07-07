package factory;

import object.Enemy;
import object.GameObject;

public class EnemyFactory extends GameObjectFactory{
	
	private int count;

	@Override
	public final GameObject createGameObject() {
		count++;
		return new Enemy(count);
	}
	
}
