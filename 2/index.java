public class index {

}
interface A{
    void meth1();
    void meth2();
}
class MyClass implements A{
    @Override
    public void meth1(){
        System.out.println("This is meth1");
    }
    @Override
    public void meth2(){
        System.out.println("This is meth2");
    }
}
