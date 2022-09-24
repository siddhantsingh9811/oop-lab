public class index {
    public static void main(String[] args){
        Test.main();
    }
}
interface I1{
    int x = 1;
}
interface I2{
    int y = 2;
}
class Test implements I1, I2{
    public static void main(){
        System.out.println(x);
        System.out.println(y);

    }

}