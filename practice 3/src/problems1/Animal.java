package problems1;

public class Animal {
	public String name;
	public int age;
	public String callor;
	public String sound;
	// Overloading
	public Animal() {
		
	}
	public Animal(String name) {
		this.name = name;
	}
	public Animal(String name,int age) {
		this();
		this.age = age;
	}
	public Animal(String name,int age,String callor) {
		this();
		this.callor = callor;
	}
	
	
	
	// Overriding
	public String toStrting() {
		return name +" "+ age + " "+ sound;
	}
	
}
