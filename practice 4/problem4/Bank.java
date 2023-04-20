package problem4;
import java.util.Vector;
import java.util.HashMap;
public class Bank {
	Vector <Account> ArrAc = new Vector<Account>();
	HashMap <Integer,Account> Per = new HashMap <Integer,Account>();
	
	void update() {
		for(Account i : ArrAc) {
			i.deposit(1);
			System.out.println(i.toString());
		}
	}
	void openAc(Account a) {
		if(Per.get(a.hashCode())==null) {
			ArrAc.add(a);
			Per.put(a.hashCode(),a);
		}
		else {
			System.out.println("The account already exists!");
		}
	}
	void closeAc(Account a) {
		if(Per.get(a.hashCode())!=null){
			ArrAc.remove(a);
			Per.remove(a.hashCode());
		}
		else {
			System.out.println("The account does not exist");
		}
	}
	public String toString() {
		return "Bank [ArrAc=" + ArrAc + ", Per=" + Per + "]";
	}
	public void getPer() {
		System.out.println(Per);
	}
	
}		
