import java.util.*;
public class amicablePair{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        int sum1=0;
        int sum2=0;
        for(int i=1;i<a;i++){
            if(a%i==0){
                sum1+=i;
            }
        }
        for(int i=1;i<b;i++){
            if(b%i==0){
                sum2+=i;
            }
        }
        if(sum1==b&&sum2==a){
            System.out.print("Amicable Pair");
        }
        else{
            System.out.print("Not an Amicable Pair");
        }
    }
}