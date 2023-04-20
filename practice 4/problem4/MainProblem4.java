package problem4;
import java.util.Scanner;
public class MainProblem4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Bank b = new Bank();
//		int n = sc.nextInt();
//		for(int i=1;i<=n;i+=1) {
//			Account user = new Account(i);
//			user.deposit(i);
//			b.add(user);
//			
//		}
		
		
		
		Account a = new Account(1);
		CheckingAccount Ca = new CheckingAccount(2);  
		SavingsAccount Sa = new SavingsAccount(3);
		Sa.deposit(1000);
		Sa.interestAdd();
		b.openAc(a);
		b.openAc(Ca);
		b.openAc(Sa);
		b.getPer();
		b.update();
		System.out.println(b.toString());
		
		Ca.transfer(100,Sa);
		Ca.transfer(100,Sa);
		Ca.transfer(100,Sa);
		Ca.transfer(100,Sa);
		System.out.println(b.toString());
		
		sc.close();
		
	}
}
