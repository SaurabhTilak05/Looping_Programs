/* 
	4. Prime Numbers
	Description: Write a program to print all prime numbers up to a given number n.
	
*/
import java.util.*;
public class PrintAllPrimeNumber
{
		public static void main(String x[])
		{
			Scanner s=new Scanner(System.in);
			System.out.println("Enter Nth to prime");
			int n=s.nextInt();
			for(int i=2;i<=n;i++)
			{
				if(isPrime(i))
				{
					System.out.println(i);
				}
			}
			System.out.println("");
		}
			public static boolean isPrime(int no)
			{
				int count=0;
				boolean b=false;
				for(int i=1;i<=no;i++)
				{
					if(no%i==0)
					{
						count++;
					}
				}
				return count==2;
				
				
			}
		
}