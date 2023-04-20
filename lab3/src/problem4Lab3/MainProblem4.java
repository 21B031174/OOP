package problem4Lab3;

public class MainProblem4 {
	public static void main(String[] args) {
		Employee ep = new Employee("Arsen",150,null,"728193");
		Employee ep1 = new Employee("Arman",151,null,"7281931");
		Employee ep2 = new Employee("Beka",150,null,"7281932");
		Employee ep3 = new Employee("AAA",10,null,"7281933");
		Employee ep4 = new Employee("BBB",120,null,"7281934");
		System.out.println(ep.compareTo(ep1));
		System.out.println(ep1.compareTo(ep2));
		System.out.println(ep2.compareTo(ep));
		Manager m = new Manager("CCC",123,null,"3728193",10);
		Manager m2 = new Manager("GGG",123,null,"3728193",13);
		m.array.add(ep1);
		m.array.add(ep2);
		m2.array.add(ep3);
		m.array.add(ep4);
		System.out.println(m.compareTo(m2));
		System.out.println(m2.compareTo(m));

		Manager m3 = new Manager("ars1",12342,null,"3728193",11);
		System.out.println(m3.compareTo(m2));
		Manager mc = new Manager("ars2",12342,null,"3728193",11);
		Manager clone = m;
		clone.setName("Hello");
		System.out.println(clone.toString());
		
	}
}
