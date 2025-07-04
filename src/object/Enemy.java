package object;

public class Enemy extends GameObject {
	
	public Enemy() {
		super("enemy", 0, -100, 40, 50, 3);
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
				setIsRenderable(false);
			}else {
				y ++;
			}
			setY(y);
		}
	}

	public  final void spawn(int x, int y) {
		setY(x);
		setX(y);
		setIsRenderable(true);
	}

}
