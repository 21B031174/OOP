package problem3;
import static java.lang.Math.abs;
public class Pawn extends Piece{
	Pawn(Color color){
		super(color);
	}
	boolean isLegalMove(Position a,Position b,Piece[][] board) {
		if(!super.isLegalMove(a, b, board))return false;
		Piece pb=board[b.y][b.x];
		if((abs(a.x-b.x)==1&&abs(a.y-b.y)==1)&&!(pb instanceof EmptyField))return true;
		if(((a.y==6&&b.y==4)||(a.y==1&&b.y==3)||abs(a.y-b.y)==1)&&(a.x==b.x)) {	
			int i=(b.y>a.y?1:-1),y=a.y+i;  
			while(y!=b.y) {
//				System.out.println(i + " " + y +" " + b.y);
				if(!(board[y][b.x] instanceof EmptyField)) return false;
				y+=i;
			}
			return true;
		}
		return false;
		}
	
	@Override
	public String toString() {
		if(super.color==Color.B) return "\u2659 ";
		return "\u265F";
	}
}
