package lab1;
import java.util.Scanner;
public class Analayzer {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		DATA data = new DATA();
		while(true) {
			System.out.print("Enter number (Q to quit):");
			String x = sc.nextLine();
			try {
				data.AddValue(Integer.parseInt(x));
			}
			catch(Exception e){
				break;
			}	
		}
		System.out.println("IS EMPTY=="+data.isEmpty());
		System.out.println("Maximum=="+data.getMax());
		System.out.println("Avarage=="+data.getAvarage());
		System.out.println(data);
		sc.close();	
	}
}
