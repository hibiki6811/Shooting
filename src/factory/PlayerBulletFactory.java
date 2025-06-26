package factory;

import object.PlayerBullet;
import object.GameObject;

public class PlayerBulletFactory extends GameObjectFactory{

	@Override
	public GameObject createGameObject() {
		return new PlayerBullet();
	}

}
