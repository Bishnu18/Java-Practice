package oops;
//Blue print class example

public class Contact {
	String name;
	long phn;
	public void save() {
		System.out.println("contact saved sucess");
	}
	public void details() {
		System.out.println("name is :" +this.name);
		System.out.println("phn number :"+phn);
	}

}
