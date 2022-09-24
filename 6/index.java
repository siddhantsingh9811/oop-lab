public class index {
    public static void main(String[] args){
        Test.StaticMethod();
        Test a = new Test();
    }
}
class Parent{
    final int x;
    final int y;
    public Parent(){
        x = 10;
        y = 20;
    }
}
class Test extends Parent{
    public Test(){
        super();
        System.out.println(x);
        System.out.println(y);
    }
    public static void StaticMethod(){
        System.out.println("This can be run without initializing an instance of Test");
    }

}