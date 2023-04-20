
package problem1;

public class Sphere extends ThreeDShape{
	private double radius;
	public Sphere() {
		radius=1;
	}
	public Sphere(double radius) {
		this.radius=radius;
	}
	@Override
	public double volume() {
		return 4*radius*radius*radius*super.PI/3;
	}
	@Override
	public double surfaceArea() {
		return radius*radius*4*super.PI;
	}
	
}