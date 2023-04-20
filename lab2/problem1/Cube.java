
package problem1;

public class Cube extends ThreeDShape{
	private double side;
	public Cube() {
		side=1;
	}
	public Cube(double side) {
		this.side=side;
	}
	@Override
	public double volume() {
		return side*side*side;
	}
	@Override
	public double surfaceArea() {
		return side*side*6;
	}
	
}