package object;

import process.Movable;
import process.Move;
import process.Spawn;
import process.Spawnable;

public class PlayerBullet extends GameObject implements Movable, Spawnable{

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
	public void move(Move move) {
		move.move(this);
	}
	
	@Override
	public void spawn(Spawn spawn) {
		spawn.spawn(this);	
	}
	
	public final void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public final int getSpeed() {
		return speed;
	}
	
	public final int getNum() {
		return num;
	}

}
