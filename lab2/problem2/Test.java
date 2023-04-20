package problem2;
import java.util.HashSet;
public class Test{
      
    public static void main(String[] args) {
    	Drink p2 =  new Drink();
    	System.out.println(p2.equals(null));
    	HashSet<Drink>hs = new HashSet<Drink>() {{
    		add(new Alcohol("Name", 18));
    		add(new Alcohol("Name", 18));
    		add(new Drink("Name"));
    		add(new Drink("Name"));
    	}};
    	for(Drink p:hs) {
    		System.out.println(p);
    	}
    }			
    
}