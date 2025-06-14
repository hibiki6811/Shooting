package shooting2;

public class PlayerFactory extends GameObjectFactory{

	@Override
	GameObject createGameObject() {
		return new Player();
	}
	
}
