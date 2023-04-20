package lab1;

public class Superman extends Person {
	Superman(String name , String soname , int age , Gender g){
		super(name,soname,age,g);
	}
	public String toString() {
		return "Superman\n"+super.toString();
	}
	public void kill() {
		System.out.println("Killing Dragon");
	}
}
