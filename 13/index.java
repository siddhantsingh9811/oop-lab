public class index {
    public static void main(String[] args){
        Test a = new Test();
        Test b = new Test(10,11);
        System.out.println(String.format("a: %d\n b: %d",a.a,a.b));
        System.out.println(String.format("a: %d\n b: %d",b.a,b.b));
    }
}
class Test{
    public int a;
    public int b;
    public Test(){
        this.a = 0;
        this.b = 0;
    }
    public Test(int a, int b){
        this.a = a;
        this.b = b;
    }
}
