package week1.day2.classroom.arrays;

import java.util.Arrays;

public class PrintDuplicatesinArray {
	
	public static void main(String[] args)
	{
		int[] arr = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int arraylength=arr.length;
		int count=0;
		
		for(int i=0;i<arr.length;i++)
		{

			for (int j=i+1;j<arr.length;j++)
			{
				if (arr[i]==arr[j])
				{
					System.out.println("duplicate value is"  +  arr[i]);
					
				}
			}
				
		}
		
		
		
	}

}
