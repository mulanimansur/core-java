

class MyThread extends Thread{
    public void run(){
        System.out.println("MyThread id running");
    }
}




public class MultithreadingDemo{

    public static void main(String[] args) {
      MyThread obj = new MyThread(); 
       //  obj.start(); or
      obj.start();
    

      Thread t1 = new Thread("MyThread1");
      t1.start();

      System.out.println(t1.getName());
    }
}