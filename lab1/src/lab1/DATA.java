package lab1;

public class DATA {
	private int cnt;
	private double avarage;
	private double max;
	DATA(){
		cnt = 0;
		avarage = 0;	
	}
	boolean isEmpty() {
		return (cnt==0)?true:false;
	}
	void AddValue(int x) {
		if(isEmpty()) {
			max = x ;
		}
		else {
			if(max<x) {
				max = x;
			}
		}
		cnt++;
		avarage += x;
	}
	double getAvarage() {
		if(isEmpty()) {
			return 0;
		}
		else {
			return avarage/cnt;
		}
	}
	double getMax() {
		if(isEmpty()) {
			return 0;
		}
		else {
			return max;
		}
	}
	public String toString() {
		return "Maximum== "+max+"\nAvarage == "+ avarage/cnt;
	}
}
