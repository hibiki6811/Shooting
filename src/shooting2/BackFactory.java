package shooting2;

class BackFactory extends GameObjectFactory{

	@Override
	GameObject createGameObject() {
		return new Back();
	}
	
	

}
