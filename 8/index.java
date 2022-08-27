import java.util.Scanner;
public class index {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[10];
        System.out.println("Enter 10 numbers:");
        for(int i = 0; i<10; i++){
            arr[i] = obj.nextInt();
        }
        int sum = 0;
        for (int i : arr) {
            sum += i*i;
        }
        System.out.println(String.format("sum of squares is %d", sum));
    }
    
}
