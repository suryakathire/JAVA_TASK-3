import java.util.*;
public class Factorial {
    
  
 public static void main(String args[]){  
  int i,fact=1;  
  Scanner scan=new Scanner(System.in);
     System.out.println("enter the value:");
   int  number=scan.nextInt();
  for(i=1;i<=number;i++){    
      fact=fact*i;    
  }    
  System.out.println("Factorial of "+number+" is: "+fact);    
 }  
}  