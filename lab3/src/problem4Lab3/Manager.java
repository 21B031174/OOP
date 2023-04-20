package problem4Lab3;
import java.util.Date;
import java.util.Objects;
import java.util.Vector;
public class Manager extends Employee implements Cloneable , Comparable<Object>  {
	Vector <Employee> array = new Vector<Employee>();
	int bonus ;
	Manager(String name,double salary , Date hireDate , String insuranceNumber , int bonus) {
		super(name,salary,hireDate,insuranceNumber);
		this.bonus = bonus;
	}
	
	public void add(Object o) {
		Employee z = (Employee) o;
		array.add(z);
		bonus++;
	}
	
	

	@Override
	public String toString() {
		return "Manager [array=" + array + ", bonus=" + bonus + "]";
	}
	
	public int compareTo(Object o) {
		Manager m = (Manager)o; 
		if(m.salary>this.salary) {
			return 1;
		}
		else if(m.salary==this.salary) {
			if(m.bonus>this.bonus) {
				return 1;
			}
			else if(m.bonus==this.bonus) {
				return 0;
			}
			else {
				return -1;
			}
		}
		else {
			return -1;
		}
		
	}
	public Object clone() 
	{ 
	   Manager clone = new Manager(this.name,this.salary,this.hireDate,this.insuranceNumber,this.bonus); 
	   return clone; 
	}
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Manager other = (Manager) obj;
		return Objects.equals(array, other.array);
	}
	

}
