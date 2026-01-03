package oops;

public class Q1_Laptop {
	private String brand;
	private int ram;
	private double price;
	private int storage;
	
	public Q1_Laptop(String brand, int ram, double price, int storage) {
		this.brand=brand;
		this.ram=ram;
		this.price=price;
		this.storage=storage;
	}
	public void save() {
		System.out.println("Laptop saved successfully...");
	}
	public void details() {
		System.out.println("Brand :" +brand);
		System.out.println("RAM :" +ram+ "GB");
		System.out.println("Price :" +price);
		System.out.println("Storage :" +storage+ "GB");
	}

}
