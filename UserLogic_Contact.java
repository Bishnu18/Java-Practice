package oops;

public class UserLogic_Contact {
     public static void main(String args[]) {
    	 Contact c1=new Contact();
    	 c1.name="bishnu";
    	 c1.phn=9078459222l;
    	 c1.save();
    	 c1.details();
    	 Contact c2=new Contact();
    	 c2.name="suv";
    	 c2.phn=9768567483l;
    	 c2.save();
    	 c2.details();
     }

}
