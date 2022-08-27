import java.util.Arrays;
import java.util.Scanner;
public class index {
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int[] marks = new int[10];
        System.out.println("Enter marks:");
        for(int i = 0; i<10; i++){
            marks[i] = obj.nextInt();
        }
        Arrays.sort(marks);
        System.out.println("MARKS | GRADE");
        for (int i : marks) {
            if(i<40){
                System.out.println(String.format("  %d  | FAIL",i));
            }
            else if(i>40 && i<51){
                System.out.println(String.format("  %d  | PASS",i));
            }
            else if(i>50 && i<76){
                System.out.println(String.format("  %d  | MERIT",i));
            }
            else if(i>75){
                System.out.println(String.format("  %d  | DISTINCTION",i));
            }
        }
    }
}
