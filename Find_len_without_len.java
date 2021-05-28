 
import java.util.*;
public class Find_len_without_len {
    
 
 public static void main(String args[])
 {
            int i=0;
            String str;
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the string");
            str=sc.nextLine();
            char ch[]=str.toCharArray();

 for(char c : ch)
     {
            i++; 
     }
       System.out.println("Length of the string = "+i);
 }
}
