package shooting;

public class RoopCount {

	private int roopCount;
	
	public RoopCount() {
		roopCount = 0;
	}
	
	public final void addRoopCount() {
		roopCount++;
	}
	
	public final int getRoopCount() {
		return roopCount;
	}
}
