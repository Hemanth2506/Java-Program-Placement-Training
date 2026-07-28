import java.util.*;
public class invertedRightHollowTriangle{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        for(int i=n;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(i==n||j==1||j==i){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}