package object;

public class Player extends GameObject{
	
	private int speed;
	private int bulletSpawnInterval;
	private boolean isFire;
	private boolean isMovingUp;
	private boolean isMovingDown;
	private boolean isMovingLeft;
	private boolean isMovingRight;
	
	public Player(){
		super("player", 370,500, 40, 50, 3);
		speed = 5;
		bulletSpawnInterval = 30;
		isFire = false;
		isMovingUp = false;
		isMovingDown = false;
		isMovingLeft = false;
		isMovingRight = false;
	}
	
	@Override
	public final void initialize() {
		setIsRenderable(true);
		
	}

	@Override
	public final void move() {
		if(isRenderable()) {
			int x = getX();
			int y = getY();
			if(isMovingUp) {
				y = y - speed;
			}
			if(isMovingDown) {
				y = y + speed;
			}
			if(isMovingLeft) {
				x = x - speed;
			}
			if(isMovingRight) {
				x = x + speed;
			}
			setX(x);
			setY(y);
		}
	}
	
	public final void setIsMovingUp(boolean isMovingUP) {
		this.isMovingUp = isMovingUP;
	}
	
	public final void setIsMovingDown(boolean isMovingDown) {
		this.isMovingDown = isMovingDown;
	}
	
	public final void setIsMovingLeft(boolean isMovingLeft) {
		this.isMovingLeft = isMovingLeft;
	}
	
	public final void setIsMovingRight(boolean isMovingRight) {
		this.isMovingRight = isMovingRight;
	}
	
	public final void setIsFire(boolean isFire) {
		this.isFire = isFire;
	}
	
	public final boolean getIsFire() {
		return isFire;
	}
	
	public final int getBulletSpawnInterval(){
		return bulletSpawnInterval;
	}

}
