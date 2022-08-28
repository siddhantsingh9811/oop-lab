package Balance;

public class Account {
    private int balance;
    private String name;
    public Account(int balance, String name){
        this.balance = balance;
        this.name = name;
    }
    public void DisplayBalance(){
        System.out.println(String.format("Your balance is: %d", balance));
    }    
}
