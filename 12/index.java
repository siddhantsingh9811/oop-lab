public class index {
    public static void main(String[] args){
        volume(10);
        volume(10,11,12);
    }
    public static void volume(int a){
        System.out.print(String.format("Volume is %d", a*a*a));
    }
    public static void volume(int l, int b, int h){
        System.out.print(String.format("Volume is %d", l*b*h));
    }
}
