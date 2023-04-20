package abcd;

public class tem {
	double degree;
	char val;
	tem(){
		this.degree = 0;
		this.val = 'c';
	}
	tem(double x){
		this.degree = x;
		this.val = 'c';
	}
	tem(char a){
		this.degree = 0;
		this.val = a;
	}
	tem(double a,char b){
		this.degree = a;
		this.val = b;
	}
	public double getC() {
		if(val=='c') {
			return degree;
		}
		else {
			return 5*(degree-32)/9;
		}
	}
	public double getF() {
		if(val=='c') {
			return 9*(degree/5)+32;
		}
		else {
			return degree;
		}
	}
}
