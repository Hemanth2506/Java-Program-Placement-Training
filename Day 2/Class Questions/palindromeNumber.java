import java.util.*;
public class palindromeNumber{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt(),temp=n,rev=0;
        while(n>0){
            rev=rev*10+n%10;
            n/=10;
        }
        System.out.print(temp==rev?"Palindrome Number":"Not a Palindrome Number");
    }
}