package problem1;

public class Cylinder extends ThreeDShape{
	
	private double radius;
	private double height;
	public Cylinder() {
		radius=1;
		height=1;
	}
	public Cylinder(double radius) {
		this.radius=radius;
		height=1;
	}
	public Cylinder(double radius,double height) {
		this.radius=radius;
		this.height=height;
	}
	@Override
	public double volume() {
		return super.PI*radius*radius*height;
	}

	@Override
	public double surfaceArea() {
		return super.PI*radius*radius*2+height*2*super.PI*radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

}
