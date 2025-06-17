package shooting;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import object.Player;

public class Operation implements KeyListener{

	private final int NO_PRESSED_KEY = 0;
	private int pressedKeyCode;
	private int releasedKeyCode;
	private boolean isUpPressed;
	private boolean isDownPressed;
	private boolean isLeftPressed;
	private boolean isRightPressed;
	private boolean isSpacePressed;
	
	Operation(){
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
	    }
	}
	
	final void operation(Player player) {
		/*
		 if(pressedKeyCode == KeyEvent.VK_UP) {
			player.setIsMovingUp(true);
		}
		 if(pressedKeyCode == KeyEvent.VK_DOWN) {
			  player.setIsMovingDown(true);
		}*/
		 if(pressedKeyCode == KeyEvent.VK_LEFT) {
			 player.setIsMovingLeft(true);
			 player.setIsMovingRight(false);
			 if(releasedKeyCode == KeyEvent.VK_LEFT) {
				 player.setIsMovingLeft(false);
				 if(isRightPressed) {
					 pressedKeyCode = KeyEvent.VK_RIGHT;
					 releasedKeyCode = NO_PRESSED_KEY;
				 }else {
					 pressedKeyCode = NO_PRESSED_KEY;
					 releasedKeyCode = NO_PRESSED_KEY;
				 }
				 
			 }else {
				 releasedKeyCode = NO_PRESSED_KEY;
			 }
		}
		 if(pressedKeyCode == KeyEvent.VK_RIGHT) {
			 player.setIsMovingRight(true);
			 player.setIsMovingLeft(false);
			 if(releasedKeyCode == KeyEvent.VK_RIGHT) {
				 player.setIsMovingRight(false);
				 if(isLeftPressed) {
					 pressedKeyCode = KeyEvent.VK_LEFT;
					 releasedKeyCode = NO_PRESSED_KEY;
				 }else {
					 pressedKeyCode = NO_PRESSED_KEY;
					 releasedKeyCode = NO_PRESSED_KEY;
				 }
			 }else {
				 releasedKeyCode = NO_PRESSED_KEY;
			 }
		}
		/*
	    player.setIsMovingUp(upPressed);
	    player.setIsMovingDown(isDownPressed);
	    player.setIsMovingLeft(isLeftPressed);
	    player.setIsMovingRight(isRightPressed);
	    player.setIsFire(isSpacePressed);
	    */
	}

}
