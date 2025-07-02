import java.util.*;

public class PrintPrimeNumbers
{
    public static boolean isPrime(int no){
        int count=0;
        if(no<=1){
            return false;
        }
        else{
            for(int i=2;i<=no/2 ;i++){
                if(no%i==0){
                    count++;
                }
            }
              if(count!=0){
                return false;
            }
        }

      return true;   
    }
    public static void PrimeNum(int no){
        int count=0;
        for(int i=0;i<100;i++)
        {
            if(isPrime(i)){
                count++;
                System.out.print(i+" ");
                if(count==no){
                    break;
                }
               
            }
        }
    }
    public static void main(String x[]){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Number");
        int n=s.nextInt();
        PrimeNum(n);
       
    }
}