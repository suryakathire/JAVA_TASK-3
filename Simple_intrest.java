import java.util.*;
public class Simple_intrest {
    public static void main(String arg[])
    {
        float p,r,t,sin;
        Scanner scan=new Scanner (System.in);
        System.out.println("enter the principle:");  //Program that accepts principle, rate of interest, time and compute the simple interest.
         p=scan.nextFloat();
         System.out.println("enter the rate of intrest");
         r=scan.nextFloat();
         System.out.println("enter the time and compute");
         t=scan.nextFloat();
         sin=p*r*t/100;
         System.out.println("simple interst is:"+sin);
         
    
    }
    
}
