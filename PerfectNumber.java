/*Perfect Number
Description: Write a program to check if a number is perfect.
Input: n = 6
Output: Perfect
*/
import java.util.*;
public class PerfectNumber
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int no=s.nextInt();
		int temp=no;
		int sum=1;
		for(int i=2;i*i<=no;i++)
		{
			if(no%i==0)
			{
				sum=sum+i;
				if(i*i!=no)
				{
					sum=sum+no/i;
				}
			
			}
		}
		// System.out.println(sum);
		if(sum==no)
		{
			System.out.println("Perfect number");
		}
		else{
			System.out.println("Not Perfect Number");
		}
	}
}
