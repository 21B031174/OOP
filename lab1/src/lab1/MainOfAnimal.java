package lab1;

public class MainOfAnimal {
	public static void main(String[] args) {
		Animal a = new Animal(TypeofAnimal.birds,"Akula",true,true,true);
		System.out.print(a.toString());
		Animal c = new Animal(TypeofAnimal.amphibians,"frog");
		System.out.print(c.toString());
		Animal z = new Animal(TypeofAnimal.fish);
		System.out.print(z.toString());
	}
}
