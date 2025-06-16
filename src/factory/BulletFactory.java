package factory;

import object.Bullet;
import object.GameObject;

public class BulletFactory extends GameObjectFactory{

	@Override
	public GameObject createGameObject() {
		return new Bullet();
	}

}
