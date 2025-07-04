package object;

import shooting.Control;
import shooting.Controllable;

public class Player extends GameObject implements Controllable{
	
	private int speed;
	private int bulletSpawnInterval;
	private int bulletSpawnCounter;
	private boolean isFire;
	private boolean isMovingUp;
	private boolean isMovingDown;
	private boolean isMovingLeft;
	private boolean isMovingRight;
	
	public Player(){
		super("player", 370,500, 40, 50, 3);
		speed = 5;
		bulletSpawnInterval = 30;
		bulletSpawnCounter = 0;
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
			if(isFire) {
				bulletSpawnCounter++;
			}else {
				bulletSpawnCounter = 0;
			}
			setX(x);
			setY(y);
		}
	}
	
	@Override
	public void control(Control control) {
		control.control(this);
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
	
	public final int getBulletSpawnCounter() {
		return bulletSpawnCounter;
	}

}
