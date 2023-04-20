package problem5;

public class Parallel extends Circuit{
	Resistor rP;
	double pottentialDifference;
	Parallel(Resistor a, Resistor b){
		if(a instanceof Circuit && b instanceof Circuit) {
			this.rP = new Resistor((a.getResistance()*b.getResistance())/(a.getResistance()+b.getResistance()));
		}
	}
	Parallel(Circuit a, Circuit b){
		if(a instanceof Circuit && b instanceof Circuit) {
			this.rP = new Resistor((a.getResistance()*b.getResistance())/(a.getResistance()+b.getResistance()));
		}
	}
	Parallel(Resistor a, Circuit b){
		if(a instanceof Circuit && b instanceof Circuit) {
			this.rP = new Resistor((a.getResistance()*b.getResistance())/(a.getResistance()+b.getResistance()));
		}
	}
	Parallel(Circuit a, Resistor b){
		if(a instanceof Circuit && b instanceof Circuit) {
			this.rP = new Resistor((a.getResistance()*b.getResistance())/(a.getResistance()+b.getResistance()));
		}
	}
	public double getResistance() {
		return rP.resistance;
	}
	public  void applyPotentialDiff(double v) {
		this.pottentialDifference = v;
	}
	public double getPotentialDiff() {
		return pottentialDifference;
	}
}
