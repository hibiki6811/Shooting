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
	private boolean aaa;
	
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
	
	final void operation(Player player) {
		if(isUpPressed) {
			if(!isDownPressed && !isLeftPressed && !isRightPressed) {
				 player.setIsMovingUp(isUpPressed);
			 }
		}else if(!isUpPressed){
			 player.setIsMovingUp(false);
		}
		if(isDownPressed) {
			if(!isUpPressed && !isLeftPressed && !isRightPressed) {
				 player.setIsMovingDown(isDownPressed);
			 }
		}else if(!isDownPressed) {
			 player.setIsMovingDown(false);
		}
		if(isLeftPressed) {
			if(!isUpPressed && !isDownPressed && !isRightPressed) {
				 player.setIsMovingLeft(isLeftPressed);
			 }
		}else if(!isLeftPressed) {
			 player.setIsMovingLeft(false);
		}
		if(isRightPressed) {
			if(!isUpPressed && !isDownPressed && !isLeftPressed) {
				 player.setIsMovingRight(isRightPressed);
			 }
		}else if(!isRightPressed) {
			 player.setIsMovingRight(false);
		}
		player.setIsFire(isSpacePressed);
		
		/*
		 if(pressedKeyCode == KeyEvent.VK_UP && !isDownPressed && !isLeftPressed && !isRightPressed) {
			 player.setIsMovingUp(isUpPressed);
		 }
		 if(releasedKeyCode == KeyEvent.VK_UP) {
			 player.setIsMovingUp(false);
			 releasedKeyCode = NO_PRESSED_KEY;
		 }
		 if(pressedKeyCode == KeyEvent.VK_DOWN && !isUpPressed && !isLeftPressed && !isRightPressed) {
			 player.setIsMovingDown(isDownPressed);
		 }
		 if(releasedKeyCode == KeyEvent.VK_DOWN) {
			 player.setIsMovingDown(false);
			 releasedKeyCode = NO_PRESSED_KEY;
		 }
		 if(pressedKeyCode == KeyEvent.VK_LEFT && !isUpPressed && !isDownPressed && !isRightPressed) {
			 player.setIsMovingLeft(isLeftPressed);
		 }
		 if(releasedKeyCode == KeyEvent.VK_LEFT) {
			 player.setIsMovingLeft(false);
			 releasedKeyCode = NO_PRESSED_KEY;
		 }
		 if(pressedKeyCode == KeyEvent.VK_RIGHT && !isUpPressed && !isDownPressed && !isLeftPressed) {
			 player.setIsMovingRight(isRightPressed);
		 }
		 if(releasedKeyCode == KeyEvent.VK_RIGHT) {
			 player.setIsMovingRight(false);
			 releasedKeyCode = NO_PRESSED_KEY;
		 }
		 if(pressedKeyCode == KeyEvent.VK_SPACE) {
			 player.setIsFire(isSpacePressed);
		 }
		 if(releasedKeyCode == KeyEvent.VK_SPACE) {
			 player.setIsFire(false);
			 releasedKeyCode = NO_PRESSED_KEY;
		 }
		 */
		 
		/*
	    player.setIsMovingUp(isUpPressed);
	    player.setIsMovingDown(isDownPressed);
	    player.setIsMovingLeft(isLeftPressed);
	    player.setIsMovingRight(isRightPressed);
	    player.setIsFire(isSpacePressed);
	    */
	}

}
