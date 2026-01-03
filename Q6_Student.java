package oops;
// Constructor overloading 
public class Q6_Student {
	String name;
	int id;
	double tenth;
	double inter;
	public Q6_Student(String name, int id, double tenth, double inter) {
		super();
		this.name = name;
		this.id = id;
		this.tenth = tenth;
		this.inter = inter;
	}
	public Q6_Student(String name, int id, double tenth) {
		super();
		this.name = name;
		this.id = id;
		this.tenth = tenth;
	}
	public void detail() {
		System.out.println("name of studenbt :"+name);
		System.out.println("id of student :"+id);
		System.out.println("10th pass :"+tenth);
		if(inter!=0) {
			System.out.println("12th pass");
		}
	}

}
