package problem3;
import java.io.Serializable;
import java.util.Scanner;
public class Test implements Serializable{
	
	public static void main(String args[]) {
	String s = "A";
	System.out.println(s);
	Position a = new Position(),b=new Position();	
	Board board = new Board();
	Scanner in = new Scanner(System.in);
//	System.out.println((s.charAt(0)-64)+ " " +(s.charAt(1)-48));
	board.display();
	
	boolean bool=true;
	System.out.println("Q to Quit");
	while(true) {
		if(bool) {
		System.out.println("White move");
		}else {
		System.out.println("Black move");
		}
		s=in.nextLine();
		if(s.charAt(0)=='Q') break;
		
		int x1=s.charAt(0)-64,y1=s.charAt(1)-48,x2=s.charAt(3)-64,y2=s.charAt(4)-48;
//		System.out.println(x1 + " "+ y1 +" " +  x2 + " "+ y2);
		if(!board.Move(a.set(x1,y1),b.set(x2,y2))){
			System.out.println("Invalid move");
		}else {
			board.display();
			bool = !bool;
			if(board.getKingDead()!=null) {
				System.out.println("Game over, " + (board.getKingDead()==Color.B?"White":"Black") + " win!");
				break;
			}
		}
	}
	in.close();
	}

}