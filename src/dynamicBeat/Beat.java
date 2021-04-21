package dynamicBeat;

public class Beat {
	
	
	private int time;
	private String notName;
	
	
	public int getTime() {
		return time;
	}
	public void setTime(int time) {
		this.time = time;
	}
	public String getNotName() {
		return notName;
	}
	public void setNotName(String notName) {
		this.notName = notName;
	}
	
	public Beat(int time, String notName) {
		super();
		this.time = time;
		this.notName = notName;
	}
	
}
