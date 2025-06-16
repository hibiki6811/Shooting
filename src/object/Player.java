package object;

public class Player extends GameObject{
	
	private int speed;
	
	public Player(){
		super("player", 500,300, 40, 50, 2);
		speed = 5;
	}

	@Override
	public void move() {
		
	}
	
	public void moveUp() {
		int y = getY();
		y = y - speed;
		setY(y);
	}
	
	public void moveDown() {
		int y = getY();
		y = y + speed;
		setY(y);
	}
	
	public void moveLeft() {
		int x = getX();
		x = x - speed;
		setX(x);
	}
	
	public void moveRight() {
		int x = getX();
		x = x + speed;
		setX(x);
	}

	@Override
	public void initialize() {
		setIsRenderable(true);
		
	}

}
