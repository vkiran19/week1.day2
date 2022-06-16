package week1.day2;

public class EmployeeDetails {
	
public static void main(String[] args){
		
		EmployeeDetails obj=new EmployeeDetails();
		String printEmployeeName = obj.printEmployeeName();
		System.out.println(printEmployeeName);
		int printemployeeid = obj.printemployeeid();
		System.out.println(printemployeeid);
		double printemployeesalary = obj.printemployeesalary();
		System.out.println(printemployeesalary);
		String getemployeeAddress = obj.getemployeeAddress();
		System.out.println(getemployeeAddress);
		long printEmployeeMobileNumber = obj.printEmployeeMobileNumber();
		System.out.println(printEmployeeMobileNumber);
	}
	
	
	public String printEmployeeName()
	{
		String name="vishnu";
		return name;
	}
	
	public int printemployeeid()
	{
		int employeeid=2345;
		return employeeid;
	}
	
	public String getemployeeAddress()
	{
		String address = "houseno:3,HTC,Chennai";
		return address;
		
	}
	
	public double printemployeesalary()
	{
		double salary=20000;
		return salary;
		
	}
	
	public long printEmployeeMobileNumber()
	{
		long number=7338562209L;
		return number;
	}

}
