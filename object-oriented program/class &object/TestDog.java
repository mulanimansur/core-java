class Dog {


String name;

Dog() {
    System.out.println("Dog object created");
}

void setName(String name) {
    this.name = name;
    System.out.println("Dog name is: " + this.name);
}


}

public class TestDog {


public static void main(String args[]) {

    Dog d = new Dog();

    d.setName("Tommy");
}

}
