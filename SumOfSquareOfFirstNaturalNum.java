/* Sum of Squares of First N Natural Numbers
Description: Write a program to calculate the sum of squares of the first n natural numbers.
Input: n = 3


Output: 14
*/
import java.util.*;
public class SumOfSquareOfFirstNaturalNum
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Nth Value");
		int no=s.nextInt();
		int sum=0;
		for(int i=1;i<=no;i++)
		{
			sum=sum+i*i;
		}
		System.out.println("Sum of Square is:"+sum);
	}
}