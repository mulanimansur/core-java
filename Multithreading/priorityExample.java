class  priThread extends  Thread{
    public void run(){
        System.out.println(Thread.currentThread().getName());
    }
}







public class priorityExample {
    public static void main(String[] args) {
        priThread t1 = new  priThread();
        priThread t2 = new  priThread();
        t1.setPriority(Thread.MIN_PRIORITY);
        t2.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
    }
    
}
