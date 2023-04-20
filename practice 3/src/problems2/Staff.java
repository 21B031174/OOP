package problems2;

public class Staff extends Person {
	public String school;
	public double pay;
	public Staff(String name,String address,String school,double pay) {
		super(name,address);
		this.school = school;
		this.pay = pay;
	}
	void getSchool(String school) {
		this.school = school;
	}
	public String setSchool() {
		return school;
	}
	void getPay(double pay) {
		this.pay = pay;
	}
	public double setPay() {
		return pay;
	}
	public String toString() {
		return super.name + " "+ super.address + " "+ school+" "+ pay;
	}
}
