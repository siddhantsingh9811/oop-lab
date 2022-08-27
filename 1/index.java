import java.util.Scanner;

public class index{
    public static void main(String[] args){
        largest();
    }
    public static void largest(){
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter no. 1:");
        int n1 = obj.nextInt();
        System.out.println("Enter no. 2:");
        int n2 = obj.nextInt();
        System.out.println("Enter no. 3:");
        int n3 = obj.nextInt();

        if(n1>n2 && n1> n3){
            System.out.println(String.format("Largest Number is %d",n1 ));
        }        
        else if(n2>n1 && n2> n3){
            System.out.println(String.format("Largest Number is %d",n2 ));
        }        
        else if(n3>n1 && n3> n2){
            System.out.println(String.format("Largest Number is %d",n3 ));
        }
        else{
            System.out.println("All numbers are equal");
        }
        obj.close();
    }
}