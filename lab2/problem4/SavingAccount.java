package problem4;

public class SavingAccount extends Account{
	private double interest;
	public SavingAccount(int a) {
		super(a);
		interest=0.15;
	}
	public SavingAccount(int a,double i) {
		super(a);
		interest=i;
	}
	public double getInterest() {
		return interest;
	}
	public void setInterest(double interest) {
		this.interest = interest;
	}
	public void addInterest() {
		super.deposit(super.getBalance()*interest);
	}
	@Override
	public String toString() {
		return "SavingAccount " + super.getAccountNumber()+" balance: "+super.getBalance()+" with iterest: "+interest + " hashcode: "+hashCode();
	}

	public int hashCode(){
		return super.hashCode()*31+19;
	}
}
