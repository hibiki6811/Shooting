package object;

import process.Control;
import process.Controllable;
import process.Movable;
import process.Move;

public class Player extends GameObject implements Movable, Controllable{
	
	private int speed;
	private int bulletSpawnInterval;
	private int bulletSpawnCounter;
	private int numBullets;
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
		numBullets = 5;
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
	public final void move(Move move) {
		move.move(this);
	}
	
	@Override
	public void control(Control control) {
		control.control(this);
	}
	
	public final void setIsMovingUp(boolean isMovingUP) {
		this.isMovingUp = isMovingUP;
	}
	
	public final boolean getIsMovingUp() {
		return isMovingUp;
	}
	
	public final void setIsMovingDown(boolean isMovingDown) {
		this.isMovingDown = isMovingDown;
	}
	
	public final boolean getIsMovingDown() {
		return isMovingDown;
	}
	
	public final void setIsMovingLeft(boolean isMovingLeft) {
		this.isMovingLeft = isMovingLeft;
	}
	
	public final boolean getIsMovingLeft() {
		return isMovingLeft;
	}
	
	public final void setIsMovingRight(boolean isMovingRight) {
		this.isMovingRight = isMovingRight;
	}
	
	public final boolean getIsMovingRight() {
		return isMovingRight;
	}
	
	public final void setIsFire(boolean isFire) {
		this.isFire = isFire;
	}
	
	public final boolean getIsFire() {
		return isFire;
	}
	
	public final void setBulletSpawnInterval(int interval) {
		this.bulletSpawnInterval = interval;
	}
	
	public final int getBulletSpawnInterval(){
		return bulletSpawnInterval;
	}
	
	public final void addBulletSpawnCounter() {
		this.bulletSpawnCounter++;
	}
	
	public final void setBulletSpawnCounter(int count) {
		this.bulletSpawnCounter = count;
	}
	
	public final int getBulletSpawnCounter() {
		return bulletSpawnCounter;
	}
	
	public final int getNumBullets() {
		return numBullets;
	}
	
	public final void setSpeed(int speed) {
		this.speed = speed;
	}
	
	public final int getSpeed() {
		return speed;
	}

}
