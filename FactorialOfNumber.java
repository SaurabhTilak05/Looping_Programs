/*  2. Factorial of a Number
	Description: Write a program to compute the factorial of a given number n.
	Input: n = 4
	Output: 24
*/
import java.util.*;
public class FactorialOfNumber
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number for Factorial");
		int n=s.nextInt();
		long fact=1;
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println(fact);
		
	}
}