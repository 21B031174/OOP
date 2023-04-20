package problem2Lab3;
import java.util.HashMap;
public class Books  implements moreMoveable{
	HashMap<String,Integer> booksReport = new HashMap<>();
	public void addBook(String Name) {
		if(booksReport.containsKey(Name)) {
			booksReport.computeIfPresent(Name, (k,v)->v+1);
		}
		else {
			booksReport.put(Name, 1);
		}
	}
	public void drop(String Name) {
		if(booksReport.containsKey(Name)) {
			if(booksReport.get(Name)>1) {
				booksReport.computeIfPresent(Name, (k,v)->v-1);
			}
			else {
				booksReport.remove(Name);
			}
			System.out.println("Ok!");
		}
		else {
			System.out.println("You can't delete a non-existent book!");
		}
	}
	@Override
	public String toString() {
		return "Books [booksReport=" + booksReport + "]";
	}
	@Override
	public String getBook(String Name) {
		if(booksReport.containsKey(Name)) {
			drop(Name);
			return Name;
		}
		else {
			return null;
		}
		
	}
	@Override
	public void returnBook(String name) {
		addBook(name);
		
	}
	@Override
	public void donateBook(String x) {
		addBook(x);
		System.out.println("A new book has been added from it! Thank YOU! :)");
		
	}
	
	
	
}
