package object;

import process.Movable;
import process.Move;
import process.Spawn;
import process.Spawnable;

public class Enemy extends GameObject implements Movable, Spawnable{
	
	private int num;
	
	public Enemy(int num) {
		super("enemy", 0, -100, 40, 50, 3);
		this.num = num;
	}
	
	@Override
	public final void initialize() {
		setIsRenderable(false);
		
	}
	
	@Override
	public final void move(Move move) {
		move.move(this);
	}

	@Override
	public  final void spawn(Spawn spawn) {
		spawn.spawn(this);
	}
	
	public final int getNum() {
		return num;
	}

}
