public class Main {

    static void countdown(int n) {
        if (n == 0) {
            System.out.println("Done!");
        } else {

            countdown(n - 1); 
             System.out.println(n);
             //recursive call
        }
    }
    public static void main(String[] args) {
        countdown(5);
    }
}