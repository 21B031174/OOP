package problem3;

public class EmptyField extends Piece {
	
	public EmptyField(Color color) {
		// TODO Auto-generated constructor stub
		super(color);
	}
	@Override
	public String toString() {
		if(super.color==Color.B) return "\u25A1 ";
		return "\u25A0 ";
	}
	
}
