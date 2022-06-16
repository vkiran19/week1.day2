package week1.day2;

public class TwoWheeler {
	
	public static void main(String[] args) 
	{
		TwoWheeler obj=new TwoWheeler();
		int noOfWheels = obj.noOfWheels();
		System.out.println(noOfWheels);
		int noOfMirrors = obj.noOfMirrors();
		System.out.println(noOfMirrors);
		boolean ispunctured = obj.ispunctured();
		System.out.println(ispunctured);
		obj.bikeName();
		double runningkm = obj.runningkm();
		System.out.println(runningkm);
		
	}
	
	public int noOfWheels()
	{
		int wheels=2;
		return wheels;
	}
	
	public int noOfMirrors()
	{
		int mirrors=2;
		return mirrors;
	}
	
	private long chasisnumber()
	{
		long chasisno=234689201L;
		return chasisno;
	}
	
	boolean ispunctured()
	{
		boolean ispunctured=false;
		return ispunctured;

	}
	
	public void bikeName()
	{
		System.out.println("REClassic");
	}
	
	private double runningkm()
	{
		double rk=23448;
		return rk;
	}

}
