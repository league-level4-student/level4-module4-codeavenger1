package _04_hospital;

public class Patient {
	boolean feelsCaredFor = false;
	
	public boolean feelsCaredFor() {
		return feelsCaredFor;
	}
	
	public void checkPulse() {
			this.feelsCaredFor = true;
	}
	
	
}
