import java.util.*;
public class countOccurence {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String s=in.nextLine();
        int c=0;
        for(char ch:s.toCharArray()){
            if(ch=='e'){
                c++;
            }
        }
        System.out.print(c);
    }
}