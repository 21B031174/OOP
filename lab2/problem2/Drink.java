package problem2;

import java.util.Objects;

public class Drink {
	private String name;
	public Drink() {
		name="NoName";
	}
	public Drink(String name) {
		this.name=name;
	}
	public Drink(String name, int age) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	@Override
	public boolean equals(Object o) {
		if(!(o instanceof Drink) || o==null )return false;
		if(o==this) return true; 
		return ((Drink)o).getName()==name;
	}
	@Override
	public int hashCode() {
		return Objects.hash(name);
		//return 17*name.hashCode()+age;
	}
	@Override 
	public String toString() {
		return "Drink " + name;
	}
}
