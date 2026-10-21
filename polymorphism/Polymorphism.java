public class Polymorphism {


public static void main(String[] args) {

    calculator obj = new calculator();

    System.out.println(obj.add(10, 10));
    System.out.println(obj.add(10, 10, 10));

    obj.add(10, 10);
    obj.add(10, 10, 10);
}


}

class calculator {


public int add(int a, int b) {
    return a + b;
}

public int add(int a, int b, int c) {
    return a + b + c;
}

public double addDouble(double a, double b) {
    return a + b;
}




}
