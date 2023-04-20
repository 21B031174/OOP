package problem5;

public class Resistor extends Circuit{
	double resistance;
	double pottentialDifference;
	Resistor(double x){
		this.resistance = x;
	}
	public double getResistance() {
		return resistance;
	}
	public  void applyPotentialDiff(double v) {
		this.pottentialDifference = v;
	}
	public double getPotentialDiff() {
		return pottentialDifference;
	}
}
