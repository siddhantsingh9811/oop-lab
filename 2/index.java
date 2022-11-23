import java.util.Scanner;
public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String : ");
        String str = input.next();
        StringBuffer myBuffer = new StringBuffer(str);

        for(int i =0;i<myBuffer.length();i++){
            char ch = myBuffer.charAt(i);
            if(myBuffer.charAt(i) >= 'a' && myBuffer.charAt(i)<='z'){
            int ascii = (int)ch - 32;
            char chn = (char)ascii;
            myBuffer.setCharAt(i,chn);
        }
        }

        System.out.print(myBuffer);
    }
}
