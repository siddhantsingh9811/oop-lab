import java.util.Scanner;
public class index {
    public static void main(String args[]){
        System.out.println("Choose Operation(+, -, *, /):");
        Scanner obj = new Scanner(System.in);
        char choice = obj.nextLine().charAt(0);
        System.out.println("Enter first no.: ");
        int n1 = obj.nextInt();
        System.out.println("Enter second no.: ");
        int n2 = obj.nextInt();
        obj.close();
        switch (choice) {
            case '+':
                add(n1,n2);
                break;
        
            case '-':
                subtract(n1,n2);
                break;
        
            case '*':
                multiply(n1, n2);
                break;
        
            case '/':
                divide(n1, n2);
                break;
        
            default:
                System.out.println("Improper selection!");
                break;
        }
    }
    static void add(int n1, int n2){
        System.out.println(n1+n1);
    }
    static void subtract(int n1, int n2){
        System.out.println(n1-n1);
    }
    static void divide(int n1, int n2){
        System.out.println(n1/n1);
    }
    static void multiply(int n1, int n2){
        System.out.println(n1*n1);
    }
    
}
