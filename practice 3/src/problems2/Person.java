package problems2;

public class Person {
	public String name;
	public String address;
	public Person(String name) {
		this.name = name;
	}
	public Person(String name,String address) {
		this.name = name;
		this.address  =address;
	}
	void getName(String name) {
		this.name = name;
	}
	void getAddress(String address) {
		this.address  =address;
	}
	public String setAddress() {
		return address;
	}
	public String toString() {
		return name+ " "+address;
	}
	public boolean equals(Object a) {
		
	}
	
}
