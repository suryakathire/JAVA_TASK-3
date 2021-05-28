import java.util.*;
public class age {
    public static void main(String args[])
    {
        int age;
        int baby=0;
        int school=0;
        int adult=0;
        int count=0;
        Scanner scan=new Scanner(System.in);
            System.out.println("enter the age of person:");
            age=scan.nextInt();
        while(count<=15)
        {
            
            
            if(age>=0 && age<=5)
            {
                
                baby++;
            }
            else if(age>=6 &&age<=17)
            {
                school++;
            }
            else
            {
                adult++;
                count++;
            }
            
        }
        System.out.println("baby count:"+baby);
        System.out.println("school count:"+school);
        System.out.println("adult count:"+adult);
    }
}
