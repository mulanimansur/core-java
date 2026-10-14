class Employee {
String name;
double salary;

// Parameterized Constructor
Employee(String name, double salary) {
    this.name = name;
    this.salary = salary;
    System.out.println("Employee constructor called");
}

// Copy Constructor
Employee(Employee emp) {
    this.name = emp.name;
    this.salary = emp.salary;
    System.out.println("Copy Employee constructor called");
}

// Display Details
void details() {
    System.out.println("Name: " + name + ", Salary: " + salary);
}


}

public class Main {
public static void main(String[] args) {


    Employee obj1 = new Employee("Omkar", 25000);

    Employee obj2 = new Employee(obj1);


    //  obj1.details();
    // obj2.details();

obj2.name = "rahul";

    obj1.details();//omkar
    obj2.details();//rahul
}


}
