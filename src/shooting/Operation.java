package shooting;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import object.Player;

public class Operation implements KeyListener{

	private boolean upPressed;
	private boolean isDownPressed;
	private boolean isLeftPressed;
	private boolean isRightPressed;
	private boolean isSpacePressed;
	
	Operation(){
		upPressed = false;
		isDownPressed = false;
		isLeftPressed = false;
		isRightPressed = false;
		isSpacePressed = false;
	}

	@Override
	public final void keyTyped(KeyEvent e) {
		
	}

	@Override
	public final void keyPressed(KeyEvent e) {
		switch(e.getKeyCode()) {
	        case KeyEvent.VK_UP:
	        	upPressed = true;
	        	break;
	        case KeyEvent.VK_DOWN:
	        	isDownPressed = true;
	        	break;
	        case KeyEvent.VK_LEFT:
	        	isLeftPressed = true;
	        	break;
	        case KeyEvent.VK_RIGHT:
	        	isRightPressed = true;
	        	break;
	        case KeyEvent.VK_SPACE:
	        	isSpacePressed = true;
	        	break;
		}
	}

	@Override
	public final void keyReleased(KeyEvent e) {
		 switch(e.getKeyCode()) {
	        case KeyEvent.VK_UP:
	        	upPressed = false;
	        	break;
	        case KeyEvent.VK_DOWN:
	        	isDownPressed = false;
	        	break;
	        case KeyEvent.VK_LEFT:
	        	isLeftPressed = false;
	        	break;
	        case KeyEvent.VK_RIGHT:
	        	isRightPressed = false;
	        	break;
	        case KeyEvent.VK_SPACE:
	        	isSpacePressed = false;
	        	break;
	    }
	}
	
	final void operation(Player player) {
	    player.setIsMovingUp(upPressed);
	    player.setIsMovingDown(isDownPressed);
	    player.setIsMovingLeft(isLeftPressed);
	    player.setIsMovingRight(isRightPressed);
	    player.setIsFire(isSpacePressed);
	}

}
