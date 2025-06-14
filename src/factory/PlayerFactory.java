package factory;

import object.GameObject;
import object.Player;

public class PlayerFactory extends GameObjectFactory{

	@Override
	public final GameObject createGameObject() {
		return new Player();
	}
	
}
