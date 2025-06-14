package shooting2;

import javax.swing.JFrame;

public class Main {
	
	public static void main(String[] args) {
		Run run = new Run(new MyFrame(new JFrame()), new Render(new ImageReader()), new GameObjectManager());
		run.runGame();
	}

}
//git password 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
//User <User@DESKTOP-OBUCA4D>
