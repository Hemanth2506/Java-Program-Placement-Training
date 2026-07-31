import java.util.*;
public class luckFour{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int t=in.nextInt();
        while(t-->0){
            int n=in.nextInt();
            int count=0;
            while(n>0){
                if(n%10==4){
                    count++;
                }
                n/=10;
            }
            System.out.println(count);
        }
    }
}