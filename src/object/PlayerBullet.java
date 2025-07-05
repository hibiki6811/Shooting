package object;

import shooting.GameObjectSpawn;
import shooting.RoopCount;
import shooting.Spawnable;

public class PlayerBullet extends GameObject implements Spawnable{
	
	private int speed;

	public PlayerBullet() {
		super("bullet", 0, 0, 15, 40, 2);
		speed = 7;
	}

	@Override
	public void initialize() {
		setIsRenderable(false);
		
	}

	@Override
	public void move() {
		if(isRenderable()) {
			int y = getY();
			if(y <= -50) {
				setIsRenderable(false);
			}else {
				y = y - speed;
			}
			setY(y);
		}
		
	}
	
	@Override
	public void spawn(GameObjectSpawn spawn, RoopCount count) {
		spawn.spawn(this, count);	
	}
	
	

}
