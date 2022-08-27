public class index {
    public static void main(String args[]){
        Thing a = new Thing();
        a.add(1,2);
    }
}
class Thing{
    void add(int n1,int n2){
        System.out.println(n1+n2);
    }
}
