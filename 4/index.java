import java.io.*;
import java.util.Scanner;
class collision extends Exception
{
    collision(String s)
    { super(s); }
}
public class index
{
    public static void main(String ar[])
    {
        Scanner obj = new Scanner(System.in);
        String t1=null,t2=null;
        try
        {
            System.out.println("enter the direction of vehicle1:(left/right):");
            t1 = obj.nextLine();
            System.out.println("enter the direction of vehicle2:(left/right):");
            t2 = obj.nextLine();
            if(!t1.equals(t2))
            throw new collision("truck2 has to go on "+ t1 +" direction");
        }
        catch(collision e)
        {
            System.out.println(e);
            t2=t1;
            System.out.println("the collision has been avoided by redirection truck2");
        }
        catch(Exception e)
        { System.out.println(e); }
        System.out.println("direction of truck1 :"+t1);
        System.out.println("direction of truck2 :"+t2);
    }
}