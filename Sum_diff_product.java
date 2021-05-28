 
import java.io.*;
import java.util.*;
public class Sum_diff_product {
    
 public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int firstInt = in.nextInt();
        System.out.print("Input 2nd integer: ");
        int secondInt = in.nextInt();
        int sum=firstInt + secondInt;
         int dif=firstInt - secondInt;
        System.out.println("Sum of two integers: "+sum );
        System.out.println("Difference of two integers: "+ dif);
        System.out.println("Product of two integers: "+ firstInt * secondInt);
        System.out.println("Average of two integers: "+(double) (firstInt + secondInt) / 2);
        System.out.println("Distance of two integers: "+ Math.abs(firstInt - secondInt));
        System.out.println("Max integer: "+ Math.max(firstInt, secondInt));
        System.out.println("Min integer: "+ Math.min(firstInt, secondInt));
    }
}
