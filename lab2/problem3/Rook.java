package problem3;

public class Rook extends Piece{
	Rook(Color color){
		super(color);
	}
	 boolean isLegalMove(Position a, Position b,Piece[][] board) {
		 if(!super.isLegalMove(a, b, board))return false;
		 if((a.x==b.x||a.y==b.y)) {
			 int i=(a.x==b.x?0:(a.x>b.x?-1:1)),j=(a.y==b.y?0:(a.y>b.y?-1:1)),x=a.x+i,y=a.y+j;
			 while(x!=b.x||y!=b.y) {
//				 System.out.println((a.x+i)+ " "+(a.y+j)+ " "+b.x+ " "+b.y+ " "+i+ " "+j );
				 if(!(board[y][x] instanceof EmptyField))return false;
				 x+=i;y+=j;
			 }
			 return true;
		 }
		 return false;
	 }
	 @Override
		public String toString() {
			if(super.color==Color.B) return "\u2656 ";
			return "\u265C ";
		}
}
