package problem3;

import static java.lang.Math.abs;

public class Bishop extends Piece{
	Bishop(Color color){
		super(color);
	} 
	boolean isLegalMove(Position a, Position b,Piece[][] board) {
		if(!super.isLegalMove(a, b, board)) return false;
		 if(abs(a.x-b.x)==abs(a.y-b.y)) {
			 int i=(a.x>b.x?-1:1),j=(a.y>b.y?-1:1),x=a.x+i,y=a.y+j;
			 while(x!=b.x) {
				 if(!(board[y][x] instanceof EmptyField)) return false;
				 x+=i;y+=j;
			 }
			 return true;
		 }
		 return false;
	 }
	 @Override
		public String toString() {
			if(super.color==Color.B) return "\u2657 ";
			return "\u265D ";
		}
}
