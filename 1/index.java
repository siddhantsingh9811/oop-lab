public class index{
    public static void main(String[] args){
        Test parent = new Test();
        TestOver child = new TestOver();
        
        parent.a(1,2);
        child.a(1, 2); // public method of parent can be used
        child.b(1,2) // private method of parent cannt be used hence there is an error
    }
}
class Test{
    // public method - can be accessed 
    public void a(int a, int b){
        System.out.println(a+b);
    }
    // private method - cannot be accessed 
    private void b(int a, int b){
        System.out.println(a*b);
    }
}
class TestOver extends Test{
    public void main(){
        System.out.println("hi");
    }
}