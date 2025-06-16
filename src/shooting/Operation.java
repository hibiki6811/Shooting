package shooting;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import object.Player;

public class Operation implements KeyListener{

	private boolean upPressed;
	private boolean downPressed;
	private boolean leftPressed;
	private boolean rightPressed;
	private boolean spacePressed;
	
	Operation(){
		upPressed = false;
		downPressed = false;
		leftPressed = false;
		rightPressed = false;
		spacePressed = false;
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
	        	downPressed = true;
	        	break;
	        case KeyEvent.VK_LEFT:
	        	leftPressed = true;
	        	break;
	        case KeyEvent.VK_RIGHT:
	        	rightPressed = true;
	        	break;
	        case KeyEvent.VK_SPACE:
	        	spacePressed = true;
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
	        	downPressed = false;
	        	break;
	        case KeyEvent.VK_LEFT:
	        	leftPressed = false;
	        	break;
	        case KeyEvent.VK_RIGHT:
	        	rightPressed = false;
	        	break;
	        case KeyEvent.VK_SPACE:
	        	spacePressed = false;
	        	break;
	    }
	}
	
	final void operation(Player player) {
	    player.setIsMovingUp(upPressed);
	    player.setIsMovingDown(downPressed);
	    player.setIsMovingLeft(leftPressed);
	    player.setIsMovingRight(rightPressed);
	    player.setIsFire(spacePressed);
	}

}
