package problem1Lab3;

public class game implements info {
	String nameOfGame;
	int id;
	game(String name){
		this.nameOfGame = name;
	}
	game(String name,int id){
		this(name);
		this.id = id;
	}
	
	@Override
	public String toString() {
		return nameOfGame + " is open and runing with id " + id + "!"; 
	}
	public String running() {
		return toString();
	}
}
