package problem3;

public class Queen extends Piece{
	Queen(Color color){
		super(color);
	}
	 boolean isLegalMove(Position a, Position b,Piece[][] board) {
		 if(!super.isLegalMove(a, b, board))return false;
		 Piece pa=board[a.y][a.x];
		 return (new Bishop(pa.color)).isLegalMove(a, b, board)||(new Rook(pa.color)).isLegalMove(a, b, board);
	 }
	 @Override
		public String toString() {
			if(super.color==Color.B) return "\u2655 ";
			return "\u265B ";
		}
}
