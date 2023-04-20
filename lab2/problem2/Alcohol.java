package problem2;

import java.util.Objects;

public class Alcohol extends Drink{
	private int persentage;
	Alcohol(){
		super();		
	}
	Alcohol( String name){
		super(name);
		this.setPersentage(4);
	}
	Alcohol(String name,int persentage){
		super(name);
		this.setPersentage(persentage);
	}
	public int getPersentage() {
		return persentage;
	}
	public void setPersentage(int persentage) {
		this.persentage = persentage;
	}
	@Override
	public boolean equals(Object o) {
		if(!super.equals(o)) return false;
		return ((Alcohol)o).getPersentage()==persentage;
	}
	@Override
	public int hashCode() {
		return Objects.hash(super.getName(),persentage);
		//return 17*name.hashCode()+age;
	}
	@Override 
	public String toString() {
		return "AlcoDrink " + super.getName() + " persentage " + persentage;
	}
}
