import java.util.*;
public class happyNumber{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n!=1&&n!=4){
            int sum=0;
            while(n>0){
                int digit=n%10;
                sum+=digit*digit;
                n/=10;
            }
            n=sum;
        }
        if(n==1){
            System.out.print("Happy Number");
        }
        else{
            System.out.print("Not a Happy Number");
        }
    }
}