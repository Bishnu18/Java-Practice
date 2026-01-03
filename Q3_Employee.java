package oops;

public class Q3_Employee {
	 String name;
	 int id;
	 double sal;
	 String desig;
	public Q3_Employee(String name, int id, double sal, String desig) {
		super();
		this.name = name;
		this.id = id;
		this.sal = sal;
		this.desig = desig;
	}
	public void save() {
		System.out.println("employee saved successfully...");
	}
	public void detail() {
		System.out.println("emp name :"+name);
		System.out.println("emp id :"+id);
		System.out.println("emp sal :"+sal);
		System.out.println("emm desig :"+desig);
	}

}
