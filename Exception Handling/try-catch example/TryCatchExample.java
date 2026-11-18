public class TryCatchExample {

    public static void main(String[] args) {

        try {
            int arr[] = {1, 2, 3};

            System.out.println(arr[4]);

        } catch (ArrayIndexOutOfBoundsException e) {

            System.out.println("Array index out of bounds exception occurred: " + e.getMessage());

        } finally {

            System.out.println("Finally block executed.");

        }
    }
}