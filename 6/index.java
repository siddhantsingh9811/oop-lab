import java.util.Scanner;
public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a float : ");
        float a = input.nextFloat();
        //converting float to FLOAT
        Float wrap_a = Float.valueOf(a);
        System.out.println(wrap_a +" is a " + wrap_a.getClass().getSimpleName());
        //converting Float to string
        String str = String.valueOf(wrap_a);
        System.out.println(str + " is a " + str.getClass().getSimpleName());
        //String to float
        float b = Float.valueOf(str);
        System.out.println(b+" is a float");
        //float into string
        String c = String.valueOf(b);
        System.out.println(c+" is a "+c.getClass().getSimpleName());
        //convert String to Float
        Float wrap_b = Float.valueOf(c);
        System.out.println(wrap_b +" is a "+wrap_b.getClass().getSimpleName());
        //converting Float to float
        float d = wrap_b.floatValue();
        System.out.println(d +" is a float");
    }
}
