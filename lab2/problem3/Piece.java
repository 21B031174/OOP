package problem3;
public abstract class Piece {
	Color color;
	Piece(Color color){
		this.color = color;
	}
	boolean isLegalMove(Position a, Position b,Piece[][] board){
		if((a.outOfBounds()||b.outOfBounds()||a.equals(b))) return false;
		Piece pa=board[a.y][a.x],pb=board[b.y][b.x];
		
		if((pa instanceof EmptyField))return false;
		if(!(pb instanceof EmptyField))return pa.color!=pb.color;
		return true;
	};
	
}