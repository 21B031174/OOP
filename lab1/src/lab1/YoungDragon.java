package lab1;

public class YoungDragon extends DragonLaunch {
	public boolean willDragonEatOrNot(){
		if(lastPerson.getAge()>18) {
			return super.willDragonEatOrNot();
		}
		else {
			System.out.println("This Person is Young");
			return false;
		}
	}
}
