package problem5;
public class Mainproblem5 {
	public static void main(String args[]) {
		Circuit a = new Resistor(3.0);
		Circuit b = new Resistor(3.0);
		Circuit c = new Resistor(6.0);
		Circuit d = new Resistor(3.0);
		Circuit e = new Resistor(2.0);
		Circuit f = new Series(a , b);
		Circuit g = new Parallel(c , d);
		Circuit h = new Series(g , e);
		Circuit circuit = new Parallel(h,f);
		double r = circuit.getResistance();
		circuit.applyPotentialDiff(5);
		double power = circuit.getPower(); 
		System.out.println("Power: "+power+"\n"+"Resistance: "+r+"\n"+"Current: "+circuit.getCurrent());		
	}
}
