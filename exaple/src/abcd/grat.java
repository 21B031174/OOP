package abcd;
import java.util.Vector;

import lab1.Student;
public class grat {
	private int max=0;
	private Student name_max;
	private int min=1000;
	private Student name_min;
	private double avarage;
	private int cnt=0;
	int ArrForStudent[]=new int[11];
	Vector <Student> arr = new Vector<Student>();
	public void InsertStu(Student stu) {
		if(max<stu.getPoint()) {
			max=stu.getPoint();
			name_max=stu;
		}
		if(min>stu.getPoint()) {
			min = stu.getPoint();
			name_min = stu;
		}
		if(stu.getPoint()>=0 && stu.getPoint()<10) {
			ArrForStudent[0]+=1;
		}
		if(stu.getPoint()>9 && stu.getPoint()<=19) {
			ArrForStudent[1]+=1;
		}
		if(stu.getPoint()>19 && stu.getPoint()<=29) {
			ArrForStudent[2]+=1;
		}
		if(stu.getPoint()>29 && stu.getPoint()<=39) {
			ArrForStudent[3]+=1;
		}
		if(stu.getPoint()>39 && stu.getPoint()<=49) {
			ArrForStudent[4]+=1;
		}
		if(stu.getPoint()>49 && stu.getPoint()<=59) {
			ArrForStudent[5]+=1;
		}
		if(stu.getPoint()>59 && stu.getPoint()<=69) {
			ArrForStudent[6]+=1;
		}
		if(stu.getPoint()>69 && stu.getPoint()<=79) {
			ArrForStudent[7]+=1;
		}
		if(stu.getPoint()>79 && stu.getPoint()<=89) {
			ArrForStudent[8]+=1;
		}
		if(stu.getPoint()>89 && stu.getPoint()<=99) {
			ArrForStudent[9]+=1;
		}
		if(stu.getPoint()>=100) {
			ArrForStudent[10]+=1;
		}
		avarage += stu.getPoint();
		cnt+=1;
		arr.add(stu);
	}
}
