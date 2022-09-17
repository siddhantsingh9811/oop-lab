import java.util.Scanner;

public class index {
    public static void main(String[] args){
        int a,b,c;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no 1:");
        a = obj.nextInt();
        System.out.println("Enter no 2:");
        b = obj.nextInt();
        try{
            c = a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println(e.getMessage());
        }
    }
}
