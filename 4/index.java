public class index {
    
}
interface A{
    int division(int a);
    int modulus(int a);
}
class C implements A{
    @Override
    public int division(int a){
        return a/2;
    }

    @Override
    public int modulus(int a){
        return a%2;
    }
}