
public class sleepExample {

    public static void main(String[] args) {

        try {
            System.out.println("Program Started");

            Thread.sleep(15000);

            System.out.println("Program Resumed After 15 Seconds");

        } catch (InterruptedException e) {
            System.out.println(e);
        }
    }
}
