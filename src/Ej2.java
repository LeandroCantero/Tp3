public class Ej2 {
    public static void main (String [] args){
        int n;
        int f = fibonacci(8);
        System.out.println(f);
    }

    public static int fibonacci(int n){
        if (n == 1 || n == 2){
            return 1;
        }
        else{
            return fibonacci(n-1) + fibonacci(n-2);
        }

    }


}
