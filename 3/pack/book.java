package pack;

public class book {
    public String name;
    public int price;
    public book(String name, int price){
        this.name = name;
        this.price = price;
    }
    public void getDetails(){
        System.out.println(String.format("Name: %s\nPrice: %d",this.name, this.price));
    }
}
