interface SharedData{
    final int c1 = 30;
    final int c2 = 35;
    final int c3 = 35;
}
public class index implements SharedData{
    public static void main(String[] args){
        System.out.println(c1+c2);
    }
}
class DependentClass implements SharedData{
    public int method(){
        return c1+c2*c3;
    }
}


