package object;

public class PlayerBullet extends GameObject{
	
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
	
	public void spawn(int x, int y) {
			setX(x + 13);
			setY(y);
			setIsRenderable(true);
	}
	
	

}
