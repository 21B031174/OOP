package problem2Lab3;

public class MainOfProblem3 {
	public static void getBooks(moreMoveable x){
		System.out.println(x.getBook("Hello"));
	}
	public static void main(String[] args){
		Reader r = new Reader("Nursultan");
		getBooks(r);
		Books x = new Books();
		x.addBook("Hello");
		x.addBook("Hello");
		getBooks(x);
		Library z = new Library("Hello");
		z.addBook("Hello");
		z.addBook("Hello");
		getBooks(z);
	}
		
}
