package object;

public class Player extends GameObject{
	
	public Player(){
		super("player", 500,300, 40, 50, 2);
	}

	@Override
	public void move() {
		
	}
	
	public void moveUp() {
		int y = getY();
		y = y - 10;
		setY(y);
	}
	
	public void moveDown() {
		int y = getY();
		y = y + 10;
		setY(y);
	}
	
	public void moveLeft() {
		int x = getX();
		x = x - 10;
		setX(x);
	}
	
	public void moveRight() {
		int x = getX();
		x = x + 10;
		setX(x);
	}

	@Override
	public void initialize() {
		setIsRenderable(true);
		
	}

}
