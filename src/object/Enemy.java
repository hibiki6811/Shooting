package object;

import java.util.Random;

public class Enemy extends GameObject {
	
	private Random random;
	
	public Enemy() {
		super("enemy", 0, -100, 40, 50, 2, "enemy");
		random = new Random();
	}
	
	@Override
	public final void initialize() {
		setIsRenderable(false);
		
	}
	
	@Override
	public final void move() {
		if(isRenderable()) {
			int y = getY();
			if(y >= 650) {
				y = -100;
				setIsRenderable(false);
			}else {
				y ++;
			}
			setY(y);
		}
	}

	public  final void spawn() {
		setX(random.nextInt(750));
		setIsRenderable(true);
		
	}

}
