public class index {
    public static void main(String[] args){
        A a = new A();
        B b = new B();
        System.out.println(a.thing());
        System.out.println(b.thing());
    }
}
abstract class Test{
    abstract int thing();
}
class A extends Test{
    int thing(){
        return 1;
    }
}
class B extends Test{
    int thing(){
        return 2;
    }
}
