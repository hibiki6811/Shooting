package shooting;

import javax.swing.JFrame;
import javax.swing.JPanel;

class MyFrame {
	
	private JFrame jFrame;
	
	MyFrame(JFrame jFrame){
		this.jFrame = jFrame;
	}
	
	final void createFrame() {
		jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jFrame.setSize(800, 600);
		jFrame.setResizable(false);
		jFrame.setLocationRelativeTo(null);
		jFrame.setVisible(true);
	}
	
	final void setPanel(JPanel panel) {
		jFrame.add(panel);
	}
	
	final void setOperation(Operation operation) {
		jFrame.addKeyListener(operation);
	}
	
}
