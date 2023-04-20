package problem5;

public class Resistor extends Circuit{
	private double potentialDiff=1;
	private double resistance;
	Resistor(double ohms){
		resistance=ohms;
	}
	public double getPotentialDiff() {
		return potentialDiff;
	}
	public void applyPotentialDiff(double V) {
		this.potentialDiff = V;
	}
	public double getResistance() {
		return resistance;
	}
}
