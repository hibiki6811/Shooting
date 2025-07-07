package factory;

import object.GameObject;
import object.PlayerBullet;

public class PlayerBulletFactory extends GameObjectFactory{
	
	private int count;

	@Override
	public GameObject createGameObject() {
		count++;
		return new PlayerBullet(count);
	}

}
