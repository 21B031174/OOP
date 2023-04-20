package problem4Lab3;
import java.util.Date;
import java.util.Objects;
public class Employee extends Person implements Comparable<Object> , Cloneable{
	double salary;
	Date hireDate;
	String insuranceNumber;
	Employee(String name) {
		super(name);
	}
	Employee(String name,double salary) {
		super(name);
		this.salary = salary;
		
	}
	Employee(String name,double salary , Date hireDate ) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
	}
	Employee(String name,double salary , Date hireDate , String insuranceNumber) {
		super(name);
		this.salary = salary;
		this.hireDate = hireDate;
		this.insuranceNumber = insuranceNumber;
	}

	public int compareTo(Object o) {
		Employee z = (Employee) o;
		if(z.salary>this.salary) {
			return 1;
		}
		else if(z.salary==this.salary) {
			return 0;
		}
		else {
			return -1;
		}
	}
	public Object clone() 
	  { 
	   Employee clone = new Employee(this.name,this.salary,this.hireDate,this.insuranceNumber); 
	   return clone; 
	  }
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Employee other = (Employee) obj;
		return Objects.equals(hireDate, other.hireDate) && Objects.equals(insuranceNumber, other.insuranceNumber)
				&& Double.doubleToLongBits(salary) == Double.doubleToLongBits(other.salary);
	}
	

}
