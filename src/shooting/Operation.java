package shooting;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import object.Player;

public class Operation implements KeyListener{
	
	private final int NOT_ENTERED = 0;
	private int keyCode;
	private boolean isKeyPressed;
	
	Operation(){
		keyCode = NOT_ENTERED;
		isKeyPressed = false;
	}

	@Override
	public final void keyTyped(KeyEvent e) {
		
	}

	@Override
	public final void keyPressed(KeyEvent e) {
		keyCode = e.getKeyCode();
		isKeyPressed = true;
	}

	@Override
	public final void keyReleased(KeyEvent e) {
		keyCode = e.getKeyCode();
		isKeyPressed = false;
	}
	
	final void operation(Player player) {
		if(isKeyPressed) {
			switch(keyCode) {
			case KeyEvent.VK_UP:
				player.setIsMovingUp(true);
				player.setIsMovingDown(false);
				player.setIsMovingLeft(false);
				player.setIsMovingRight(false);
				break;
			case KeyEvent.VK_DOWN:
				player.setIsMovingDown(true);
				player.setIsMovingUp(false);
				player.setIsMovingLeft(false);
				player.setIsMovingRight(false);
				break;
			case KeyEvent.VK_LEFT:
				player.setIsMovingLeft(true);
				player.setIsMovingUp(false);
				player.setIsMovingDown(false);
				player.setIsMovingRight(false);
				break;
			case KeyEvent.VK_RIGHT:
				player.setIsMovingRight(true);
				player.setIsMovingUp(false);
				player.setIsMovingDown(false);
				player.setIsMovingLeft(false);
				break;
			case KeyEvent.VK_SPACE:
				player.setIsFire(true);
				break;
			case NOT_ENTERED:
				break;
			}
		}else {
			switch(keyCode) {
			case KeyEvent.VK_UP:
				player.setIsMovingUp(false);
				break;
			case KeyEvent.VK_DOWN:
				player.setIsMovingDown(false);
				break;
			case KeyEvent.VK_LEFT:
				player.setIsMovingLeft(false);
				break;
			case KeyEvent.VK_RIGHT:
				player.setIsMovingRight(false);
				break;
			case KeyEvent.VK_SPACE:
				player.setIsFire(false);
				break;
			case NOT_ENTERED:
				break;
			}
		}
		
		/*
		if(keyCode == KeyEvent.VK_SPACE) {
			if(isKeyPressed) {
				player.setIsFire(true);
			}else {
				player.setIsFire(false);
			}
		}else {
			player.setIsFire(false);
		}
		*/
	}

}
