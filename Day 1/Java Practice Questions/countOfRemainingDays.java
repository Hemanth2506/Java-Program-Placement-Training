import java.util.*;
public class countOfRemainingDays{
    public static void main(String[] a){
        Scanner in=new Scanner(System.in);
        int day=in.nextInt();
        int month=in.nextInt();
        int year=in.nextInt();
        int[] arr={31,28,31,30,31,30,31,31,30,31,30,31};
        if((year%400==0)||(year%4==0 && year%100!=0)){
            arr[1]=29;
        }
        int completedDays=0;
        for(int i=0;i<month-1;i++){
            completedDays+=arr[i];
        }
        completedDays+=day;
        int totalDays=(arr[1]==29) ? 366:365;
        int remainingDays=totalDays-completedDays;
        System.out.println("Completed Days = "+completedDays);
        System.out.println("Remaining Days = "+remainingDays);
    }
}