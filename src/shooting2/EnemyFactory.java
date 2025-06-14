package shooting2;

class EnemyFactory extends GameObjectFactory{

	@Override
	final GameObject createGameObject() {
		return new Enemy();
	}
	
}
