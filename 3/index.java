public class index{
    public static void main(String args[]){  
        fibonachi(5);
    }
    public static void fibonachi(int n){
        System.out.println("Fibonachi Series:");
        if(n > 2){
            System.out.println(0);
            System.out.println(1);
            System.out.println(1);
            int a = 1;
            int b = 1;
            int temp;
            for(int i = 0; i<n-3; i++){
                temp = b;
                b = a+b;
                a = temp;
                System.out.println(b);
            }
        }
        else{
            switch (n) {
                case 1:
                    System.out.println(0);
                    break;
                case 2:
                    System.out.println(1);
                    break;
                default:
                    break;
            }
        }
    }
}