import java.util.*;
public class Not_div_by12 {
    public static void main(String[]args)
    {
        int sum=0;
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the value:");
        int a=scan.nextInt();
        for (int i=1;i<a;i++)
        {
            if(i%12!=0)
            {
                 sum=sum+i;
            }
            
        }
        System.out.println(""+sum);
    }
   
    
}
