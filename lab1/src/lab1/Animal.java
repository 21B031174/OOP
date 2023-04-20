package lab1;

public class Animal{
	 private TypeofAnimal type;
	 private String name;
	 private int age=0;
	 private boolean isSwim;
	 private boolean isFly;
	 private boolean isWalk;
	 private final String animal = "Animal";
	 Animal(){
		 name = "undef";
		 age = 0;
		 isSwim=false;
		 isFly=false;
		 isWalk=false;	 
	 }

	 Animal(TypeofAnimal type){
		 this();
		 this.type = type;
	 }
	 Animal(TypeofAnimal type,String name){
		 this(type);
		 this.name = name;
	 }
	 Animal(TypeofAnimal type,String name,boolean isswim){
		 this(type,name);
		 this.isSwim = isswim;
	 }
	 Animal(TypeofAnimal type,String name,boolean isswim,boolean isfly){
		 this(type,name,isswim);
		 this.isFly = isfly;	 
	 }
	 
	 Animal(TypeofAnimal type,String name,boolean isswim,boolean isfly,boolean isWalk){
		 this(type,name,isswim,isfly);
	  	 this.isWalk = isWalk;
	 }
	 public TypeofAnimal getType() {
		 return type;
	 }
	 public String getName() {
		 return name;
	 }
	 public int getAge() {
		 return age;
	 }
	 public boolean getIssw(){
		 return isSwim;
	 }
	 public boolean getIsfl(){
		 return isFly;
	 }
	 public boolean getIswalk(){
		 return isWalk;
	 }
	 public void setType(TypeofAnimal type) {
		 this.type = type; 
	 }
	 public void setName(String name) {
		 this.name = name;
	 }
	 public void setIsswim(boolean g) {
		 this.isSwim = g;
	 }
	 public void setIsFly(boolean g) {
		 this.isFly = g;
	 }
	 public void setIsWalk(boolean g) {
		 this.isWalk = g;
	 }
	 public String toString() {
		 return animal+'\n'+"Type:"+type+'\n'+"Name:"+name+'\n'+"Age:"+age+'\n'+"IsSwim:"+isSwim+'\n'+"IsFly:"+isFly+'\n'+"IsWalk:"+isWalk+'\n'; 
	 }
	 
}

class snake extends Animal{
	final TypeofAnimal type = TypeofAnimal.amphibians;
	String nameOfSnake;
	{
		nameOfSnake = "Undef";
	}
	snake(String name){
		super.setName(name);
	}
	snake(){
		super.setType(type);
	}
	public void main(String args[]) {
		snake snake_k = new snake("Python");
		System.out.print(snake_k.toString());
	}
	
	
	
};






