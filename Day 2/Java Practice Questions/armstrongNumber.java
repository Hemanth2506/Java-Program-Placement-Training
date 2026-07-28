import java.util.*;
public class armstrongNumber{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            sum+=digit*digit*digit;
            n/=10;
        }
        if(sum==temp){
            System.out.print("Armstrong Number");
        }
        else{
            System.out.print("Not an Armstrong Number");
        }
    }
}