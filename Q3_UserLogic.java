package oops;

public class Q3_UserLogic {
	public static void main(String args[]) {
		Q3_Employee e1=new Q3_Employee("suv", 12, 25000, "Devops");
		e1.save();
		e1.detail();
		Q3_Employee e2=new Q3_Employee("bishnu", 13, 23000, "Full-stack");
		e2.save();
		e2.detail();
		
		if(e1.sal>e2.sal) {
			System.out.println("Employee with higher salary..");
			e1.detail();
		}else {
			System.out.println("employee with higer salary..");
			e2.detail();
		}
	}

}
