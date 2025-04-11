/*Sum of All Numbers in a Range
Description: Write a program to calculate the sum of all numbers between m and n.
Input: m = 1, n = 5
Output: 15
*/
import java.util.*;
public class SumOfAllNumBetwMtoNth
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Starting value");
		int n=s.nextInt();
		System.out.println("Enter Last value");
		int no=s.nextInt();
		int sum=0;
		for(int i=n;i<=no;i++)
		{
			sum=sum+i;
		}
		System.out.println("Sum of All Between Number is:"+sum);
	}
}