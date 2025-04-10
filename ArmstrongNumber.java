/*  Armstrong Number
Description: Write a program to check if a number is an Armstrong number.

*/

import java.util.*;
public class ArmstrongNumber
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int no=s.nextInt();
		int temp=no;
	    int count=0,rem,sum=0;
		while(no>0)
		{
			no=no/10;
			count++;
		}
		no=temp;
		while(no>0)
		{
			int sq=1;
			rem=no%10;
			for(int i=1;i<=count;i++)
			{
				sq=sq*rem;
			}
			sum=sum+sq;
			no=no/10;
		}
		if(sum==temp)
		{
			System.out.println("Armstrong");
		}
		else{
			System.out.println("Not Armstrong ");
		}
	}
}