package shooting;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import object.Player;

public class Operation implements KeyListener{
	
	private final int NOT_ENTERED = 0;
	private int keyCode;
	
	Operation(){
		keyCode = NOT_ENTERED;
	}

	@Override
	public void keyTyped(KeyEvent e) {
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		keyCode = e.getKeyCode();
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		keyCode = NOT_ENTERED;
	}
	
	public void operation(Player player) {
		switch(keyCode) {
		case KeyEvent.VK_UP:
			player.moveUp();
			break;
		case KeyEvent.VK_DOWN:
			player.moveDown();
			break;
		case KeyEvent.VK_LEFT:
			player.moveLeft();
			break;
		case KeyEvent.VK_RIGHT:
			player.moveRight();
			break;
		case NOT_ENTERED:
			break;
		}
	}

}
