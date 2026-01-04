package oops;

public class Q7_Pc {
	String brand;
	String color;
	int ram;
	int rom;
	double price;
	public Q7_Pc(String brand, String color) {
		super();
		this.brand = brand;
		this.color = color;
	}
	public Q7_Pc(String brand, String color, int ram) {
		this(brand, color);
		this.ram = ram;
	}
	
	public Q7_Pc(String brand, String color, int ram, int rom) {	
		this(brand, color, ram);
		this.rom = rom;
	}
	public Q7_Pc(String brand, String color, int ram, int rom, double price) {
		this(brand, color, ram, rom);
		this.price = price;
	}
	public void details() {
		System.out.println("brand  :"+brand);
		System.out.println("color  :"+color);
		System.out.println("ram    :"+ram+"GB");
		System.out.println("rom    :"+rom+"GB");
		System.out.println("price  :"+price);
	}

}
