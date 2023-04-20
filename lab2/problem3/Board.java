package problem3;
//import java.util.ArrayList;
public class Board {
	private EmptyField wh=new EmptyField(Color.W),bl=new EmptyField(Color.B); 
	private Pawn wP = new Pawn(Color.W),bP = new Pawn(Color.B);
	private Knight wk = new Knight(Color.W),bk = new Knight(Color.B);
	private Bishop wB = new Bishop(Color.W),bB = new Bishop(Color.B);
	private Rook wR = new Rook(Color.W),bR = new Rook(Color.B);
	private Queen wQ = new Queen(Color.W),bQ = new Queen(Color.B);
	private King wK = new King(Color.W),bK = new King(Color.B);
	private Color KingDead = null;
	private Piece[][] board= {
		{bR,bk,bB,bQ,bK,bB,bk,bR},
		{bP,bP,bP,bP,bP,bP,bP,bP},
		{wh,bl,wh,bl,wh,bl,wh,bl},
		{bl,wh,bl,wh,bl,wh,bl,wh},
		{wh,bl,wh,bl,wh,bl,wh,bl},
		{bl,wh,bl,wh,bl,wh,bl,wh},
		{wP,wP,wP,wP,wP,wP,wP,wP},
		{wR,wk,wB,wQ,wK,wB,wk,wR}
		};
	char[] bottom = new char[]{'A','B','C','D','E','F','G','H'};
	Board(){}
	public void display() {
		System.out.print("  ");
		for(char c:bottom) {
			System.out.print(c + " ");			
		}
		System.out.println();
		for(int i=0;i<8;i++) {
			System.out.print((8-i) + " ");
			for(int j=0;j<8;j++) {
				System.out.print(board[i][j]);
			}
			System.out.println((8-i));
		}
		System.out.print("  ");
		for(char c:bottom) {
			System.out.print(c + " ");			
		}
		System.out.println();
		
	}
	boolean Move(Position a,Position b) {
		if(board[a.y][a.x].isLegalMove(a, b,board)) {
			if(board[b.y][b.x] instanceof King) KingDead=board[b.y][b.x].color;
			board[b.y][b.x] = board[a.y][a.x];
			board[a.y][a.x]= ((a.x+a.y)%2==0?wh:bl);
			if((board[b.y][b.x] instanceof Pawn)&&(b.y==0||b.y==7))board[b.y][b.x]=new Queen(board[b.y][b.x].color);
			return true;
		}
		return false;
	}
	public Color getKingDead() {
		return KingDead;
	}

}
