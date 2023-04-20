package problems2;
import java.util.Vector;
public class mainOf2 {
	public static void main(String args[]) {
		Vector<String> vec = new Vector<String>(10);
		Student s = new Student("Arsen","ros","c++",2,2.33);
		vec.addElement(s.toString());
		//System.out.print(vec.firstElement());
		Person a = new Person("arsen");
		Person b = new Person("Arsen");
		System.out.print(a.equals(b));
	}
}
