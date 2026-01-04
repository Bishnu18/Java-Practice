package oops;

public class Q7_UserLogic {
	public static void main(String[] args) {

        Q7_Pc p1 = new Q7_Pc("Dell", "i3");
        p1.details();

        Q7_Pc p2 = new Q7_Pc("HP", "i5", 8);
        p2.details();

        Q7_Pc p3 = new Q7_Pc("Lenovo", "i7", 16, 512);
        p3.details();

        Q7_Pc p4 = new Q7_Pc("Asus", "Ryzen 7", 32, 1024, 95000);
        p4.details();
    }

}
