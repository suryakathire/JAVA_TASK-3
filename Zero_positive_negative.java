import java.util.*;
public class Zero_positive_negative {
    public static void main (String args[])
    {
        int num;
        char choice;
        do
        {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter the number:");
        num=scan.nextInt();
        if(num==0)
        {
             System.out.println("number is ZERO");
        }
        else if(num>0)
        {
            System.out.println("number is positive"); 
        }
        else
        {
            System.out.println("number is negative");
        }
            System.out.println("want you check again (press Y/y for 'yes'");
             choice = scan.next().charAt(0);
        } while(choice =='y'||choice=='y');
        System.out.println("tata bye bye...!!");
    }
}
