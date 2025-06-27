
// Q2. Write a java program to calculate the sum of 1 to nth Armstrong number


import java.util.*;
public class SumNthArmstrong
{
    public static boolean isArmst(int no){
        int count=0;
        int temp=no;
        while(no>0)
		{
			no=no/10;
			count++;
		}
        int sum=0;
		no=temp;
		while(no>0)
		{
			int sq=1;
			int rem=no%10;
			for(int i=0;i<count;i++)
			{
				sq=sq*rem;
			}
			sum=sum+sq;
			no=no/10;
		}
        return sum==temp;
    }
    public static int SumNthArmstrong(int n)
    {
        int sum=0;
        for(int i=1;i<= n;i++)
        {
            if(isArmst(i)){
                sum=sum+i;
            }
        }
        return sum;
    }

    public static void main(String x[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number");
       int num = s.nextInt();
        System.out.println("The Sum is " + SumNthArmstrong(num));
    }
}
