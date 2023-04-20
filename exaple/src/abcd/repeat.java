package abcd;

public class repeat {
	private Ecar type;
	private int age = 10;
	private String name="Barsic";
	private boolean isSwim;
	private boolean isFly;
	private boolean isWalk;
	private final String repeat = "animal";
	
	repeat(){
		name = "Shults";
		age = 15;
		isSwim=false;
		isFly=false;
		isWalk=false;
	}
	repeat(Ecar type){
		this();
		this.type = type;
	}
	repeat(Ecar type,String name){
		this(type);
		this.name = name;
	}
	repeat(Ecar type,String name,int age){
		this(type,name);
		this.age = age;
	}
	public String getString() {
		return name;
	}
	public void setInt(int x) {
		this.age = x;
	}
	public String toString() {
		return repeat+"\n type:"+Ecar.Bird+"\n name:"+name;
	}
}
