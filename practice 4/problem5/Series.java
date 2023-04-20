package problem5;

public class Series extends Circuit{
	Resistor rS;
	double pottentialDifference;
	Series(Resistor a, Resistor b){
		if(a instanceof Circuit && b instanceof Circuit) {
			this.rS = new Resistor(a.getResistance()+b.getResistance());
		}
	}
	Series(Circuit a, Circuit b){
		if(a instanceof Circuit && b instanceof Circuit) {
			this.rS = new Resistor(a.getResistance()+b.getResistance());
		}
	}
	Series(Resistor a, Circuit b){
		if(a instanceof Circuit && b instanceof Circuit) {
			this.rS = new Resistor(a.getResistance()+b.getResistance());
		}
	}
	Series(Circuit a, Resistor b){
		if(a instanceof Circuit && b instanceof Circuit) {
			this.rS = new Resistor(a.getResistance()+b.getResistance());
		}
	}
	public double getResistance() {
		return rS.resistance;
	}
	public  void applyPotentialDiff(double v) {
		this.pottentialDifference = v;
	}
	public double getPotentialDiff() {
		return pottentialDifference;
	}
	
}
