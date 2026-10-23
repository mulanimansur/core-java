
interface vehicle{
    void start();
    void stop();

}

class car implements vehicle{
    public void start(){

    System.out.println("car is started");
    }

     public void stop(){

    System.out.println("car is stopped");
    }

}

class Interfaceexample{

public static void main(String[] args) {


    car obj = new car();
    obj.start();
    obj.stop();
    
}
}


