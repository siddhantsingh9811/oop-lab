public class index {
    public static void main(String[] args){
        
    }
}
class Player{
    public int age;
    public String name;

    public void getName(){
        System.out.println(String.format("Player Name: %s",name));
    }
    public void getAge(){
        System.out.println(String.format("Player Age: %d",age));
    }
}
class Cricket_Player extends Player{
    public String sport = "Cricket";
    public void getSport(){
        System.out.println(String.format("Player Sport: %s",sport));
    }
}
class Hockey_Player extends Player{
    public String sport = "Hockey";
    public void getSport(){
        System.out.println(String.format("Player Sport: %s",sport));
    }
}
class Football_Player extends Player{
    public String sport = "Football";
    public void getSport(){
        System.out.println(String.format("Player Sport: %s",sport));
    }
}