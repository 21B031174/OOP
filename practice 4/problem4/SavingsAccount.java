package problem4;

public class SavingsAccount extends Account{
	double procent = 0.1;
	SavingsAccount(int a){
		super(a);
	}
	void interestAdd(){
		super.balance+=(super.balance*procent);
	}
}
