/*
	Find Greatest Common Divisor (GCD)
	Description: Write a program to find the greatest common divisor (GCD) of two numbers.
*/
import java.util.*;
public class GreatestCommonDivisor
{
	public static void main(String x[])
	{
		Scanner s=new Scanner (System.in);
		System.out.println("Enter two Numbers");
		int n1=s.nextInt();
		int n2=s.nextInt();
		while(n2!=0)
		{
			int temp=n2;
			n2=n1%n2;
			n1=temp;
		}
		System.out.println(n1);
	}
}