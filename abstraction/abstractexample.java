public class abstractexample {


public static void main(String[] args) {

    vehicle obj;

    obj = new bike();
    obj.start();
    obj.display();

    obj = new car();
    obj.start();
    obj.display();
    
}


} 

abstract class vehicle {


int noofwheels;

void display() {
    System.out.println("Vehicle has " + noofwheels + " wheels");
}

abstract void start();


}

class car extends vehicle {


@Override
void start() {
    noofwheels = 4;
    System.out.println("Car starts with key");
}


}

class bike extends vehicle {


@Override
void start() {
    noofwheels = 2;
    System.out.println("Bike starts with kick");
}


}
