package encapsulation;

public class Clock_UserLogic {
	public static void main(String args[]) {
		Clock_Example clo=new Clock_Example(10, 12, 25);
		clo.showTime();
		clo.setHr(8);
		clo.setMin(28);
		clo.setSec(45);
		System.out.println(clo.getHr());
		System.out.println(clo.getMin());
		System.out.println(clo.getSec());
	}

}
