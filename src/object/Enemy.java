package object;

import shooting.GameObjectSpawn;
import shooting.Spawnable;

public class Enemy extends GameObject implements Spawnable{
	
	public Enemy() {
		super("enemy", 0, -100, 40, 50, 3);
	}
	
	@Override
	public final void initialize() {
		setIsRenderable(false);
		
	}
	
	@Override
	public final void move() {
		if(isRenderable()) {
			int y = getY();
			if(y >= 650) {
				setIsRenderable(false);
			}else {
				y ++;
			}
			setY(y);
		}
	}

	@Override
	public  final void spawn(GameObjectSpawn spawn) {
		spawn.spawn(this);
	}

}
