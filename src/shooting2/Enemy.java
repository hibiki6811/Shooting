package shooting2;

class Enemy extends GameObject{
	
	Enemy() {
		super("enemy", 0, -100, 40, 50, 2, "enemy");
	}
	
	@Override
	final void move() {
		int y = getY();
		y ++;
		setY(y);
	}
	
	@Override
	final void initialize() {
		
	}

}
