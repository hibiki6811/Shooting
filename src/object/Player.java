package object;

public class Player extends GameObject{
	
	public Player(){
		super("player", 500,300, 40, 50, 2);
	}

	@Override
	public void move() {
		
		
	}

	@Override
	public void initialize() {
		setIsRenderable(true);
		
	}

}
