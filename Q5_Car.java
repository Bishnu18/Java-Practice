package oops;

public class Q5_Car {
	String brand;
	double price;
	String color;
	public Q5_Car(String brand, double price, String color) {
		super();
		this.brand = brand;
		this.price = price;
		this.color = color;
	}
	public void detail() {
		System.out.println("car name :"+brand);
		System.out.println("price :"+price);
		System.out.println("color :"+color);
	}
	

}
