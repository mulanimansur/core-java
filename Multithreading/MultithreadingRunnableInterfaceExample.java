class MyTask implements Runnable {

    public void run() {
        System.out.println("Thread using Runnable");
    }
}

public class  MultithreadingRunnableInterfaceExample{

    public static void main(String[] args) {
    //step 1: create runnable object
     //   runnable task = new MyTask();
        MyTask task = new MyTask();

        //step 2: create thread object and pass runnable object
        Thread t1 = new Thread(task, "FCT Thread");

        //step 3: start the thread
        t1.start();

        System.out.println(t1.getName());
    }
}