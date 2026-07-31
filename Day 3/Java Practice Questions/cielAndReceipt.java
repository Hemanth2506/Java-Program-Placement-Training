import java.util.*;
public class cielAndReceipt{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int count=0;
            for(int i=11;i>=0;i--){
                int value=(int)Math.pow(2,i);
                count+=n/value;
                n%=value;
            }
            System.out.println(count);
        }
    }
}