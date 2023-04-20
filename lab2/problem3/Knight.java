package problem3;
import static java.lang.Math.abs;
public class Knight extends Piece{
	Knight(Color color){
		super(color);
	}
	 boolean isLegalMove(Position a, Position b,Piece[][] board) {
		 if(!super.isLegalMove(a, b, board))return false;
		 if(abs(a.x-b.x)*abs(a.y-b.y)==2) return true;
		 return false;
	 }
	 @Override
		public String toString() {
			if(super.color==Color.B) return "\u2658 ";
			return "\u265E ";
		}
}
