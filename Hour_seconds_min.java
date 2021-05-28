import java.util.*;
public class Hour_seconds_min {
    public static void main(String args[])
    {
        Scanner scan =new Scanner(System.in);
        System.out.println("enter the seconds:");
        int seconds=scan.nextInt();
        int sec=seconds%60;
        int hour=seconds/60;
        int min=hour%60;
        hour=hour/60;
        System.out.println("");
        System.out.println(hour+ ":"+min+":"+sec);
        
    }
}
