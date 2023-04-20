package lab1;
public class Student {
	private String name="undefined";
	static int ID=1;
	private int year = 1;
	private int id;
	private int point=0;
	
	public Student(String name,int point){
		this.name = name;
		this.point = point;
		this.id = ID++;
	}
	public Student(String name){
		this.name = name;
		this.id = ID++;
	}
	
	public void incYear(){
		year+=1;
	}
	public String getName() {
		return name;
	}
	public int getId() {
		return id;
	}
	public int getYear() {
		return year;
	}
	public int getPoint() {
		return point;
	}
	
	public void setName(String name) {
		this.name = name; 
	}
	public void setId(int id) {
		this.id  = id;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public void setPoint(int  point) {
		this.point = point;
	}
	
}
