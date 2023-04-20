package prob2;

public class StarTriangle {
	public int width;
	public StarTriangle(int width) {
		this.width = width;
	}
	
	
	
	public String toString() {
		String s="";
		String s1="[*]";
		for(int i=1;i<=width;i++) {
			for(int j=0;j<i;j++) {
				s+=s1;
			}
			s+="\n";
		}
		return s;
	}
}
