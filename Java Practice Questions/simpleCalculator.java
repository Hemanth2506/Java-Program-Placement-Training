import java.util.*;
public class simpleCalculator{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        int b=in.nextInt();
        char op=in.next().charAt(0);
        switch(op){
            case '+':
                System.out.print(a+b);
                break;
            case '-':
                System.out.print(a-b);
                break;
            case '*':
                System.out.print(a*b);
                break;
            case '/':
                System.out.print(a/b);
                break;
            case '%':
                System.out.print(a%b);
                break;
        }
    }
}