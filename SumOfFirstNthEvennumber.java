/*Sum of First N Even Numbers
Description: Write a program to calculate the sum of the first n even numbers.
Input: n = 4
Output: 20
*/
import java.util.*;
public class SumOfFirstNthEvennumber
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Nth number");
		int no=s.nextInt();
		int sum=0;
		for(int i=1;i<=2*no;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
		}	
		System.out.println("Sum Of Odd Numbers is:"+sum);
	}
}