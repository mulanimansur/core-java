

public class throwexample {



    static void checkAge(int age) throws ArithmeticException {
        if(age < 18) {
            throw new ArithmeticException("You are not old enough to vote.");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
    public static void main(String[] args) {

int age = 9;
try {
    checkAge(age);
} catch (ArithmeticException e) {
    System.out.println("Caught an exception: " + e.getMessage());
}
}
}

