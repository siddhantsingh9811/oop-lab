public class index{
    public static void main(String args[]){  
        System.out.println("Sum or arguments is:");
        int sum = 0;
        for (String i : args) {
            sum = sum+Integer.parseInt(i);
        }
        System.out.println(sum);        
    }
}