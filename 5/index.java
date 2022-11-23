import java.util.Scanner;
public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter an integer :");
        int a = input.nextInt();
        //Casting (auto-boxing) int to integer
        Integer wrap_a = Integer.valueOf(a);
        System.out.println(a + " is a " + wrap_a.getClass().getSimpleName());
        //casting Wrapper object (Integer) to String
        String str = String.valueOf(wrap_a);
        System.out.println(wrap_a + "is a  " + str.getClass().getSimpleName());
       //casting String to int
        int b = Integer.valueOf(str);
        System.out.println(b + " is a int");
        //int to String
        String str1 = String.valueOf(b);
        System.out.println(str1 +"is a " + str1.getClass().getSimpleName());
        //String to integer
        Integer wrap_1 = Integer.valueOf(str1);
        System.out.println(wrap_1+" is a "+str1.getClass().getSimpleName());
        //Integer to int
        int c = wrap_1.intValue();
        System.out.println(c+ "is a int");
    }
}
