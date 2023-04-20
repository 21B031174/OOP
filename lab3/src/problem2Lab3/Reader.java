package problem2Lab3;

public class Reader implements moreMoveable{
	String nameOfReader;
	
	Reader(String name){
		this.nameOfReader = name;
	}
	@Override
	public String getBook(String x) {
		return nameOfReader+" read book:"+x;
	}

	@Override
	public void returnBook(String x) {
		System.out.println("The reader"+nameOfReader+"returned the book");
		
	}

	@Override
	public void donateBook(String x) {
		System.out.println("The reader"+nameOfReader+"donated the book");
		
	}
	
}
