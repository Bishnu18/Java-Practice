package oops;

public class Q1_Userlogic {
     public static void main(String srgs[]) {
    	 Q1_Laptop l1=new Q1_Laptop("Lenovo", 8, 80000, 512);
    	 l1.save();
    	 l1.details();
    	 Q1_Laptop l2=new Q1_Laptop("dell", 12, 70000, 1024);
    	 l2.save();
    	 l2.details();
     }

}
