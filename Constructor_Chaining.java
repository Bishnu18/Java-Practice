package oops;

public class Constructor_Chaining {
	int a,b,c;

	public Constructor_Chaining(int a, int b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("from 2 argument constructor...");
	}
	public Constructor_Chaining(int a,int b,int c) {
		this(a,b); //constructor chaining
		this.c=c;
		System.out.println("from 3 argument constructor...");
	}
	public static void main(String args[]) {
		Constructor_Chaining con=new Constructor_Chaining(10, 20, 30);
		System.out.println(con.a);
		System.out.println(con.b);
		System.out.println(con.c);
	}
	

}
