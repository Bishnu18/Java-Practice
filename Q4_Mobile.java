package oops;

public class Q4_Mobile {
	String brand;
	String color;
	double price;
	int ram;
	public Q4_Mobile(String brand, String color, double price, int ram) {
		super();
		this.brand = brand;
		this.color = color;
		this.price = price;
		this.ram = ram;
	}
	public void save() {
		System.out.println("mobile saved successfully..");
	}
	public void detail() {
		System.out.println("brand :"+brand);
		System.out.println("color :"+color);
		System.out.println("price :"+price);
		System.out.println("ram :"+ram);
	}

}
