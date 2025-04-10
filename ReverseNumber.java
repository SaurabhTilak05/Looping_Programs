/*
	 Reverse a Number
	Description: Write a program to reverse the digits of a given number.
*/
import java.util.*;
public class ReverseNumber
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Digits");
		int no=s.nextInt();
		int temp=no, rem,rev=0;
		while(no>0)
		{
			rem=no%10;
			rev=rev*10+rem;
			no=no/10;
		}
		System.out.println("Reverse Number is:"+rev);
	}
	
}