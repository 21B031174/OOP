package problems2;

public class Student extends Person {
	public String program;
	public int year;
	public double fee;
	public Student(String name,String address,String program,int year,double fee) {
		super(name,address);
		this.program = program;
		this.year = year;
		this.fee = fee;
	}
	void getProgram(String program) {
		this.program = program;
	}
	public String setProgram() {
		return program;
	}
	void getYear(int year) {
		this.year = year;
	}
	public int setYear() {
		return year;
	}
	void getFee(double fee) {
		this.fee = fee;
	}
	public double setFee() {
		return fee;
	}
	public String toString() {
		return super.name + " "+ super.address + " "+ program+" "+year+" "+fee;
	}
	
	
	// getter return
	// setter void
}
