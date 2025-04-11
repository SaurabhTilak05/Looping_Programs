/* Prime Factorization
Description: Write a program to perform prime factorization of a number n.
Input: n = 12
Output: 2 2 3
*/
import java.util.*;
public class PrimeFactirization
{
	public static void primeFact(int no)
	{
		while(no%2==0)
		{
			System.out.print(2+" "); 	
			no=no/2;
		}
		for(int i=3;i<= Math.sqrt(no);i=i+2)
		{
			while(no%i==0)
			{
				System.out.print(i+" "); 
				no=no/i;
			}
		}
		if(no>2)
		{
			System.out.print(no+" ");
		}
		// System.out.println("");
	}
	
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number ");
		int no=s.nextInt();
		primeFact(no);
	}
	
}

