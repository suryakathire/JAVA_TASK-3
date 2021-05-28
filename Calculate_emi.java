
import java.util.*;
public class Calculate_emi {
    
  public static void main(String []args)
    {
         
       Scanner X = new Scanner(System.in);
         
        double principal, rate, time, emi;
  
        System.out.print("Enter principal: ");
        principal = X.nextFloat();
      
        System.out.print("Enter rate: ");
        rate = X.nextFloat();
      
        System.out.print("Enter time in year: ");
        time = X.nextFloat();
      
        rate=rate/(12*100);  
        time=time*12; 
      
        emi= (principal*rate*Math.pow(1+rate,time))/(Math.pow(1+rate,time)-1);
      
        System.out.print("Monthly EMI is= "+emi+"\n");
                 
    }
}
