	/* 1. Sum of Numbers
	Description: Write a program to calculate the sum of numbers from 1 to n.
	Input: n = 5
	Output: 15
*/
import java.util.*;
public class SumOfNumberUpToNth
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter N Number");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum is:"+sum);
	}
}
