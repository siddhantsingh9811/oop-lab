public class index {
    public static void main(String[] args){
        DailyWorker John = new DailyWorker("John", 50, 5);
        SalariedWorker Ron = new SalariedWorker("Ron",10);
        System.out.println(String.format("%s's weekly pay = %d",John.getName(),John.ComPay()));
        System.out.println(String.format("%s's weekly pay = %d",Ron.getName(),Ron.ComPay()));
    }
}
class Worker{
    protected String name;
    protected int rate;
    public String getName(){
        return this.name;
    }
}
class DailyWorker extends Worker{
    private int days;
    public DailyWorker(String name, int rate, int days){
        this.name = name;
        this.rate = rate;
        this.days = days;
    }
    public int ComPay(){
        int pay = days*rate;
        return pay;
    }
}
class SalariedWorker extends Worker{
    public SalariedWorker(String name, int rate){
        this.name = name;
        this.rate = rate;
    }
    public int ComPay(){
        int pay = 40*rate;
        return pay;
    }
}