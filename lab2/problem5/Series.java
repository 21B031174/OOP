//	package problem5;
//
//public class Series extends Circuit{
//	private double potentialDiff;
//	private double resistance;
//	Series(Circuit a, Circuit b){
//		resistance=a.getResistance() + b.getResistance();
//		potentialDiff=a.getPotentialDiff()+a.getPotentialDiff();
//	}
//	public double getPotentialff() {
//		return potentialDiff;
//	}
//	public void applyPotentialDiff(double potentialDiff) {
//		this.potentialDiff = potentialDiff;
//	}
//	public double getResistance() {
//		return resistance;
//	}
//}
	package problem5;

public class Series extends Circuit{
	private  Circuit a,b;
	Series(Circuit a, Circuit b){
		this.a=a;this.b=b;
	}
	public double getPotentialDiff() {
		return a.getPotentialDiff() + b.getPotentialDiff();
	}
	public double getResistance() {
		return a.getResistance() + b.getResistance();
	}
	@Override
	public void applyPotentialDiff(double V) {
		a.applyPotentialDiff(V*a.getResistance()/getResistance());
		b.applyPotentialDiff(V*b.getResistance()/(getResistance()));
	}
}

