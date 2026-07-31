import java.util.*;
public class prob{
    public static void main(String[] a){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(arr[i]%10!=0){
                list.add(arr[i]);
            }
        }
        for(int num:arr){
            if(num%10==0){
                list.add(num);
            }
        }
        System.out.print(list);
    }
}