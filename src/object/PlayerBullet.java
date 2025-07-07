package object;

import process.Spawn;
import process.Spawnable;

public class PlayerBullet extends GameObject implements Spawnable{

	private int num;
	private int speed;

	public PlayerBullet(int num) {
		super("bullet", 0, 0, 15, 40, 2);
		this.num = num;
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
	public void spawn(Spawn spawn) {
		spawn.spawn(this);	
	}
	
	public final int getNum() {
		return num;
	}

}
