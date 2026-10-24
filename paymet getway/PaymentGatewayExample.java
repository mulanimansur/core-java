import java.util.Scanner;

public class PaymentGatewayExample{
    public static void main(String[] args) {


        Scanner sc = new Scanner (System.in);

        System.out.println("select payment Method : 1.Credit card 2. UPi 3. Net banking");

        int choice = sc. nextInt();
        System.out.println("Enter amount");

        double amount = sc.nextDouble();

        sc.nextLine();
        Ipayment payment;

        switch(choice){
            case 1:
                System.out.println("Enter Credit Number ");
                String cardnumber = sc.nextLine();
                payment = new CreditCardPayment(cardnumber);
                break;

             case 2:
                  System.out.println("Enter upiId ");
                String upiId = sc.nextLine();
                payment = new UpiPayment(upiId);
                break;

                case 3:
                  System.out.println("Enter userId ");
                String userId = sc.nextLine();
                payment = new Netbanking(userId);
                break;

                default:
                    System.out.println("Invalid choice!!");
                    sc.close();
                    return ;
        }

        PaymentService  service = new PaymentService(payment);
      
        
    }
}

interface Ipayment {
    void PaymentProcess(double amount);
    void generateReceipt();
}

class CreditCardPayment implements Ipayment {
    String cardNumber;


    public CreditCardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }
    @Override 
    public void PaymentProcess(double amount) {
        System.out.println("Card payment: Rs " + amount + " using card " + cardNumber);
    }
    @Override 
    public void generateReceipt() {
        System.out.println("Credit card receipt generated.");
    }
}

class UpiPayment implements Ipayment {
    String upiId;

    public UpiPayment(String upiId) {
        this.upiId = upiId;
    }
    @Override 
    public void PaymentProcess(double amount) {
        System.out.println("UPI payment: Rs " + amount + " using UPI ID " + upiId);
    }

    @Override 
    public void generateReceipt() {
        System.out.println("UPI receipt generated.");
    }
}

class Netbanking implements Ipayment {
    String bankName;

    public Netbanking(String bankName) {
        this.bankName = bankName;
    }
    @Override 
    public void PaymentProcess(double amount) {
        System.out.println("Netbanking payment: Rs " + amount+ " through " + bankName);
    }
    @Override 
    public void generateReceipt() {
        System.out.println("Netbanking receipt generated.");
    }
}

class PaymentService{
    private Ipayment payment;

    public PaymentService(Ipayment payment){
        this.payment = payment;
    }

    public void executePayment(double amount){
        payment.PaymentProcess(amount);
        payment.generateReceipt();
    }

}