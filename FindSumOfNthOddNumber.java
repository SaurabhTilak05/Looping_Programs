 /*Sum of First N Odd Numbers
Description: Write a program to calculate the sum of the first n odd numbers.
*/

import java.util.*;
public class FindSumOfNthOddNumber
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Nth number");
		int no=s.nextInt();
		int sum=0;
		for(int i=1;i<=2*no-1;i++)
		{
			if(i%2!=0)
			{
				sum=sum+i;
			}
		}	
		System.out.println("Sum Of Odd Numbers is:"+sum);
		
	}
}
