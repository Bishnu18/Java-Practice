package encapsulation;

public class Clock_Example {
	private int hr;
	private int min;
	private int sec;
	public Clock_Example(int hr, int min, int sec) {
		super();
		this.hr = hr;
		this.min = min;
		this.sec = sec;
	}
	public int getHr() {
		return this.hr;
	}
	public void setHr(int hr) {
		if(hr>=1&&hr<=12)
		this.hr = hr;
		else 
			System.out.println("enter valid hour...");
	}
	public int getMin() {
		return this.min;
	}
	public void setMin(int min) {
		if(hr>=1&&hr<=59)
		this.min = min;
		else 
			System.out.println("enter valid minutes...");
	}
	public int getSec() {
		return sec;
	}
	public void setSec(int sec) {
		if(hr>=1&&hr<=59)
		this.sec = sec;
		else 
			System.out.println("enter valid seconds...");
	}
	public void showTime() {
		System.out.println(hr+":"+min+":"+sec);
	}
	
	

}
