import java.util.*;
public class Swap_two_number {
    public static void main(String args[])
    {
        Scanner scan=new Scanner(System.in);
         System.out.println("enter the 1st value:");
         int a=scan.nextInt();
         System.out.println("enter the 2nd value:");
         int b=scan.nextInt();
          a=a+b;
          b=a-b;
          a=a-b;
          System.out.println("after swap 1st value is"+a);
          System.out.println("after swap 2nd value is:"+b);
        
        
    }
    
    
}
