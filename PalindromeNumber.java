/*  Palindrome Number
	Description: Write a program to check if a number is a palindrome.
	
*/
import java.util.*;
public class PalindromeNumber
{
	public static void main(String x[])
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int no=s.nextInt();
		int rem,rev=0;
		int temp=no;
		while(no!=0)
		{
			 rem=no%10;
			 rev=rev*10+rem;
			 no=no/10;
		}
		if(rev==temp)
		{
			System.out.println("Number is a palindrome");
		}
		else{
			System.out.println("Number is Not palindrome");
		}
		
	}
}

