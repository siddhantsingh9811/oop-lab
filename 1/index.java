public class index{
    public static void main(String[] args){

    }
}
interface test{
    int square(int a);
}
class arithmetic_class implements test{

    @Override
    public int square(int a) {
        return a*a;
    }  
} 
class ToTestInt{
    public static void main(){
        arithmetic_class a = new arithmetic_class();
        int result = a.square(10);
        System.out.println(result);
    }
    
}