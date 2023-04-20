package problem4;
import java.util.Scanner;
public class Test {
	public static void main(String args[]) {
		Bank bank = new Bank() {{
			openAcc(new Account(1));
			openAcc(new Account(2));
			openAcc(new SavingAccount(1));
			openAcc(new SavingAccount(2));
			openAcc(new CheckingAccount(1));
			openAcc(new CheckingAccount(2));
			openAcc(new CheckingAccount(2));
		}};
//		System.out.println(bank.accounts.contains(new CheckingAccount(2)));
		bank.displayInfo();
			Scanner in = new Scanner(System.in);
			int o;
			for(Account a:bank.accounts) {
				System.out.println(a);
				while(true) {
					System.out.println("Choose operation:\n0:quit\n1:deposit\n2:withdraw\n3:transfer");
					o=in.nextInt();
					if(o==0) break;
					else if(o==1){
						System.out.println("Enter sum:");
						a.deposit(in.nextDouble());
						System.out.println("Your balance now:" + a.getBalance());
					}
					else if(o==2) {
						System.out.println("Enter sum:");
						if(a.withdraw(in.nextDouble())) {
							System.out.println("Your balance now:"+ a.getBalance());
						}
						else {
							System.out.println("You don't have enough money!");
						}
					}else if(o==3){
						System.out.println("Enter sum and hashcode of account to transfer:");
						if(a.transfer(in.nextDouble(),bank.hm.get(in.nextInt()))) {
							System.out.println("Sacces!");
						}else {
							System.out.println("You don't have enough money to transfer or wrong hashcode!");
						}
					}
					else {
						System.out.println("Invalid operation");
					}
				}
				
			}
			in.close();
			bank.update();
			bank.displayInfo();
			
	}
}
