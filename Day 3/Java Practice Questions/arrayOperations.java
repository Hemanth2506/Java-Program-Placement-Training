import java.util.*;
public class arrayOperations{
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=in.nextInt();
        }
        int min=arr[0],max=arr[0],sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
            sum+=arr[i];
        }
        double avg=(double)sum/n;
        System.out.println("Min = "+min);
        System.out.println("Max = "+max);
        System.out.println("Sum = "+sum);
        System.out.print("Average = "+avg);
    }
}