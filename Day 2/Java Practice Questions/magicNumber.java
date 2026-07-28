import java.util.*;
public class magicNumber{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        while(n>9){
            int sum=0;
            while(n>0){
                sum+=n%10;
                n/=10;
            }
            n=sum;
        }
        if(n==1){
            System.out.print("Magic Number");
        }
        else{
            System.out.print("Not a Magic Number");
        }
    }
}