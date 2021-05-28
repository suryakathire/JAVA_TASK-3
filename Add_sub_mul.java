import java.util.*;
public class Add_sub_mul {
    public static void main(String[]args)
    {
        int a,b,c,d,e,f;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the a value:");
         a=scan.nextInt();
         System.out.println("enter the b value:");
         b=scan.nextInt();
         
         c=a+b;
         System.out.println("add value is"+c);
         d=a-b;
         System.out.println("sub value is:"+d);
         e=a*b;
         System.out.println("mul vaue is:"+e);
         f=a/b;
         System.out.println("div value is:"+f);
         
    }
}
