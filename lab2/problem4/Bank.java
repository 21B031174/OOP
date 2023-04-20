package problem4;
import java.util.HashMap;
import java.util.Vector;
public class Bank {
	 Vector<Account> accounts = new Vector<Account>();
	 HashMap<Integer,Account> hm = new HashMap<Integer,Account>(); 
	Bank(){
		
	}
	
	public boolean openAcc(Account a) {
		if(!accounts.contains(a)) {
			accounts.add(a);
			hm.put(a.hashCode(), a);
			return true;
//			System.out.println("Your hascode is "+a.hashCode()+" don't show anybody!");
		}return false;
//			System.out.println("This account exists"); 			
	}
	public void closeAcc(Account a){
		
		accounts.remove(a);
	}
	public void displayInfo() {
		for(Account a:accounts) {
			System.out.println(a);
		}
	}
	public void update() {
		for(Account a:accounts) {
			if(a instanceof CheckingAccount) ((CheckingAccount) a).deductFee();
			if(a instanceof SavingAccount) ((SavingAccount) a).addInterest(); 
		}
	}
	
}	
	
//public void update() {
//	Scanner in = new Scanner(System.in);
//	int o;
//	for(Account a:accounts) {
//		System.out.println(a);
//		while(true) {
//			System.out.println("Choose operation:\n0:quit\n1:deposit\n2:withdraw\n3:transfer");
//			o=in.nextInt();
//			if(o==0) break;
//			else if(o==1) {
//				System.out.println("Enter sum:");
//				a.deposit(in.nextDouble());
//				System.out.println("Your balance now:" + a.getBalance());
//			}
//			else if(o==2) {
//				System.out.println("Enter sum:");
//				if(a.withdraw(in.nextDouble())) {
//					System.out.println("Your balance now:"+ a.getBalance());
//				}
//				else {
//					System.out.println("You don't have enough money!");
//				}
//			}else if(o==3){
//				System.out.println("Enter sum and hashcode of account to transfer:");
//				if(a.transfer(in.nextDouble(),hm.get(in.nextInt()))) {
//					System.out.println("Sacces!");
//				}else {
//					System.out.println("You don't have enough money to transfer or wrong hashcode!");
//				}
//			}
//			else {
//				System.out.println("Invalid operation");
//			}
//		}
//		
//	}
//	
//	in.close();
//}