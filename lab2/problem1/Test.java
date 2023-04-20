package problem1;
import java.util.Vector;
public class Test {
	public static void main(String args[]) {
		Vector<ThreeDShape> v = new Vector<ThreeDShape>() {
			add(new Cube(4));
			add(new Cylinder(3,5));
			add(new Sphere(6));
		};
		for(ThreeDShape t : v) {
			System.out.println(t.volume()+ " "+ t.surfaceArea());
		}
	}

}
