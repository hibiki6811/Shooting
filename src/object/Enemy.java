package object;

public class Enemy extends GameObject{
	
	public Enemy() {
		super("enemy", 0, -100, 40, 50, 2, "enemy");
	}
	
	@Override
	public final void move() {
		int y = getY();
		y ++;
		setY(y);
	}
	
	@Override
	public final void initialize() {
		setIsRenderable(false);
		
	}

}
