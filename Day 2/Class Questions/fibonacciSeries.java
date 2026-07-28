import java.util.*;
public class fibonacciSeries {
    public static void main(String[] a){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=0;i<n;i++){
            System.out.print(fibonacci(i)+" ");
        }
    }
    static int fibonacci(int n){
        if(n<=1) return n;
        return fibonacci(n-1)+fibonacci(n-2);
    }
}
