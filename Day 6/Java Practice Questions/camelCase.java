import java.util.*;
public class camelCase {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        String str=in.nextLine();
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(Character.isUpperCase(ch)){
                ans.append(" ");
            }
            ans.append(ch);
        }
        System.out.println(ans);
    }
}