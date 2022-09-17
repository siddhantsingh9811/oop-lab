import java.util.Scanner;

public class index {
    public static void main(String[] args){
        int a,b;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no 1:");
        a = obj.nextInt();
        System.out.println("Enter no 2:");
        b = obj.nextInt();
        try{
            float c = Float.valueOf(a)/Float.valueOf(b);
            System.out.println(c);

        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
