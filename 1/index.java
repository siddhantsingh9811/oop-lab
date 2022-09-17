import java.util.Scanner;
public class index{
    public static void main(String[] args){
        Student[] students = new Student[10];
        Scanner obj = new Scanner(System.in);
        for(int i = 0; i<10; i++){
            System.out.println("Enter name: ");
            String name = obj.nextLine();
            students[i] = new Student(name, i);
        }

        int c = 1;
        while(c!=0){
            System.out.println("Enter 1 to get student name and 0 to exit:");
            c = obj.nextInt();
            if(c == 1){
                System.out.println("Enter student roll number:");
                int i = obj.nextInt();
                try{

                    System.out.println(String.format("Student's name is: %s", students[i].getName()));
                }
                catch(ArrayIndexOutOfBoundsException e){
                    System.out.println("Array out of bounds");
                }
            }
        }
        obj.close();
    }
}
class Student{
    public String name;
    public int roll_no;
    public Student(String name, int roll_no){
        this.name = name;
        this.roll_no = roll_no;
    }
    public String getName(){
        return name;
    }
}