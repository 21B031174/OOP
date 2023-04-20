package problem4;

public class CheckingAccount extends Account{
	int FreeTransaction;
	int cnt;
	CheckingAccount(int a){
		super(a);
		this.FreeTransaction = 3;
		this.cnt = 0;
	}
	public void deposit(double amount) {
		this.balance+=amount;
		cnt+=1;
		deductfee();
	}
	boolean  withraw(double amount) {
		if(super.balance-amount>0) {
			super.balance -= amount;
			cnt+=1;
			deductfee();
			return true;
		}
		else {
			System.out.println("Error!");
			return false;
		}
	}
	public void transfer(double amount,Account other){
		if(withraw(amount)) {
			other.deposit(amount);
			cnt+=1;
			deductfee();
		}		
	}
	void deductfee() {
		if(FreeTransaction>0) {
			FreeTransaction--;
			cnt--;
		}
		else {
			super.balance -= cnt*0.02;
			cnt=0;
		}
	}
}