package week1.day2;

public class Car {
	
	public static void main(String[] args)
	{
		Car obj=new Car();
		boolean applyAccelarate = obj.applyAccelarate();
		System.out.println(applyAccelarate);
		boolean applyBreak = obj.applyBreak();
		System.out.println(applyBreak);
		boolean applyGear = obj.applyGear();
		System.out.println(applyGear);
		boolean switchonAC = obj.switchonAC();
		System.out.println(switchonAC);
	}
	
	public boolean applyBreak()
	{
		boolean isbreakapplied=true;
		return isbreakapplied;
	}
	
	public boolean applyGear()
	{
		boolean isgearapplied=true;
		return isgearapplied;
	}
	
	boolean switchonAC()
	{
		boolean isACon=false;
		return isACon;
	}
	
	private boolean applyAccelarate()

	{
		boolean isAccelerateapplied=true;
		return isAccelerateapplied;
	}

}
