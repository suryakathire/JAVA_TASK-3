import java.util.*;
public class sum_odd_even {
    public static void main(String[]args)
    {
        int n=50; int even=0; int odd=0;
        System.out.println("even value is:");  
        for (int i=1;i<=n;i++)
        {
            if(i%2!=0)
            {
                 odd=odd+i;
                  
            }else
            {
                System.out.println(""+i);  
            }
        }
         
        System.out.println("sum of odd value is:"+odd);
    }
}
