package problem1Lab3;

public class MainProblem1 {
	public static void infoRun(info x) {
		System.out.println(x.running());
	}
	public static void main(String[] args) {
		app a2  = new app("instagram",3);
		game g2 = new game("Clash",4);
		infoRun(a2);
		infoRun(g2);
		info ap = new app("Telega",1);
		info gm = new game("Pubg",2);
		infoRun(ap);
		infoRun(gm);		
	}
}
