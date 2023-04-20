package lab1;
import java.util.*;
public class DragonLaunch {
	private boolean killOrNot=true;
	public Person lastPerson;
	DragonLaunch(){
		this.lastPerson = new Person("","",0,Gender.Boi);
	}
	Vector <Person> arr = new Vector<Person>();
	public void kidnap(Person pers) {
		if(pers instanceof Superman) {
			System.out.println("OOUU Superman");
			Superman pers2 = (Superman)pers;
			pers2.kill();
			killOrNot = false;
		}
		else if(killOrNot){	
			lastPerson = pers;
			arr.add(pers);
		}
	}
	public boolean willDragonEatOrNot() {
		if(!killOrNot) {
			System.out.println("Dragon was Kill");
			return false;
		}
		int cnt=0;
		for(int i=0;i<arr.size();i+=1) {
			if(arr.get(i).getGender()==Gender.Girl) {
				cnt--;
			}
			else {
				cnt+=1;
			}
			if(cnt<0) {
				return true;
			}
		}
		return (cnt!=0)?true:false;
	}	
}
