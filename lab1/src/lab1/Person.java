package lab1;

class Person {
	private String name = "Unde";
	private String soname = "Undef";
	private int age = 0; 
	private Gender gender = Gender.Boi;
	
	Person(String name,String soname,int age,Gender gender){
		this.name = name;
		this.soname = soname;
		this.age = age;
		this.gender = gender;
	}
	public String toString() {
		return "Name:"+name+'\n'+"Soname:"+soname+'\n'+"Age:"+age+'\n'+"Gender:"+gender+'\n';
	}
	public Gender getGender() {
		return gender;
	}
	public int getAge() {
		return age;
	}
}
