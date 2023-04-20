package lab1;


public class MainDragon {
	public static void main(String[] args) {
		Person G = new Person("Aika","Hjajsk",18,Gender.Girl);
		Person B = new Person("Nurusltan","Turugeldiev",12,Gender.Boi);
		Person g = new Person("Aika","Hjajsk",14,Gender.Girl);
		Person b = new Person("ashjf","ashjkfas",124,Gender.Boi);
		Superman s = new Superman("Superman","Super",11,Gender.Boi);

//		
		System.out.println(s.toString());
		YoungDragon dg = new YoungDragon();
		dg.kidnap(s);//s
		dg.kidnap(b);//b
		dg.kidnap(g);//g
		dg.kidnap(G);//b
		dg.kidnap(B);//b
		System.out.println(dg.willDragonEatOrNot());
	}
}