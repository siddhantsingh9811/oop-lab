public class index {
    public static void main(String[] args){
        Rectangle a = new Rectangle(10);
        Rectangle b = new Rectangle(10,11);
    }
}
class Rectangle{
    public Rectangle(int a){
        System.out.println(String.format("This is a square with side %d",a));
    }
    public Rectangle(int l, int b){
        System.out.println(String.format("This is a rectangle with length %d and breath %d",l,b));
    }
}
