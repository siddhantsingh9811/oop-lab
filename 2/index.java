class Even extends Thread{
    public void run(){
        for(int i = 0; i < 10; i+=2){
            System.out.println(i);
        }
    }
}
class Odd extends Thread{
    public void run(){
        for(int i = 1; i < 10; i+=2){
            System.out.println(i);
        }
    }
}

public class index {
    public static void main(String[] args){
        Even t1 = new Even();
        Odd t2 = new Odd();
        t2.start();
        t1.start();
    }   
}
