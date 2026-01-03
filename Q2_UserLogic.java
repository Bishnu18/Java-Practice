package oops;

public class Q2_UserLogic {
	public static void main(String args[]) {
		Q2_RectangleBox r1=new Q2_RectangleBox();
		r1.length=10;
		r1.breadth=5;
		r1.height=0;
		r1.save();
		r1.area();
		Q2_RectangleBox r2=new Q2_RectangleBox();
		r2.length=13;
		r2.breadth=7;
		r2.height=3;
		r2.save();
		r2.area();
	}

}
