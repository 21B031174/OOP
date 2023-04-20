package problems1;

public class Dog extends Animal {
	String sound = "gav-gav";
	public Dog(String name,int age) {
		super(name,age);
		super.sound = this.sound;
	}
//	public String toStrting() {
//		return "";
//	}
}
