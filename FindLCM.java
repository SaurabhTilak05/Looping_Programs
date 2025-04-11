/* Find Least Common Multiple (LCM)
Description: Write a program to find the least common multiple (LCM) of two numbers.

*/
import java.util.*;
public class FindLCM
{
	public static long gcd(long a,long b)
	{
		while(b!=0)
		{
			long temp=b;
			b=a%b;
			a=temp;
		}
		return a;
	}
	public static long lcm(long a,long b)
	{
		if(a==0|| b==0)
		{
			return 0;
		}
		return (a*b)/gcd(a, b);
	}
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Two Numbers");
		int no=s.nextInt();
		int n=s.nextInt();
		
		long result=lcm(n,no);
		System.out.println("LCM is:"+result);
		
	}
}