import java.util.Scanner;

class checkNum extends Exception{
    public checkNum(){
        super("Non numeric value");
    }
}
 
public class index{
    public static void main(String[] args){
        int a = 0;
        int b = 0;
        int sum = 0;
        try{
            try{

                a = Integer.parseInt(args[0]);
                b = Integer.parseInt(args[1]);
            }
            catch(Exception e){
                throw new checkNum();
            }

        }
        catch (checkNum e){
            System.out.println(e.getMessage());
        }
        sum = a+b;
        System.out.println(sum);
    }
}