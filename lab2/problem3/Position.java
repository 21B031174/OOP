package problem3;

public class Position {
	int x,y;
	Position(int a,int b){
		x=a;y=b;
	}
	public Position() {
		x=0;y=0;
	}
	Position set(int a,int b){
		x=a-1;y=8-b;
		return  this;
	}
	boolean equals(Position p) {
		return x==p.x&&y==p.y;
	}
	boolean outOfBounds() {
		return x>7||x<0||y>7||y<0;
	}
}
