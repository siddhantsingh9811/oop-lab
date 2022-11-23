class T1 extends Thread{
    public void run(){
        System.out.println("Thread is running");
    }
}
class T2 implements Runnable{
    public void run(){
        System.out.println("Thread is running");
    }
}
public class index {
    public static void main(String[] args){
        T1 thread1 = new T1();
        thread1.start();
        T2 t2 = new T2();
        Thread thread2 = new Thread(t2);
        thread2.start();
    }
}
