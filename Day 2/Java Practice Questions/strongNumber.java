import java.util.*;
public class strongNumber{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int temp=n;
        int sum=0;
        while(n>0){
            int digit=n%10;
            int fact=1;
            for(int i=1;i<=digit;i++){
                fact*=i;
            }
            sum+=fact;
            n/=10;
        }
        if(sum==temp){
            System.out.print("Strong Nber");
        }
        else{
            System.out.print("Not a Strong Nber");
        }
    }
}