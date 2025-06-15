package factory;

import object.GameObject;
import object.Player;

public class PlayerFactory extends GameObjectFactory{
	
	private Player player;

	@Override
	public final GameObject createGameObject() {
		player = new Player();
		return player;
	}
	
	public final Player getObject() {
		return player;
	}
	
}
