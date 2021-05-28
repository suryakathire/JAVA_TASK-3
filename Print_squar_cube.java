 import java.util.*;
 
public class Print_squar_cube {
    public static void main(String arg[])
    { 
        int a;
    
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value");
        a=scan.nextInt();
        System.out.println("square     cube");
        for(int i=1;i<=a;i++)
        {
             
                int n=i*i;
                int j=i*i*i;
                System.out.println(+n+"          "+j);
        }
     
        
        
    }
}
