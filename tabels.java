import java.util.*;
public class tabels {
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
	System.out.print("Enter number:");        
	int n=scan.nextInt();
        for(int i=1; i <= 10; i++)
        {
            System.out.println(n+" * "+i+" = "+n*i);
        }
    }
}

