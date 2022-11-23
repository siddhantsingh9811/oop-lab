import java.util.Scanner;
public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string :");
        String mystr = input.next();
        System.out.println("Enter character or substring to find : ");
        String target = input.next();



        System.out.println(" First index of Substring found at : "+mystr.indexOf(target));
        System.out.println(" Last index of substring found at : "+mystr.lastIndexOf(target));
    }
}
