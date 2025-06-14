package shooting2;

abstract class GameObject {
	
	private String imageName;
	private String type;
	private int x;
	private int y;
	private int width;
	private int height;
	private int depth;
	private boolean isRenderable;

	GameObject(String imageName, int x, int y, int width, int height, int depth) {
		this.imageName = imageName;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.depth = depth;
		type = "";
		isRenderable = false;
	}
	
	GameObject(String imageName, int x, int y, int width, int height, int depth, String type) {
		this.imageName = imageName;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.depth = depth;
		this.type = type;
		isRenderable = false;
	}
	
	final String getImageName() {
		return imageName;
	}
	
	final void setImageName(String name) {
		this.imageName = name;
	}
	
	final String getType() {
		return type;
	}
	
	final void setType(String type) {
		this.type = type;
	}
	
	final int getX() {
		return x;
	}
	
	final void setX(int x) {
		this.x = x;
	}
	
	final int getY() {
		return y;
	}
	
	final void setY(int y) {
		this.y = y;
	}
	
	final int getWidth() {
		return width;
	}
	
	final void setWidth(int width) {
		this.width = width;
	}
	
	final int getHeight() {
		return height;
	}
	
	final void setHeight(int height) {
		this.height = height;
	}
	
	final int getDepth() {
		return depth;
	}
	
	final void setDepth(int depth) {
		this.depth = depth;
	}
	
	final boolean isRenderable() {
		return isRenderable;
	}
	
	final void setIsRenderable(boolean b) {
		isRenderable = b;
	}
	
	abstract void move();
	
	abstract void initialize();
	
}
