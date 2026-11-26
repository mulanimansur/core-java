
class PriThread2 extends Thread {

    PriThread2(String name, int priority) {
        super(name);
        setPriority(priority);
    }

    public void run() {
        System.out.println(
            getName() + " with priority " + getPriority() + " is running"
        );
    }
}

public class priority2example{

    public static void main(String[] args) {

        PriThread2 t1 = new PriThread2("Thread 1", 3);
        PriThread2 t2 = new PriThread2("Thread 2", 7);
        PriThread2 t3 = new PriThread2("Thread 3", 5);
        PriThread2 t4 = new PriThread2("Thread 1", 7);
        PriThread2 t5  = new PriThread2("Thread 2", 2);
        PriThread2 t6 = new PriThread2("Thread 3", 6);

        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
        t6.start();
    }
}
