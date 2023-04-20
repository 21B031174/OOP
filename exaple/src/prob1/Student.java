package prob1;

public class Student {
	public String name;
	public int id;
	public int yearOfStudy=2;
	public Student() {
		
	}
	

	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setIdAndName(String name,int id) {
		this.name = name;
		this.id = id;
	}
	public void getYaer() {
		this.yearOfStudy += 1;
	}
	public String toString() {
		return (name) + " " + id + " " + yearOfStudy;
	}
}
