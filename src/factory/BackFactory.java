package factory;

import object.Back;
import object.GameObject;

public class BackFactory extends GameObjectFactory{

	@Override
	public final GameObject createGameObject() {
		return new Back();
	}
	
	

}
