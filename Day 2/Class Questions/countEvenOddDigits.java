import java.util.*;
public class countEvenOddDigits{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int even=0,odd=0;
        while(n>0){
            int digit=n%10;
            if(digit%2==0)
                even++;
            else
                odd++;
            n/=10;
        }
        System.out.println("Even Digits = "+even);
        System.out.print("Odd Digits = "+odd);
    }
}