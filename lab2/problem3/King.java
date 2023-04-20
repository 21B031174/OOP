package problem3;
import static java.lang.Math.abs;

public class King extends Piece{
	King(Color color){
		super(color);
	}
	 boolean isLegalMove(Position a, Position b,Piece[][] board) {
		 if(!super.isLegalMove(a, b, board))return false;
		 if((abs(a.x-b.x)==1||abs(a.x-b.x)==0)&&(abs(a.y-b.y)==1||abs(a.y-b.y)==0)) return true;
		 return false;	 
	 }
	 @Override
		public String toString() {
			if(super.color==Color.B) return "\u2654 ";
			return "\u265A ";
		}
}
