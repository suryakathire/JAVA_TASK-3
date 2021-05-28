import java.util.Scanner;
public class difference_two_numbers {
    
 
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        System.out.print("Input 1st integer: ");
        int first = scan.nextInt();
        System.out.print("Input 2nd integer: ");
        int second = scan.nextInt();
        int c=first-second;
        System.out.println("Difference of two integers:"+c);
        
    }
}
