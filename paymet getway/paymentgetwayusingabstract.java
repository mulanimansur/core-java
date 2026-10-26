
import java.util.Scanner;

// Abstract class
abstract class Ipayment {

    abstract void PaymentProcess(double amount);

    abstract void generateReceipt();
}

// Credit Card Payment
class CreditCardPayment extends Ipayment {

    String cardNumber;

    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    @Override
    void PaymentProcess(double amount) {
        System.out.println("Card payment: Rs " + amount
                + " using card " + cardNumber);
    }

    @Override
    void generateReceipt() {
        System.out.println("Credit card receipt generated.");
    }
}

// UPI Payment
class UpiPayment extends Ipayment {

    String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }

    @Override
    void PaymentProcess(double amount) {
        System.out.println("UPI payment: Rs " + amount
                + " using UPI ID " + upiId);
    }

    @Override
    void generateReceipt() {
        System.out.println("UPI receipt generated.");
    }
}

// Net Banking Payment
class Netbanking extends Ipayment {

    String userId;

    public Netbanking(String userId) {
        this.userId = userId;
    }

    @Override
    void PaymentProcess(double amount) {
        System.out.println("Netbanking payment: Rs "
                + amount + " through user ID " + userId);
    }

    @Override
    void generateReceipt() {
        System.out.println("Netbanking receipt generated.");
    }
}

// Payment Service
class PaymentService {

    private Ipayment payment;

    public PaymentService(Ipayment payment) {
        this.payment = payment;
    }

    public void executePayment(double amount) {
        payment.PaymentProcess(amount);
        payment.generateReceipt();
    }
}

// Main Class
public class paymentgetwayusingabstract {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Select Payment Method:");
        System.out.println("1. Credit Card");
        System.out.println("2. UPI");
        System.out.println("3. Net Banking");

        System.out.print("Enter your choice: ");
        int choice = sc.nextInt();

        System.out.print("Enter amount: ");
        double amount = sc.nextDouble();

        sc.nextLine();

        Ipayment payment;

        switch (choice) {

            case 1:
                System.out.print("Enter Credit Card Number: ");
                String cardNumber = sc.nextLine();

                payment = new CreditCardPayment(cardNumber);
                break;

            case 2:
                System.out.print("Enter UPI ID: ");
                String upiId = sc.nextLine();

                payment = new UpiPayment(upiId);
                break;

            case 3:
                System.out.print("Enter User ID: ");
                String userId = sc.nextLine();

                payment = new Netbanking(userId);
                break;

            default:
                System.out.println("Invalid choice!");
                sc.close();
                return;
        }

        PaymentService service = new PaymentService(payment);

        service.executePayment(amount);

        sc.close();
    }
}

