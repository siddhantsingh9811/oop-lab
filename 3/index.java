import java.util.Arrays;
import java.util.Scanner;
public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String mystr = input.next();
        char[] char_arr = mystr.toCharArray();
        for(int i =0;i<char_arr.length;i++){
            if(char_arr[i] >= 'a' && char_arr[i]<='z'){
                char_arr[i] = (char)((int)char_arr[i] - 32);
            }
        }

       String res = new String(char_arr);
        System.out.println(res);
    }

}
