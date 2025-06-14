package shooting;

import java.awt.Graphics;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;

import javax.swing.JPanel;

import object.GameObject;

class Render {
	
	private ImageReader imageReader;
	private MyPanel myPanel;
	private List<GameObject> renderObjects;
	
	Render(ImageReader imageReader){
		this.imageReader = imageReader;
		this.myPanel = new MyPanel();
		renderObjects = new ArrayList<>();
	}
	
	final void rendering() {
		myPanel.repaint();
	}
	
	final void setRenderGameObject(GameObject object) {
		if(!renderObjects.contains(object)) {
			renderObjects.add(object);
		}else {
			//System.out.println("描画対象が重複しています");
		}
	}
	
	final void setRenderGameObject(List<GameObject> objects) {
		for(GameObject object : objects) {
			setRenderGameObject(object);
		}
	}
	
	final void setRenderGameObject(Map<Integer, GameObject> objects) {
		for(GameObject object : objects.values()) {
			setRenderGameObject(object);
		}
	}
	
	final void sortGameObject() {
		renderObjects.sort(Comparator.comparingInt(gameObject -> gameObject.getDepth()));
	}
	
	final MyPanel getPanel() {
		return myPanel;
	}
	
	private class MyPanel extends JPanel {
		
		@Override
		public void paintComponent(Graphics g) {
			super.paintComponent(g);
			
			//List<GameObject> copyObjects = new ArrayList<>(renderObjects); //ConcurrentModificationException防止.
			
			for(GameObject object : renderObjects) {
				String imageName = object.getImageName();
				int x = object.getX();
				int y = object.getY();
				int width = object.getWidth();
				int height = object.getHeight();
				if(object.isRenderable()) {
					g.drawImage(imageReader.getImage(imageName), x, y, width, height, null); 
				}
			}
		}
		
	}

}
