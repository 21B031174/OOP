package problem4;

import java.util.Objects;
	
public class Account{
	private double balance; private int accNumber;
	//The current balance //The account number
	public Account (int a) {
		balance=0.0; accNumber=a;		
	}
	public void deposit (double sum) { balance+=sum;}
	public boolean withdraw (double sum) {
		if(balance<sum) return false;
		balance-=sum;return true;
		};
	public double getBalance () { return balance;}
	public int getAccountNumber () { return accNumber;}
	public boolean transfer (double amount, Account other){
		if(withdraw(amount)&&other!=null) {
		other.deposit(amount);
		return true;
		}
		return false;
	}
	public String toString() {
		return "Account " + accNumber+" balance: "+balance + " hashcode: "+hashCode();
	}
	public boolean equals(Object a) {
		if(a==null)return false;
		if(this.getClass()!=a.getClass()) return false;
		if(a==this) return true;
		return a.hashCode()==this.hashCode(); 
	}
	public int hashCode(){
		return Objects.hash(accNumber);
	}
	public final void print() {
	//Don't override this, override the toString method
	System.out.println( toString()); }
}
	