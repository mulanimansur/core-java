import java.util.Scanner;

public class Scannerexample {


public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your Name:");
    String name = sc.nextLine();
    System.out.println("Name: " + name);

    System.out.println("Enter your age:");
    String age = sc.nextLine();
    System.out.println("age: " + age);


    System.out.println("Enter your salary:");
    String salary = sc.nextLine();
    System.out.println("salary: " + salary);

    System.out.println("Are you a dev:");
    boolean isDev = sc.nextBoolean();
    System.out.println("isDev: " + isDev);


    sc.close();
}


}
