package problem1Lab3;

public class app implements info{
	String nameOfApp;
	int id;
	app(String name){
		this.nameOfApp = name;
	}
	app(String name , int id){
		this(name);
		this.id = id;
	}

	
	@Override
	public String toString() {
		return "app (nameOfApp=" + nameOfApp + ", id=" + id + ")";
	}
	public String running() {
		return toString();
	}
}
