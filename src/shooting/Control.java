package shooting;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import object.Player;

public class Control implements KeyListener{

	private final int NO_PRESSED_KEY = 0;
	private int pressedKeyCode;
	private int releasedKeyCode;
	private boolean isUpPressed;
	private boolean isDownPressed;
	private boolean isLeftPressed;
	private boolean isRightPressed;
	private boolean isSpacePressed;
	
	public Control(){
		pressedKeyCode = 0;
		releasedKeyCode = 0;
		isUpPressed = false;
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
		pressedKeyCode = e.getKeyCode();
		switch(pressedKeyCode) {
	        case KeyEvent.VK_UP:
	        	isUpPressed = true;
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
	        /*
			case KeyEvent.VK_W:
	        	isUpPressed = true;
	        	break;
	        case KeyEvent.VK_S:
	        	isDownPressed = true;
	        	break;
	        case KeyEvent.VK_A:
	        	isLeftPressed = true;
	        	break;
	        case KeyEvent.VK_D:
	        	isRightPressed = true;
	        	break;
	        case KeyEvent.VK_SPACE:
	        	isSpacePressed = true;
	        	break;
	        */
		}
	}

	@Override
	public final void keyReleased(KeyEvent e) {
		releasedKeyCode  = e.getKeyCode();
		 switch(releasedKeyCode) {
	        case KeyEvent.VK_UP:
	        	isUpPressed = false;
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
		 	/*
		 	case KeyEvent.VK_W:
	        	isUpPressed = false;
	        	break;
	        case KeyEvent.VK_S:
	        	isDownPressed = false;
	        	break;
	        case KeyEvent.VK_A:
	        	isLeftPressed = false;
	        	break;
	        case KeyEvent.VK_D:
	        	isRightPressed = false;
	        	break;
	        case KeyEvent.VK_SPACE:
	        	isSpacePressed = false;
	        	break;
	        */
	    }
	}
	
	public final void control(Player player) {
		if(isUpPressed) {
			if(!isDownPressed && !isLeftPressed && !isRightPressed) {
				player.setIsMovingUp(isUpPressed);
			}
		}else{
			player.setIsMovingUp(false);
		}
		if(isDownPressed) {
			if(!isUpPressed && !isLeftPressed && !isRightPressed) {
				player.setIsMovingDown(isDownPressed);
			}
		}else{
			player.setIsMovingDown(false);
		}
		if(isLeftPressed) {
			if(!isUpPressed && !isDownPressed && !isRightPressed) {
				player.setIsMovingLeft(isLeftPressed);
			}
		}else{
			player.setIsMovingLeft(false);
		}
		if(isRightPressed) {
			if(!isUpPressed && !isDownPressed && !isLeftPressed) {
				 player.setIsMovingRight(isRightPressed);
			}
		}else{
			player.setIsMovingRight(false);
		}
		player.setIsFire(isSpacePressed);
		 
		/*
	    player.setIsMovingUp(isUpPressed);
	    player.setIsMovingDown(isDownPressed);
	    player.setIsMovingLeft(isLeftPressed);
	    player.setIsMovingRight(isRightPressed);
	    player.setIsFire(isSpacePressed);
	    */
	}

}
