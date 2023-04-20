package problem4;

public class CheckingAccount extends Account{
	private int counter;
	public CheckingAccount(int a) {
		super(a);
	}

	public void deductFee() {
		if(super.withdraw(counter*0.02))counter=0;
	}
	@Override
	public String toString() {
		return "CheckingAccount " + super.getAccountNumber()+" balance: "+super.getBalance()+" fee of deduct: 0.02"+ " hashcode: "+hashCode();
	}
	public int hashCode(){
		return super.hashCode()*103+31;
	}
	public void deposit(double sum) {
		super.deposit(sum);
		counter++;
	}
	public boolean withdraw (double sum) {
		 if(super.withdraw(sum)) {
			 counter++;
			 return true;
		 }
		 return false;
		}
	}
