public class index {
    public static void main(String[] args){
        Ordinary call1 = new Ordinary(20);
        Urgent call2 = new Urgent(23);
        Lightning call3 = new Lightning(15);

        System.out.println(String.format("Call 1 cost: %d",call1.getCharge()));
        System.out.println(String.format("Call 2 cost: %d",call2.getCharge()));
        System.out.println(String.format("Call 3 cost: %d",call3.getCharge()));
    }
}
class Call{
    protected int rate;
    protected int duration;
    protected int charge;
    public int getCharge(){
        return charge;
    }
}

class Ordinary extends Call{
    public Ordinary(int duration){
        this.rate = 10;
        this.duration = duration;
        this.charge = rate*duration;
    }
}
class Urgent extends Call{
    public Urgent(int duration){
        this.rate = 25;
        this.duration = duration;
        this.charge = rate*duration;
    }
}
class Lightning extends Call{
    public Lightning(int duration){
        this.rate = 50;
        this.duration = duration;
        this.charge = rate*duration;
    }
}