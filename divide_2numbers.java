import java.util.*;
public class divide_2numbers {
   public static void main(String args[])
   {
       Scanner sc=new Scanner(System.in);
       System.out.println("enter the a value:");
       int a=sc.nextInt();
       System.out.println("enter the b value:");
       int  b=sc.nextInt();
       if(a/b==0)
       {
          int c=a/b;
           System.out.println("divided value:"+c);
       }
       else
       {
           System.out.println("division not possible");
       }
   }
}
