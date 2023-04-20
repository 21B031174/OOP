package problem4;

public class Account {
	double balance;
	int accNumber;
	public Account(int a){
		balance = 0.0;
		accNumber = a;
	}
	public void deposit(double amount) {
		this.balance+=amount;	
	}
	boolean  withraw(double amount) {
		if(balance-amount>=0) {
			this.balance -= amount;
			return true;
		}
		else {
			System.out.println("Error!");
			return false;
		}
	}
	public double getBalance(){
		return this.balance;
	}
	public double getAccountNumber(){
		return this.accNumber;
	}
	public void transfer(double amount,Account other){
		if(withraw(amount)) {
			other.deposit(amount);
		}		
	}
	public String toString() {
		return "Account [balance=" + balance + ", accNumber=" + accNumber + "]";
	}
	public final void print() {
		System.out.println(toString());
	}
	
}
