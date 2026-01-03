package oops;

public class Q4_UserLogic {
	public static void main(String args[]) {
		Q4_Mobile m1=new Q4_Mobile("xiomi", "blue", 30000, 8);
		m1.save();
		m1.detail();
		Q4_Mobile m2=new Q4_Mobile("samsung", "gold", 80000, 12);
		m2.save();
		m2.detail();
	}

}
