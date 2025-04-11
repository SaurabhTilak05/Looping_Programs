/* Calculate Average of First N Natural Numbers
Description: Write a program to calculate the average of the first n natural numbers.

*/
import java.util.*;
public class AverageOfFirstNthNaturalNum
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int no=s.nextInt();
		int sum=0;
		for(int i=1;i<=no;i++)
		{
			sum=sum+i;
		}
		double avg=sum/no;
		System.out.println(avg);
		
	}
}