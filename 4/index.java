import java.util.Scanner;
public class index {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a String ");
        String mystr = input.next();
        int count = 0;
        boolean flag = false;
        // finding all occurances of 'a' OR 'A' in the string
        System.out.print("indexes of 'a' are : ");
        for(int i = 0;i<mystr.length();i++){
            if(mystr.charAt(i) == 'a' || mystr.charAt(i) == 'A'){
                flag = true;
                System.out.print(i+" ,");
                count++;
            }
        }
        System.out.println();
        if(flag == false){
            System.out.println("none");
        }

        System.out.println("Number of occurances of 'a' are : " + count);
    }
}
