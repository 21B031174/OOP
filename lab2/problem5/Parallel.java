//package problem5;
//
//public class Parallel extends Circuit{
//	private double potentialDiff;
//	private double resistance;
//	Parallel(Circuit a, Circuit b){
//		resistance=(a.getResistance() * b.getResistance())/(a.getResistance() + b.getResistance());
//		potentialDiff=a.getPotentialDiff();
//	}
//	public double getPotentialDiff() {
//		return potentialDiff;
//	}
//	public void applyPotentialDiff(double potentialDiff) {
//		this.potentialDiff = potentialDiff;
//	}
//	public double getResistance() {
//		return resistance;
//	}
//}
//
package problem5;

public class Parallel extends Circuit{
	private Circuit a,b;
	Parallel(Circuit a, Circuit b){
		this.a=a;this.b=b;
	}
	public double getPotentialDiff() {
		return a.getPotentialDiff();
	}
	public void applyPotentialDiff(double V) {
		a.applyPotentialDiff(V);
		b.applyPotentialDiff(V);

	}
	public double getResistance() {
		return (a.getResistance() * b.getResistance())/(a.getResistance() + b.getResistance());
	}
}
