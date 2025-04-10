/*
	. Sum of Digits
	Description: Write a program to calculate the sum of digits of a given number.
	Input: n = 234
	Output: 9
*/
import java.util.*;
public class SumOfDigit
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);	
		System.out.println("Enter Digit");
		int no=s.nextInt();
		int sum=0;
		while(no>0)
		{
			int rem=no%10;
			sum=sum+rem;
			no=no/10;
		}
		System.out.println("Sum Of Digit is:"+sum);
	}
}