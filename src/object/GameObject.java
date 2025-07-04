package object;

public abstract class GameObject {
	
	private String type;
	private int x;
	private int y;
	private int width;
	private int height;
	private int depth;
	private boolean isRenderable;

	public GameObject(String type, int x, int y, int width, int height, int depth) {
		this.type = type;
		this.x = x;
		this.y = y;
		this.width = width;
		this.height = height;
		this.depth = depth;
		type = "";
		isRenderable = false;
	}
	
	public final String getType() {
		return type;
	}
	
	public final void setType(String type) {
		this.type = type;
	}
	
	public final int getX() {
		return x;
	}
	
	public final void setX(int x) {
		this.x = x;
	}
	
	public final int getY() {
		return y;
	}
	
	public final void setY(int y) {
		this.y = y;
	}
	
	public final int getWidth() {
		return width;
	}
	
	public final void setWidth(int width) {
		this.width = width;
	}
	
	public final int getHeight() {
		return height;
	}
	
	public final void setHeight(int height) {
		this.height = height;
	}
	
	public final int getDepth() {
		return depth;
	}
	
	public final void setDepth(int depth) {
		this.depth = depth;
	}
	
	public final boolean isRenderable() {
		return isRenderable;
	}
	
	public final void setIsRenderable(boolean b) {
		isRenderable = b;
	}
	
	public abstract void initialize();
	
	public abstract void move();
	
}
