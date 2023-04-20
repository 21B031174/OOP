package exaple1;

public class Time {
	int hour;
	int min;
	int sec;
	public Time() {
			this.hour = 0;
			this.min = 0;
			this.sec = 0;
		
	}
	public Time(int hour, int min,int sec) {
		this.hour = hour;
		this.min = min;
		this.sec = sec;
	}
	public Time(int hour, int min) {
		this.hour = hour;
		this.min = min;
		this.sec = 0;
	}
	
	
	String toUniversal() {
		return (((this.hour%100)/10==0)?"0":"")+this.hour+":"+(((this.min%100)/10==0)?"0":"")+this.min+":"+(((this.sec%100)/10==0)?"0":"")+this.sec;
	}
	String toStandart() {
		return (((this.hour%100)/10==0)?"0":"")+((this.hour>12)?this.hour-12:this.hour)+":"+(((this.min%100)/10==0)?"0":"")+this.min+":"+(((this.sec%100)/10==0)?"0":"")+this.sec+" PM";
	}
	void add(Time t) {
		sec += t.sec;
		min += t.min +sec/60;
		hour += t.hour + min/60;
		sec= sec%60;
		min = min%60;
		hour = hour%24;
	}
	
	public String toString() {
		return "v";
	}
}
