import java.util.*;
public class adamNumber{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int square=n*n;
        int rev1=0;
        int temp=square;
        while(temp>0){
            rev1=rev1*10+temp%10;
            temp/=10;
        }
        int rev2=0;
        temp=n;
        while(temp>0){
            rev2=rev2*10+temp%10;
            temp/=10;
        }
        int squRev=rev2*rev2;
        if(rev1==squRev){
            System.out.print("Adam Number");
        }
        else{
            System.out.print("Not an Adam Number");
        }
    }
}