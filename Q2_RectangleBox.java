package oops;

public class Q2_RectangleBox {
	double length;
	double breadth;
	double height;
	public void save() {
		System.out.println("Rectanlura box saved successfully...");
	}
	public void area() {
		if(height==0) {
			double area=length*breadth;
			System.out.println("2D Rectanglearea=" +area);
		}else {
			double area=2*(length*breadth+breadth*height+height*length);
			System.out.println("3D Box surface area="+area);
		}
	}

}
